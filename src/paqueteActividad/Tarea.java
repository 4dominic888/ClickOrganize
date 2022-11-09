package paqueteActividad;

public class Tarea {
    protected String nombre;
    protected int prioridad;
    protected String descripcion;
    protected boolean completado;
    
    public Tarea() {
    }

    public Tarea(String nombre, int prioridad, String descripcion, boolean completado) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.completado = completado;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Gets and Sets">
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
    // </editor-fold> 
    
}
