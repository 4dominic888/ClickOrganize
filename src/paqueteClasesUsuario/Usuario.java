package paqueteClasesUsuario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario{
    
    private String username;
    private String password;
    private DatosUsuario datos;
    
    //Constructores
    public Usuario() { }
    
    public Usuario(String username, String password, DatosUsuario datos) {
        this.username = username;
        this.password = password;
        this.datos = datos;
    }
    
    public int getEdad(){
        int anioActual = Integer.parseInt(new SimpleDateFormat("YYYY").format(new Date()));
        return anioActual - datos.getFechaNacimiento().getYear();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Gets and Sets">
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DatosUsuario getDatos() {
        return datos;
    }

    public void setDatos(DatosUsuario datos) {
        this.datos = datos;
    }
    // </editor-fold> 
    
}
