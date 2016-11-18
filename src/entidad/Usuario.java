package entidad;


import entidad.Facultad;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Invitado
 */
public class Usuario extends Persona implements Serializable{
    
    private Facultad facultad;
    private String codigo;

    public Usuario(){
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    @Override
    public String toString() {
        return "Usuario: "  + nombre;
    }
}
