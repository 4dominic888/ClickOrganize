package ventanas;

import Seriales.SerialTarea;
import java.awt.FileDialog;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import paqueteActividad.Tarea;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.TreeNode;

public class pTareas extends javax.swing.JPanel {

    public pTareas() {
        initComponents();
        this.modelo = new DefaultTreeModel((TreeNode) JArbolTareas.getModel().getRoot());
        MenuContextualTarea.setVisible(false);
    }
    
    private boolean cambiosRealizados = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuContextualTarea = new javax.swing.JPopupMenu();
        OpcionAgregarTarea = new javax.swing.JMenuItem();
        OpcionMostrarTarea = new javax.swing.JMenuItem();
        OpcionEditarTarea = new javax.swing.JMenuItem();
        OpcionEliminarTarea = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        JArbolTareas = new javax.swing.JTree();
        btnImportarListaTareas = new javax.swing.JButton();
        btnExportarListaTareas = new javax.swing.JButton();

        MenuContextualTarea.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                MenuContextualTareaPopupMenuWillBecomeVisible(evt);
            }
        });

        OpcionAgregarTarea.setText("Agregar Tarea");
        OpcionAgregarTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OpcionAgregarTareaMousePressed(evt);
            }
        });
        MenuContextualTarea.add(OpcionAgregarTarea);

        OpcionMostrarTarea.setText("Información de la tarea");
        OpcionMostrarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionMostrarTareaActionPerformed(evt);
            }
        });
        MenuContextualTarea.add(OpcionMostrarTarea);

        OpcionEditarTarea.setText("Editar Tarea");
        OpcionEditarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionEditarTareaActionPerformed(evt);
            }
        });
        MenuContextualTarea.add(OpcionEditarTarea);

        OpcionEliminarTarea.setText("Eliminar tarea");
        OpcionEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionEliminarTareaActionPerformed(evt);
            }
        });
        MenuContextualTarea.add(OpcionEliminarTarea);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        JArbolTareas.setBackground(new java.awt.Color(204, 204, 204));
        JArbolTareas.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        JArbolTareas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JArbolTareas.setComponentPopupMenu(MenuContextualTarea);
        JArbolTareas.setOpaque(false);
        JArbolTareas.setRootVisible(false);
        JArbolTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JArbolTareasMousePressed(evt);
            }
        });
        JArbolTareas.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JArbolTareasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JArbolTareas);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 450, 670);

        btnImportarListaTareas.setBackground(new java.awt.Color(204, 204, 204));
        btnImportarListaTareas.setForeground(new java.awt.Color(0, 0, 0));
        btnImportarListaTareas.setText("Importar Lista de Tareas");
        btnImportarListaTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarListaTareasActionPerformed(evt);
            }
        });
        add(btnImportarListaTareas);
        btnImportarListaTareas.setBounds(470, 60, 260, 40);

        btnExportarListaTareas.setBackground(new java.awt.Color(204, 204, 204));
        btnExportarListaTareas.setForeground(new java.awt.Color(0, 0, 0));
        btnExportarListaTareas.setText("Exportar Lista de Tareas");
        btnExportarListaTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarListaTareasActionPerformed(evt);
            }
        });
        add(btnExportarListaTareas);
        btnExportarListaTareas.setBounds(470, 12, 260, 40);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTreeModel modelo;
    private DefaultMutableTreeNode nodoSeleccionado;
    private ArrayList<Tarea> tareas = new ArrayList<Tarea>();
    
    private void JArbolTareasValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JArbolTareasValueChanged
        nodoSeleccionado = (DefaultMutableTreeNode) JArbolTareas.getLastSelectedPathComponent();
    }//GEN-LAST:event_JArbolTareasValueChanged

    private void MenuContextualTareaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_MenuContextualTareaPopupMenuWillBecomeVisible

        try {
        if(nodoSeleccionado != null){
            OpcionEditarTarea.setEnabled(true);
            OpcionEliminarTarea.setEnabled(true);
            OpcionMostrarTarea.setEnabled(true);
        }
        else{
            OpcionEditarTarea.setEnabled(false);
            OpcionEliminarTarea.setEnabled(false);
            OpcionMostrarTarea.setEnabled(false);
        }
        
        } catch (NullPointerException e) {
           OpcionEditarTarea.setEnabled(false);
           OpcionEliminarTarea.setEnabled(false);
           OpcionMostrarTarea.setEnabled(false); 
        }
    }//GEN-LAST:event_MenuContextualTareaPopupMenuWillBecomeVisible

    private void JArbolTareasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JArbolTareasMousePressed
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                    evt.consume();
                    JArbolTareas.clearSelection();
            }
    }//GEN-LAST:event_JArbolTareasMousePressed

    
    
    
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Arbol Tareas | *.COZTarea", "COZTarea");
    
    private static final String BOLD_FORMAT = "<html><span style='font-weight: bold;'>%s</span><html>";
    
    private boolean tareaNombreRepetido(String nombre){
        for (Tarea tarea : tareas) if(tarea.getNombre().equals(nombre)) return true;
        return false;
    }
    
    private Tarea obtenerTareaConNombre(String nombre){
        for (Tarea tarea : tareas) if(tarea.getNombre().equals(nombre)) return tarea;
        return null;
    }
    
    public static String insertString(String originalString, String stringToBeInserted, int index){
  
        // Create a new string
        String newString = new String();
  
        for (int i = 0; i < originalString.length(); i++) {
  
            // Insert the original string character
            // into the new string
            newString += originalString.charAt(i);
  
            if (i == index) {
  
                // Insert the string to be inserted
                // into the new string
                newString += stringToBeInserted;
            }
        }
  
        // return the modified String
        return newString;
    }
    
    private String formatoString(String text){
        String retorno = text;
        int cantidad = 0;
        while(true){
            cantidad += 56;
            if(cantidad >= text.length()) break;
            retorno = insertString(retorno, "-\n", cantidad);
        }
        return retorno;
    }
    
    
    private void btnExportarListaTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarListaTareasActionPerformed
        
        JFileChooser guardar = new JFileChooser();
        guardar.setFileFilter(filter);
        int opcion = guardar.showSaveDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
            String path = guardar.getSelectedFile().getPath()+".COZTarea";
           
            try {
                ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(path));
                SerialTarea objeto = new SerialTarea(JArbolTareas.getModel(), tareas);
                save.writeObject(objeto);
                save.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Sucedió algo a la hora de exportar la lista de tareas", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            }        
        }
        
        
        
        
