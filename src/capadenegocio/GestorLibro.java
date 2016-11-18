package capadenegocio;

import static capadenegocio.Gestor.baseDeDatos;
import entidad.Libro;

import java.util.ArrayList;

public class GestorLibro extends GestorPrincipal implements Interface {

    public Libro buscar(String isbn) {
        Libro libro = null;

        ArrayList<Libro> lsLibros = baseDeDatos.getLsLibros();

        /*Buscamos al libro en la tabla*/
        Libro libroAux = null;
        for (int i = 0; i < lsLibros.size(); i++) {
            /*Obtenemos el libro "i"*/
            libroAux = lsLibros.get(i);

            /*Verificamos la condición de búsqueda*/
            if (isbn.trim().equalsIgnoreCase(libroAux.getIsbn()) == true) {
                libro = libroAux;
                i = lsLibros.size() + 1;
            }
        }
        return libro;
    }

    public Libro buscarLibroPrestado(String isbn) {
        Libro libro = null;

        ArrayList<Libro> lsPrestados = baseDeDatos.getLsLibrosprestados();

        /*Buscamos al libro en la tabla*/
        Libro libroAux = null;
        for (int i = 0; i < lsPrestados.size(); i++) {
            /*Obtenemos el libro "i"*/
            libroAux = lsPrestados.get(i);

            /*Verificamos la condición de búsqueda*/
            if (isbn.trim().equalsIgnoreCase(libroAux.getIsbn()) == true) {
                libro = libroAux;
                i = lsPrestados.size() + 1;
            }
        }
        return libro;
    }

    public ArrayList<Libro> listar() {
        /*Retornamos la lista de libros*/
        return baseDeDatos.getLsLibros();
    }

    public ArrayList<Libro> listarPrestados() {
        /*Retornamos la lista de libros*/
        return baseDeDatos.getLsLibrosprestados();
    }
    
    public boolean agregarLibroPrestado(Libro libro) {
        boolean estado = false;
        Libro libroAux = buscarLibroPrestado(libro.getIsbn());
        if (libroAux == null) {
            /*Registramos al libro en la base de datos*/
            baseDeDatos.getLsLibrosprestados().add(libro);

            /*Actualizamos el estado*/
            estado = true;
        }
        return estado;
    }
    
    public boolean agregarLibro(Libro libro) {
        boolean estado = false;
        Libro libroAux = buscar(libro.getIsbn());
        if (libroAux == null) {
            /*Registramos al libro en la base de datos*/
            baseDeDatos.getLsLibros().add(libro);

            /*Actualizamos el estado*/
            estado = true;
        }
        return estado;
    }
    
}
