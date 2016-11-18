package entidad;

import java.io.Serializable;


public class Libro implements Serializable{
    
    private String isbn;
    private String nombre;
    private String autor;
    private String tipo_de_libro;
    private String facultad;

    public Libro(){
        
        
    }
    
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo_de_libro() {
        return tipo_de_libro;
    }

    public void setTipo_de_libro(String tipo_de_libro) {
        this.tipo_de_libro = tipo_de_libro;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Libro: "  + nombre;
    }
   
    
    
}
