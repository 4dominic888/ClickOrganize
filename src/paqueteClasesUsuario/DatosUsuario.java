package paqueteClasesUsuario;

import java.util.Date;

public abstract class DatosUsuario {
    //Atributos de nombre
    protected String nombreCompleto = "None";
    protected String apellidoPaterno = "None";
    protected String apellidoMaterno = "None";
    
    //Atributos extra
    protected Date fechaNacimiento;
    protected int sexo = -1; //0 Femenino | 1 Masculino

    public DatosUsuario(String nombreCompleto, String apellidoPaterno,
                        String apellidoMaterno, Date fechaNacimiento,
                        int sexo) {
        this.nombreCompleto = nombreCompleto;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Gets and Sets">
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    // </editor-fold> 
    
    
}
