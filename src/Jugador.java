
import java.lang.String;

/**
 *
 * @author Miguel Martinez
 * @version 0
 */
public class Jugador {

    private String nombre;
    private int puntaje;

    //constructor
    public Jugador() {

    }

    //gets y sets
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int value) {
        this.puntaje = value;
    }

}
