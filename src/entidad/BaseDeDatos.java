package entidad;


import java.io.Serializable;
import java.util.ArrayList;
import util.UtilArchivo;


public class BaseDeDatos implements Serializable{
    private ArrayList<Usuario> lsUsuarios;
    private ArrayList<Bibliotecario> lsBibliotecarios;
    private ArrayList<Libro> lsLibros;
    private ArrayList<Facultad> lsFacultades;
    private ArrayList<Libro> lsLibrosprestados;
    
    /*Al instanciar la base de datos debemos también instanciar las tablas*/
    public BaseDeDatos(){
      lsBibliotecarios = new ArrayList<Bibliotecario>();
      lsFacultades = new ArrayList<Facultad>();
      lsLibros = new ArrayList<Libro>();
      lsUsuarios = new ArrayList<Usuario>();
      lsLibrosprestados = new ArrayList<Libro>();
    }

    
    
    public boolean guardarCambios(){
        return UtilArchivo.guardarArchivo("C:\\proyecto\\biblioteca.fisi", this);
    }
    
    public ArrayList<Usuario> getLsUsuarios() {
        return lsUsuarios;
    }

    public void setLsUsuarios(ArrayList<Usuario> lsUsuarios) {
        this.lsUsuarios = lsUsuarios;
    }

    public ArrayList<Bibliotecario> getLsBibliotecarios() {
        return lsBibliotecarios;
    }

    public void setLsBibliotecarios(ArrayList<Bibliotecario> lsBibliotecarios) {
        this.lsBibliotecarios = lsBibliotecarios;
    }

    public ArrayList<Libro> getLsLibros() {
        return lsLibros;
    }

    public void setLsLibros(ArrayList<Libro> lsLibros) {
        this.lsLibros = lsLibros;
    }

    public ArrayList<Facultad> getLsFacultades() {
        return lsFacultades;
    }

    public void setLsFacultades(ArrayList<Facultad> lsFacultades) {
        this.lsFacultades = lsFacultades;
    }

    public ArrayList<Libro> getLsLibrosprestados() {
        return lsLibrosprestados;
    }

    public void setLsLibrosprestados(ArrayList<Libro> lsLibrosprestados) {
        this.lsLibrosprestados = lsLibrosprestados;
    }

    
    
    
}
