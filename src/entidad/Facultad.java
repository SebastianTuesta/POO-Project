package entidad;


import java.io.Serializable;
import java.util.ArrayList;


public class Facultad implements Serializable{
 
    private String nombre;
    private ArrayList<Usuario> lsUsuarios;
    private ArrayList<Libro> lsLibros;
    
    public Facultad() {
        lsUsuarios = new ArrayList();
        lsLibros = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getLsUsuarios() {
        return lsUsuarios;
    }

    public void setLsUsuarios(ArrayList<Usuario> lsUsuarios) {
        this.lsUsuarios = lsUsuarios;
    }

    public ArrayList<Libro> getLsLibros() {
        return lsLibros;
    }

    public void setLsLibros(ArrayList<Libro> lsLibros) {
        this.lsLibros = lsLibros;
    }
    
    
}
