package ventanas;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class pTareas extends javax.swing.JPanel {

    public pTareas() {
        initComponents();
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
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Tarea1");
        JArbolTareas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JArbolTareas.setComponentPopupMenu(MenuContextualTarea);
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
        add(btnImportarListaTareas);
        btnImportarListaTareas.setBounds(470, 60, 260, 40);

        btnExportarListaTareas.setBackground(new java.awt.Color(204, 204, 204));
        btnExportarListaTareas.setForeground(new java.awt.Color(0, 0, 0));
        btnExportarListaTareas.setText("Exportar Lista de Tareas");
        add(btnExportarListaTareas);
        btnExportarListaTareas.setBounds(470, 12, 260, 40);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTreeModel modelo;
    private DefaultMutableTreeNode nodoSeleccionado;
    
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
