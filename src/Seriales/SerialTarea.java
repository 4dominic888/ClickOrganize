package Seriales;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.tree.TreeModel;
import paqueteActividad.Tarea;

public class SerialTarea implements Serializable{
    
    private TreeModel modelo;
    private ArrayList<Tarea> tareas;

    public SerialTarea(TreeModel modelo, ArrayList<Tarea> tareas) {
        this.modelo = modelo;
        this.tareas = tareas;
    }
    
    public SerialTarea(){
        
    }

    public TreeModel getModelo() {
        return modelo;
    }

    public void setModelo(TreeModel modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
}