//        FileDialog guardar = new FileDialog(new Frame(), "Guardar lista de tareas", FileDialog.SAVE);
//        
//        
//        guardar.setFilenameFilter(new FilenameFilter(){
//            @Override
//            public boolean accept(File dir, String name){
//                return name.endsWith(".COZTarea");
//            }
//        });
//        
//
//        guardar.setVisible(true);
//        
//        String path = guardar.getDirectory()+guardar.getFile();
//        try {
//            ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(path));
//            SerialTarea objeto = new SerialTarea(JArbolTareas.getModel(), tareas);
//            save.writeObject(objeto);
//            save.close();
//        } catch (Exception e) {
//            System.out.println(e);
//            JOptionPane.showMessageDialog(null, "Sucedió algo a la hora de exportar la lista de tareas", "Error al guardar", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_btnExportarListaTareasActionPerformed

    private void btnImportarListaTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarListaTareasActionPerformed
        
        JFileChooser cargar = new JFileChooser();
        cargar.setFileFilter(filter);
        int opcion = cargar.showOpenDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
            String path = cargar.getSelectedFile().toString();
        
            try {
                ObjectInputStream load = new ObjectInputStream(new FileInputStream(path));
                SerialTarea retorno = (SerialTarea)load.readObject();
                modelo = (DefaultTreeModel) retorno.getModelo();
                JArbolTareas.setModel(modelo);
                tareas = retorno.getTareas();
                JArbolTareas.clearSelection();
                for (Tarea tarea : tareas) {
                    System.out.println(tarea);
                }
                load.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Sucedió algo a la hora de importar la lista de tareas\n" + e, "Error al cargar", JOptionPane.WARNING_MESSAGE);
            }
        }
        
