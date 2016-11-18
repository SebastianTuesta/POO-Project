package util;

/**
 *
 * @author ALONSO RAÚL MELGAREJO GALVÁN
 * @author-email alonsoraulmg@gmail.com
 * @author-web http://www.linkedin.com/in/alonsoraulmg
 * @author-web https://www.facebook.com/alonsoraulmg
 * 
 * @company Global Intelligence Systems
 * @company-email contacto@globalintelsys.net84.net
 * @company-web http://globalintelsys.net84.net
 * @company-web http://www.globalintelsys.net84.net/academia
 * 
 * @version 1.0
 * @date-creation 29/05/2014
 * @copyright Global Intelligence Systems
 * 
 */

public class ComboItem{
    
    private String descripcion;
    private Object objeto;

    public ComboItem(String descripcion, Object objeto){
        this.descripcion = descripcion;
        this.objeto = objeto;
    }

    @Override
    public String toString(){
        return descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Object getObjeto() {
        return objeto;
    }
    
}