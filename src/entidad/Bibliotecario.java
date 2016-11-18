package entidad;

import java.io.Serializable;


public class Bibliotecario extends Persona implements Serializable{
    
    private String nombreBibliotecario;
    private String password;

    public Bibliotecario(){
        
    }

    public String getNombreBibliotecario() {
        return nombreBibliotecario;
    }

    public void setNombreBibliotecario(String nombreBibliotecario) {
        this.nombreBibliotecario = nombreBibliotecario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

}
