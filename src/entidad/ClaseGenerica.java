package entidad;

import capadenegocio.GestorPrincipal;
import javax.swing.JOptionPane;

public class ClaseGenerica<T> {
    ClaseGenerica<Libro>  libro;
    ClaseGenerica<LibrosPrestados> libprestado;

    
    public ClaseGenerica() {
    
    }

    public Libro buscar(String isbn) {

        Libro libro = GestorPrincipal.getGestorLibro().buscar(isbn);
        if (libro == null) {
            JOptionPane.showMessageDialog(null, "El libro con el isbn " + isbn + " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            return libro;
        }

        return null;
    }
       
}
