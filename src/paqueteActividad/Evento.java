package paqueteActividad;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Evento extends Tarea {
    
    private final Date[] fechasEvento = new Date[2]; //0 fecha inicio | 1 fecha final
    private String lugar;

    public Evento() {
    }

    public Evento(String nombre, int prioridad, String descripcion, boolean completado, Date fechaInicio, Date fechaFinal, String lugar) {
        super(nombre, prioridad, descripcion, completado);
        this.fechasEvento[0] = fechaInicio;
        this.fechasEvento[1] = fechaFinal;
        this.lugar = lugar;
    }

    // <editor-fold defaultstate="collapsed" desc="Gets and Sets">
    public Date getFechaInicio() {
        return this.fechasEvento[0];
    }
    
    public Date getFechaFinal() {
        return this.fechasEvento[1];
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechasEvento[0] = fechaInicio;
    }
    
    public void setFechaFinal(Date fechaFinal) {
        this.fechasEvento[1] = fechaFinal;
    }
    
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    // </editor-fold> 
    
    public long duracionEvento(char formato){
        long tiempoTranscurrido =  this.fechasEvento[1].getTime() -  this.fechasEvento[0].getTime();
        TimeUnit unidad;
        long retorno;
        switch (formato) {
            case 's': unidad = TimeUnit.SECONDS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'm': unidad = TimeUnit.MINUTES; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'h': unidad = TimeUnit.HOURS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'd': unidad = TimeUnit.DAYS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            default: throw new AssertionError();
        }
        return retorno;
    }
    
    public long duracionEventoInicio(char formato){
        Date hoy = new Date();
        long tiempoTranscurrido = this.fechasEvento[0].getTime() - hoy.getTime();
        TimeUnit unidad;
        long retorno;
        switch (formato) {
            case 's': unidad = TimeUnit.SECONDS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'm': unidad = TimeUnit.MINUTES; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'h': unidad = TimeUnit.HOURS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'd': unidad = TimeUnit.DAYS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            default: throw new AssertionError();
        }
        return retorno;
    }
    
    public long duracionEventoFin(char formato){
        Date hoy = new Date();
        long tiempoTranscurrido =  this.fechasEvento[1].getTime() - hoy.getTime();
        TimeUnit unidad;
        long retorno;
        switch (formato) {
            case 's': unidad = TimeUnit.SECONDS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'm': unidad = TimeUnit.MINUTES; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'h': unidad = TimeUnit.HOURS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            case 'd': unidad = TimeUnit.DAYS; retorno = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS); break;
            default: throw new AssertionError();
        }
        return retorno;
    }
    
}
