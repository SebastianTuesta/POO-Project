    

package capadenegocio;

import entidad.Facultad;
import java.util.ArrayList;

/**
 *
 * @author Invitado
 */
public class GestorFacultad  extends Gestor implements Interface{
    
    
    public boolean agregarFacultad(Facultad facultad ){
       boolean estado = false;
      Facultad facultadAux = buscar(facultad.getNombre());
        if(facultadAux == null){
            /*Registramos al alumno en la base de datos*/
            baseDeDatos.getLsFacultades().add(facultad);
            
            /*Actualizamos el estado*/
            estado = true;
        }
       return estado; 
    }
    
    public Facultad buscar(String nombre){
      Facultad facultad = null;  
      
       ArrayList<Facultad> lsFacultades = baseDeDatos.getLsFacultades();
        
        /*Buscamos a la facultad en la tabla*/
        Facultad facultadAux = null;
        for(int i=0; i<lsFacultades.size(); i++){
            /*Obtenemos el alumno "i"*/
            facultadAux = lsFacultades.get(i);
            
            /*Verificamos la condición de búsqueda*/
            if(nombre.trim().equalsIgnoreCase(facultadAux.getNombre()) == true){
                facultad = facultadAux;
                i = lsFacultades.size()+1;
            }
        }
      return facultad;
    }
    
    public ArrayList<Facultad> listar(){
        /*Retornamos la lista de alumnos*/
        return baseDeDatos.getLsFacultades();
    }
}
