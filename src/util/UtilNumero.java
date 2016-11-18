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

public class UtilNumero{

    /*Método que genera aleatorios enteros entre cierto rango*/
    public static int generarAleatorioInt(int desde, int hasta){
        if(hasta >= 0){
            return (int) generarAleatorioDouble(desde, hasta+1);
        }else{
            return (int) generarAleatorioDouble(desde-1, hasta);
        }
    }
    
    /*Método que genera aleatorios reales entre cierto rango*/
    public static double generarAleatorioDouble(int desde, int hasta){
        if(desde*hasta >= 0){
            return (Math.random()*(hasta - desde) + desde);
        }else{
            return (Math.random()*(hasta - (desde - 1)) + desde - 1);
        }
    }
    
}