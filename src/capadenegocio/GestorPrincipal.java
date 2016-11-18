/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capadenegocio;


public class GestorPrincipal {
    
    
    private static GestorBibliotecario gestorBibliotecario;
    private static GestorFacultad gestorFacultad;
    private static GestorLibro gestorLibro;
    private static GestorUsuario gestorUsuario;
    private static GestorBasedeDatos gestorBasedeDatos;
    
    static  {
        
        gestorBibliotecario = new GestorBibliotecario();
        gestorFacultad = new GestorFacultad();
        gestorLibro = new GestorLibro() ; 
        gestorUsuario = new GestorUsuario();
        gestorBasedeDatos = new GestorBasedeDatos();
        
        
    }

    public static GestorBibliotecario getGestorBibliotecario() {
        return gestorBibliotecario;
    }

    public static GestorFacultad getGestorFacultad() {
        return gestorFacultad;
    }

    public static GestorLibro getGestorLibro() {
        return gestorLibro;
    }

    public static GestorUsuario getGestorUsuario() {
        return gestorUsuario;
    }

    public static GestorBasedeDatos getGestorBasedeDatos() {
        return gestorBasedeDatos;
    }
    
    
}
