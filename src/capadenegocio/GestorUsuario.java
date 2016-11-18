package capadenegocio;

import static capadenegocio.Gestor.baseDeDatos;
import entidad.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Invitado
 */
public class GestorUsuario extends Gestor implements Interface {
    
    public Usuario buscar(String codigo) {
        Usuario usuario = null;

        ArrayList<Usuario> lsUsuarios = baseDeDatos.getLsUsuarios();

        /*Buscamos al alumno en la tabla*/
        Usuario usuarioAux = null;
        for (int i = 0; i < lsUsuarios.size(); i++) {
            /*Obtenemos el alumno "i"*/
            usuarioAux = lsUsuarios.get(i);

            /*Verificamos la condición de búsqueda*/
            if (codigo.trim().equalsIgnoreCase(usuarioAux.getCodigo()) == true) {
                usuario = usuarioAux;
                i = lsUsuarios.size() + 1;
            }
        }
        return usuario;
    }

    public ArrayList<Usuario> listar() {
        /*Retornamos la lista de alumnos*/
        return baseDeDatos.getLsUsuarios();
    }

    public boolean registrarUsuario(Usuario usuario) {
        boolean estado = false;
        Usuario usuarioAux = buscar(usuario.getCodigo());
        if (usuarioAux == null) {
            /*Registramos al usuario en la base de datos*/
            baseDeDatos.getLsUsuarios().add(usuario);
            /*Actualizamos el estado*/
            estado = true;
        }
        return estado;
    }

   

}
