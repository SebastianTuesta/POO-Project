

package capadenegocio;

import entidad.Usuario;
import entidad.Bibliotecario;
import entidad.Facultad;
import entidad.Libro;
import java.util.ArrayList;

/**
 *
 * @author Invitado
 */
public class GestorBibliotecario extends Gestor{
    
    
    public boolean iniciarSesion(Bibliotecario bibliotecario){
         boolean estado = false;
              /*Buscamos en la base de datos la existencia del usuario*/
        Bibliotecario bibliotecarioAux = null;
        ArrayList<Bibliotecario> lsBibliotecarios = baseDeDatos.getLsBibliotecarios();
        for(int i=0; i<lsBibliotecarios.size(); i++){
            /*Obtenemos el usuario "i"*/
            bibliotecarioAux = lsBibliotecarios.get(i);
            
            /*Verificamos la condición*/
            if(
                bibliotecarioAux.getNombreBibliotecario().trim().equals(bibliotecario.getNombreBibliotecario()) == true &&
                bibliotecarioAux.getPassword().trim().equals(bibliotecario.getPassword()) == true
            ){
                estado = true;
                i = lsBibliotecarios.size()+1;
            }
        }
         
        return estado;
    }
    
    public boolean asignarle_usuario_aFacultad ( String nombreFacultad , String codUsuario ){
        boolean estado = false;
        Facultad facultad = GestorPrincipal.getGestorFacultad().buscar(nombreFacultad);
     if(facultad != null){
            
            /*Buscamos al usuario según su código, usando el "GestorUsuario"*/
            Usuario usuario = GestorPrincipal.getGestorUsuario().buscar(codUsuario);
            if(usuario != null){
                
                /*Verificamos que el alumno no esté registrado ya en el curso*/
                boolean asociadoanteriormente = false;
                Usuario usuarioAux = null;
                
                /*Lista de usuarios en la facultad donde estan actualmente */
                ArrayList<Usuario> lsUsuariosdeLaFacultad = facultad.getLsUsuarios();
                for(int i=0; i<lsUsuariosdeLaFacultad.size(); i++){
                    /*Obtenemos el usuario "i" de la facultad*/
                    usuarioAux = lsUsuariosdeLaFacultad.get(i);
                    
                    /*Verificamos la condición de búsqueda*/
                    if(usuarioAux.getCodigo().trim().equalsIgnoreCase(codUsuario) == true){
                        asociadoanteriormente = true;
                        i = lsUsuariosdeLaFacultad.size()+1;
                    }
                }
                
                if(asociadoanteriormente == false){
                    /*Añadimos al usuario en la facultad*/
                    
                    /*Registramos el usuario en la facultad*/
                    facultad.getLsUsuarios().add(usuario);
                    
                  
                    estado = true;
                }
            }
        }
        
        return estado;
    }
    
    public boolean asignarle_libro_aFacultad ( String nombreFacultad , String isbn ){
        boolean estado = false;
        Facultad facultad = GestorPrincipal.getGestorFacultad().buscar(nombreFacultad);
     if(facultad != null){
            
            /*Buscamos al libro según su ibn, usando el "GestorLibro"*/
            Libro libro = GestorPrincipal.getGestorLibro().buscar(isbn);
            if(libro != null){
                
                /*Verificamos que el libro no esté registrado en la facultad*/
                boolean asociadoanteriormente = false;
                Libro libroAux = null;
                
                /*Lista de libros en la facultad donde estan actualmente */
                ArrayList<Libro> lsLibrosdeLaFacultad = facultad.getLsLibros();
                for(int i=0; i<lsLibrosdeLaFacultad.size(); i++){
                    /*Obtenemos el libro "i" de la facultad*/
                    libroAux = lsLibrosdeLaFacultad.get(i);
                    
                    /*Verificamos la condición de búsqueda*/
                    if(libroAux.getIsbn().trim().equalsIgnoreCase(isbn) == true){
                        asociadoanteriormente = true;
                        i = lsLibrosdeLaFacultad.size()+1;
                    }
                }
                
                if(asociadoanteriormente == false){
                    /*Añadimos al usuario en la facultad*/
                    
                    /*Registramos el usuario en la facultad*/
                    facultad.getLsLibros().add(libro);
                    
                  
                    estado = true;
                }
            }
        }
        
        return estado;
    }
    
}
