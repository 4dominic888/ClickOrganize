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
import javax.swing.tree.TreeNode;

public class pTareas extends javax.swing.JPanel {

    public pTareas() {
        initComponents();
        this.modelo = new DefaultTreeModel((TreeNode) JArbolTareas.getModel().getRoot());
        MenuContextualTarea.setVisible(false);
    }

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
        btnTemporal = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

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
        MenuContextualTarea.add(OpcionMostrarTarea);

        OpcionEditarTarea.setText("Editar Tarea");
        MenuContextualTarea.add(OpcionEditarTarea);

        OpcionEliminarTarea.setText("Eliminar tarea");
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

        btnTemporal.setText("temp");
        btnTemporal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTemporalMousePressed(evt);
            }
        });
        add(btnTemporal);
        btnTemporal.setBounds(510, 230, 120, 40);

        btnCargar.setText("cargar");
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCargarMousePressed(evt);
            }
        });
        add(btnCargar);
        btnCargar.setBounds(510, 150, 120, 40);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTreeModel modelo;
    private DefaultMutableTreeNode nodoSeleccionado;
    private ArrayList<Tarea> tareas = new ArrayList<Tarea>();
    
    private void JArbolTareasValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JArbolTareasValueChanged
        nodoSeleccionado = (DefaultMutableTreeNode) JArbolTareas.getLastSelectedPathComponent();
    }//GEN-LAST:event_JArbolTareasValueChanged

    private void MenuContextualTareaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_MenuContextualTareaPopupMenuWillBecomeVisible

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
    }//GEN-LAST:event_MenuContextualTareaPopupMenuWillBecomeVisible

    private void JArbolTareasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JArbolTareasMousePressed
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                    evt.consume();
                    JArbolTareas.clearSelection();
            }
    }//GEN-LAST:event_JArbolTareasMousePressed

    
    
    
    private void btnTemporalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemporalMousePressed
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)JArbolTareas.getModel().getRoot();
        imprimirNodo(raiz);
    }//GEN-LAST:event_btnTemporalMousePressed

    private void btnCargarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMousePressed
        String path = "C:\\Users\\4dominic888\\Desktop\\arbol.txt";
    }//GEN-LAST:event_btnCargarMousePressed


    
    private void btnExportarListaTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarListaTareasActionPerformed
        FileDialog guardar = new FileDialog(new Frame(), "Guardar lista de tareas", FileDialog.SAVE);
        guardar.setVisible(true);
        
        guardar.setFilenameFilter(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name){
                return name.endsWith(".COZTarea");
            }
        });
        
        String path = guardar.getDirectory()+guardar.getFile();
        try {
            ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(path));
            SerialTarea objeto = new SerialTarea(JArbolTareas.getModel(), tareas);
            save.writeObject(objeto);
            save.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Sucedió algo a la hora de exportar la lista de tareas", "Error al guardar", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExportarListaTareasActionPerformed

    
    private void btnImportarListaTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarListaTareasActionPerformed
        FileDialog cargar = new FileDialog(new Frame(), "Cargar Lista de tareas", FileDialog.LOAD);
        cargar.setVisible(true);
        
        cargar.setFilenameFilter(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name){
                return name.endsWith(".COZTarea");
            }
        });
        
        if(cargar.getDirectory() != null){
            String path = cargar.getDirectory()+cargar.getFile();
            try {
                ObjectInputStream load = new ObjectInputStream(new FileInputStream(path));
                SerialTarea retorno = (SerialTarea)load.readObject();
                JArbolTareas.setModel(retorno.getModelo());
                tareas = retorno.getTareas();
                load.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Sucedió algo a la hora de importar la lista de tareas", "Error al cargar", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnImportarListaTareasActionPerformed

    private void OpcionAgregarTareaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionAgregarTareaMousePressed
        vTarea ventanaAgregar = new vTarea();
        ventanaAgregar.setVisible(true);
        
        ventanaAgregar.btnCRUD.setText("Agregar Tarea");
        
        ventanaAgregar.btnCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

        Tarea tarea;
        
        if(ventanaAgregar.txtNombreTarea.getText().trim().equals("")) { JOptionPane.showMessageDialog(null, "El nombre de la tarea está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
        if(Integer.parseInt(ventanaAgregar.spnPrioridad.getValue().toString()) < 0 ) { JOptionPane.showMessageDialog(null, "La prioridad no puede ser negativa", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
        if(ventanaAgregar.txtDescripcion.getText().trim().equals("")) { JOptionPane.showMessageDialog(null, "La descripción está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
        { tarea = new Tarea(ventanaAgregar.txtNombreTarea.getText(), Integer.parseInt(ventanaAgregar.spnPrioridad.getValue().toString()), ventanaAgregar.txtDescripcion.getText(), ventanaAgregar.tgbtnCompletado.isSelected());}

        if(nodoSeleccionado == null) nodoSeleccionado = (DefaultMutableTreeNode)JArbolTareas.getModel().getRoot();
        
         tareas.add(tarea);
         modelo.insertNodeInto(new DefaultMutableTreeNode(tarea.getNombre()), nodoSeleccionado, nodoSeleccionado.getChildCount());
         JArbolTareas.setModel(modelo);
        
        }
        });
        
        
    }//GEN-LAST:event_OpcionAgregarTareaMousePressed

    
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
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnExportarListaTareas;
    private javax.swing.JButton btnImportarListaTareas;
    private javax.swing.JButton btnTemporal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
