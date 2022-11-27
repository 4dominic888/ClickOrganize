/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seriales;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import paqueteActividad.Evento;

/**
 *
 * @author 4dominic888
 */
public class SerialEvento implements Serializable{
    
     private DefaultListModel modelo;
     private ArrayList<Evento> eventos;

    public SerialEvento(DefaultListModel modelo, ArrayList<Evento> eventos) {
        this.modelo = modelo;
        this.eventos = eventos;
    }
     
    public SerialEvento(){
        
    }

    public DefaultListModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultListModel modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
    
    
}