//        FileDialog cargar = new FileDialog(new Frame(), "Cargar Lista de tareas", FileDialog.LOAD);
//        cargar.setVisible(true);
//        
//        cargar.setFilenameFilter(new FilenameFilter(){
//            @Override
//            public boolean accept(File dir, String name){
//                return name.endsWith(".COZTarea");
//            }
//        });
//        
//        if(cargar.getDirectory() != null){
//            String path = cargar.getDirectory()+cargar.getFile();
//            try {
//                ObjectInputStream load = new ObjectInputStream(new FileInputStream(path));
//                SerialTarea retorno = (SerialTarea)load.readObject();
//                JArbolTareas.setModel(retorno.getModelo());
//                tareas = retorno.getTareas();
//                load.close();
//            } catch (Exception e) {
//                System.out.println(e);
//                JOptionPane.showMessageDialog(null, "Sucedió algo a la hora de importar la lista de tareas", "Error al cargar", JOptionPane.WARNING_MESSAGE);
//            }
//        }
    }//GEN-LAST:event_btnImportarListaTareasActionPerformed

    
    
    private void OpcionAgregarTareaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionAgregarTareaMousePressed
        vTarea ventanaAgregar = new vTarea();
        ventanaAgregar.setVisible(true);
        
        ventanaAgregar.btnCRUD.setText("Agregar Tarea");
        
        ventanaAgregar.btnCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

        Tarea tarea;
        
        
        if(ventanaAgregar.txtNombreTarea.getText().trim().equals("")) { JOptionPane.showMessageDialog(null, "El nombre de la tarea está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
        if(ventanaAgregar.txtNombreTarea.getText().trim().equals("root")) { JOptionPane.showMessageDialog(null, "No puedes usar este nombre", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
        if(tareaNombreRepetido(ventanaAgregar.txtNombreTarea.getText().trim())) { JOptionPane.showMessageDialog(null, "El nombre de la tarea ya existe, elija otro", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
        if(Integer.parseInt(ventanaAgregar.spnPrioridad.getValue().toString()) < 0 ) { JOptionPane.showMessageDialog(null, "La prioridad no puede ser negativa", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
        if(ventanaAgregar.txtDescripcion.getText().trim().equals("")) { JOptionPane.showMessageDialog(null, "La descripción está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}

        tarea = new Tarea(ventanaAgregar.txtNombreTarea.getText(), Integer.parseInt(ventanaAgregar.spnPrioridad.getValue().toString()), ventanaAgregar.txtDescripcion.getText(), ventanaAgregar.tgbtnCompletado.isSelected());

        if(nodoSeleccionado == null) nodoSeleccionado = (DefaultMutableTreeNode)JArbolTareas.getModel().getRoot();
         tareas.add(tarea);
         
         String nombreTarea = ventanaAgregar.tgbtnCompletado.isSelected() ? String.format(BOLD_FORMAT, ventanaAgregar.txtNombreTarea.getText()) : ventanaAgregar.txtNombreTarea.getText();
         
         modelo.insertNodeInto(new DefaultMutableTreeNode(nombreTarea), 
                 nodoSeleccionado, nodoSeleccionado.getChildCount());
         JArbolTareas.setModel(modelo);
         
         ventanaAgregar.txtNombreTarea.setText("");
         ventanaAgregar.txtDescripcion.setText("");
         ventanaAgregar.spnPrioridad.setValue(0);
         ventanaAgregar.tgbtnCompletado.setSelected(false);
         JArbolTareas.clearSelection();
         nodoSeleccionado = null;
         ventanaAgregar.dispose();
        }
        });
        
        
    }//GEN-LAST:event_OpcionAgregarTareaMousePressed

    private void OpcionMostrarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionMostrarTareaActionPerformed
        Tarea verTarea = new Tarea();
        if(obtenerTareaConNombre(nodoSeleccionado.toString()) == null){
            String nombreTarea = nodoSeleccionado.toString().substring(39);
            char[] temporal = nombreTarea.toCharArray();
            int count = 0;
            for (char c : temporal) {
                if(c == '<') break;
                else count++;
            }
            nombreTarea = nombreTarea.substring(0, count);
            verTarea = obtenerTareaConNombre(nombreTarea);
        }
        else verTarea = obtenerTareaConNombre(nodoSeleccionado.toString());
        
        String completado = verTarea.isCompletado() ? "Esta tarea fue completada" : "Esta tarea no fue completada";
        if(verTarea != null) JOptionPane.showMessageDialog(null,
                
                "[" + verTarea.getNombre() + "]\n"
              + "Importancia: " + verTarea.getPrioridad() + "\n\n"
              + "Descripción:\n" + formatoString(verTarea.getDescripcion()) + "\n\n"
              + completado + "\n", 
                
                "Tarea", JOptionPane.INFORMATION_MESSAGE);
        
        else JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar mostrar la tarea", "Tarea", JOptionPane.WARNING_MESSAGE);
        JArbolTareas.clearSelection();
        
    }//GEN-LAST:event_OpcionMostrarTareaActionPerformed

    private void OpcionEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionEliminarTareaActionPerformed
        Tarea eliminarTarea = new Tarea();
        
         if(obtenerTareaConNombre(nodoSeleccionado.toString()) == null){
            String nombreTarea = nodoSeleccionado.toString().substring(39);
            char[] temporal = nombreTarea.toCharArray();
            int count = 0;
            for (char c : temporal) {
                if(c == '<') break;
                else count++;
            }
            nombreTarea = nombreTarea.substring(0, count);
            eliminarTarea = obtenerTareaConNombre(nombreTarea);
        }
        else eliminarTarea = obtenerTareaConNombre(nodoSeleccionado.toString());
        
        String[] arreglo = {"Si", "No"};
        
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea eliminar esta tarea? También se eliminaran las subtareas existentes", "Tarea", 
                0, JOptionPane.QUESTION_MESSAGE, null , arreglo, "");
        
        if(opcion == 0){
            tareas.remove(eliminarTarea);
            modelo.removeNodeFromParent(nodoSeleccionado);
            JArbolTareas.setModel(modelo);
        }
        JArbolTareas.clearSelection();
    }//GEN-LAST:event_OpcionEliminarTareaActionPerformed

    private void OpcionEditarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionEditarTareaActionPerformed
        if(nodoSeleccionado != null){
            
            Tarea editarTarea = new Tarea();
        
            if(obtenerTareaConNombre(nodoSeleccionado.toString()) == null){
            String nombreTarea = nodoSeleccionado.toString().substring(39);
            char[] temporal = nombreTarea.toCharArray();
            int count = 0;
            for (char c : temporal) {
                if(c == '<') break;
                else count++;
            }
            nombreTarea = nombreTarea.substring(0, count);
            editarTarea = obtenerTareaConNombre(nombreTarea);
        }
            else editarTarea = obtenerTareaConNombre(nodoSeleccionado.toString());

            vTarea ventanaEditar = new vTarea();
            ventanaEditar.setVisible(true);
            ventanaEditar.btnCRUD.setText("Editar");
            ventanaEditar.txtNombreTarea.setText(editarTarea.getNombre());
            ventanaEditar.spnPrioridad.setValue(editarTarea.getPrioridad());
            ventanaEditar.txtDescripcion.setText(editarTarea.getDescripcion());
            ventanaEditar.tgbtnCompletado.setSelected(editarTarea.isCompletado());
            ventanaEditar.setEditarTarea(editarTarea);
            
            ventanaEditar.btnCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String tareaAnteriorNombre = ventanaEditar.getEditarTarea().getNombre();
                int indiceCambiar = tareas.indexOf(ventanaEditar.getEditarTarea());
                Tarea nuevaTarea = new Tarea();
                
                if(ventanaEditar.txtNombreTarea.getText().trim().equals("")) { JOptionPane.showMessageDialog(null, "El nombre de la tarea está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
                if(ventanaEditar.txtNombreTarea.getText().trim().equals("root")) { JOptionPane.showMessageDialog(null, "No puedes usar este nombre", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
                if(!ventanaEditar.txtNombreTarea.getText().trim().equals(tareaAnteriorNombre)){
                    if(tareaNombreRepetido(ventanaEditar.txtNombreTarea.getText().trim())) { JOptionPane.showMessageDialog(null, "El nombre de la tarea ya existe, elija otro", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
                }
                if(Integer.parseInt(ventanaEditar.spnPrioridad.getValue().toString()) < 0 ) { JOptionPane.showMessageDialog(null, "La prioridad no puede ser negativa", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
                if(ventanaEditar.txtDescripcion.getText().trim().equals("")) { JOptionPane.showMessageDialog(null, "La descripción está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}

                nuevaTarea = new Tarea(ventanaEditar.txtNombreTarea.getText(), Integer.parseInt(ventanaEditar.spnPrioridad.getValue().toString()), ventanaEditar.txtDescripcion.getText(), ventanaEditar.tgbtnCompletado.isSelected());
                
                if(nodoSeleccionado == null) nodoSeleccionado = (DefaultMutableTreeNode)JArbolTareas.getModel().getRoot();
                
                String nombreTarea = ventanaEditar.tgbtnCompletado.isSelected() ? String.format(BOLD_FORMAT, ventanaEditar.txtNombreTarea.getText()) : ventanaEditar.txtNombreTarea.getText();
                
                tareas.set(indiceCambiar, nuevaTarea);
                nodoSeleccionado.setUserObject(nombreTarea);
                modelo.nodeChanged(nodoSeleccionado);
                JArbolTareas.setModel(modelo);
                
                for (Tarea tarea : tareas) {
                    System.out.println(tarea);
                }
                
                
                ventanaEditar.txtNombreTarea.setText("");
                ventanaEditar.txtDescripcion.setText("");
                ventanaEditar.spnPrioridad.setValue(0);
                ventanaEditar.tgbtnCompletado.setSelected(false);
                JArbolTareas.clearSelection();
                nodoSeleccionado = null;
                ventanaEditar.dispose();
            }
            });
            
        }
    }//GEN-LAST:event_OpcionEditarTareaActionPerformed

    
    //lo recorre
    public void imprimirNodo(DefaultMutableTreeNode nodo) {
        System.out.println(nodo.toString());

        if (nodo.getChildCount() >= 0) {
            for (Enumeration e=nodo.children(); e.hasMoreElements(); ) {
                DefaultMutableTreeNode n = (DefaultMutableTreeNode)e.nextElement();
                imprimirNodo(n);
            }
        }
}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JArbolTareas;
    private javax.swing.JPopupMenu MenuContextualTarea;
    private javax.swing.JMenuItem OpcionAgregarTarea;
    private javax.swing.JMenuItem OpcionEditarTarea;
    private javax.swing.JMenuItem OpcionEliminarTarea;
    private javax.swing.JMenuItem OpcionMostrarTarea;
    private javax.swing.JButton btnExportarListaTareas;
    private javax.swing.JButton btnImportarListaTareas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
