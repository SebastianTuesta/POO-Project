package util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

public class UtilFecha{

    /*Obtiene la fecha actual*/
    public static Date obtenerFechaActual(){
        return new Date();
    }
    
    /*Obtiene fecha según día, mes y año*/
    public static Date obtenerFecha(int dia, int mes, int anio){
        Calendar calendario = new GregorianCalendar(anio, mes, dia);
        return calendario.getTime();
    }
    
    /*Obtiene el anio de una fecha*/
    public static int obtenerAnioDeFecha(Date fecha){
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        return calendario.get(Calendar.YEAR);
    }
    
    /*Obtiene el mes de una fecha*/
    public static int obtenerMesDeFecha(Date fecha){
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        return calendario.get(Calendar.MONTH);
    }
    
    /*Obtiene el día de una fecha*/
    public static int obtenerDiaDeFecha(Date fecha){
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        return calendario.get(Calendar.DATE);
    }
    
}