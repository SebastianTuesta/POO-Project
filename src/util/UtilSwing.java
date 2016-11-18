package util;

import javax.swing.JPanel;

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

public class UtilSwing{

    public static void colocarNuevoPanel(JPanel jpanPadre, JPanel jpanHijo){
        /*Eliminamos el contenido del panel*/
        jpanPadre.removeAll();
        
        /*Agregamos el hijo*/
        jpanPadre.add(jpanHijo);
        
        /*Actualizamos visualmente los cambios*/
        jpanPadre.updateUI();
    }
    
    public static JPanel obtenerPadre(JPanel jpanHijo){
        return (JPanel) jpanHijo.getParent();
    }
    
    public static void quitarPanel(JPanel jpanHijo){
        JPanel jpanPadre = obtenerPadre(jpanHijo);
        jpanPadre.removeAll();
        jpanPadre.updateUI();
    }
    
}