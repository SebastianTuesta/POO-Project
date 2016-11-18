package capadenegocio;

import entidad.BaseDeDatos;
import entidad.Bibliotecario;
import entidad.Usuario;
import java.io.Serializable;
import util.UtilArchivo;

/**
 *
 * @author Invitado
 */
public abstract class Gestor {

    protected static BaseDeDatos baseDeDatos;

    static {
        /*Verificamos si podemos cargar datos desde el archivo*/
        Serializable archivoLeido = UtilArchivo.leerArchivo("C://matricula//matricula.fisi");
        if (archivoLeido != null && archivoLeido instanceof BaseDeDatos) {
            baseDeDatos = (BaseDeDatos) archivoLeido;
        } else {
            baseDeDatos = new BaseDeDatos();
            Bibliotecario bibliotecario = new Bibliotecario();
            bibliotecario.setNombreBibliotecario("bibliotecario");
            bibliotecario.setPassword("fisi");
            baseDeDatos.getLsBibliotecarios().add(bibliotecario);
        }
    }
}
