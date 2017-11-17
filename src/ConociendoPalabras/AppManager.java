package ConociendoPalabras;


import java.lang.String;
import java.util.*;
import java.sql.*;
import javax.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * This class (Singleton) is meant to manager data across the lifetime of the
 * app
 *
 * @author Miguel Martinez
 */

public class AppManager {

    public static AppManager instance = null;
    
    private Set<Jugador> equipos;
    private EnumNivel nivel;
    private String categoria;
    
    private List<Palabra> palabras;
    
    private int xRondas;
    
    //BD
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    

    private AppManager() {
        this.equipos = new HashSet<Jugador>();
        
        this.nivel = EnumNivel.NINGUNO;
        
        this.palabras = new ArrayList();
        
        this.xRondas = 5;
        
        this.conn = BDmanager.ConnectDB();
    }

    public List<Palabra> getPalabras(){
        return this.palabras;
    }
    
    public static AppManager getInstance() {

        if (instance == null) {
            instance = new AppManager();
        }

        return instance;
    }
    
    public static void setInstance() {

        if (instance == null) {
            instance = new AppManager();
        }
    }
    
    //VENTANA EQUIPOS y RESULTADOS
    
    public void addJugador(String jug_){
        
        Jugador j = new Jugador(jug_);
        
        if (!equipos.contains(j)) {
            equipos.add(j);
        }
    }
    
    public void addPunto(String jug_){
        
        Jugador j = new Jugador(jug_);
        Iterator it = this.equipos.iterator();
        
        while(it.hasNext()){
            Jugador ji = (Jugador) it.next();
            
            if (ji.equals(j)) {
                ji.addPoint();
            }
        }
    }
    
    public Set<Jugador> resultados(){
        return this.equipos;
    }
    
    //VENTANA NIVEL
    
    public void setNivel(EnumNivel niv_){
        this.nivel = niv_;
    }
    
    public EnumNivel getNivel(){
        return this.nivel;
    }
    
    //VENTANA CATEGORIA
    
    public void setCategoria(String cat_){
        this.categoria = cat_;
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    //PRE-JUEGO
    public void getPalabrasBD(){
    
        //Aqui deberia agregarse el DONDE las palabras sean de 
        //nivel TAL y categoria TAL
        //String query = "select * from Palabras where ? and ?";
        
        this.palabras.clear();
        String query = "select * from testtable";
        
        try{
            pst = conn.prepareStatement(query);
            //Para agregar los parametros '?'
            //pst.setInt(1, xRondas);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                String p = rs.getString(1);
                String u = rs.getString(2);
                
                this.palabras.add(new Palabra(p, u));
                System.out.println(p);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //aqui seria acomodar la lista de palabras aleatoriamente de manera que tenga la misma cantidad de xRondas
    
    //JUEGO
    
    public boolean isCorrect(String pal_) {
        
        Iterator i = this.palabras.iterator();
        
        while(i.hasNext()){
            Palabra pali = (Palabra) i.next();
            
            if (pali.getNombre() == pal_) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String args[]){
        
        AppManager.setInstance();
        
        AppManager.instance.getPalabrasBD();
        
        
    }

}
