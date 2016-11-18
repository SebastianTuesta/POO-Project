

package capadenegocio;

import entidad.BaseDeDatos;


public class GestorBasedeDatos extends Gestor {
    public boolean guardarCambios(){
        return baseDeDatos.guardarCambios();
    }
    
    public void cargarArchivos(){
        try{
        BaseDeDatos bdd = (BaseDeDatos) util.UtilArchivo.leerArchivo("C:\\proyecto\\biblioteca.fisi");
        baseDeDatos.setLsUsuarios(bdd.getLsUsuarios());
        baseDeDatos.setLsBibliotecarios(bdd.getLsBibliotecarios());
        baseDeDatos.setLsFacultades(bdd.getLsFacultades());
        baseDeDatos.setLsLibros(bdd.getLsLibros());
        baseDeDatos.setLsLibrosprestados(bdd.getLsLibrosprestados());
        }catch(Exception e){
        }
    }
}
