
import java.lang.String;
import java.util.*;

/**
 *
 * @author Miguel Martinez
 * @version 0
 */
public class Nivel {

    //Variables
    private String nombre;
    private Set palabras;

    //Constructor
    public Nivel() {

    }

    //gets y sets
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public Set getSet() {
        return this.palabras;
    }

    public void setSet(Set value) {
        this.palabras = value;
    }

}
