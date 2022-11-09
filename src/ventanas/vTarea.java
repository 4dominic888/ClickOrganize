/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import paqueteActividad.Tarea;

public class vTarea extends javax.swing.JFrame {

    public vTarea() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spnPrioridad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tgbtnCompletado = new javax.swing.JToggleButton();
        btnCRUD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea");
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(null);

        jLabel3.setText("Nombre de la Tarea");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 240, 16);

        txtNombreTarea.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreTarea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(txtNombreTarea);
        txtNombreTarea.setBounds(20, 40, 280, 18);

        jLabel2.setText("Prioridad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 240, 16);
        getContentPane().add(spnPrioridad);
        spnPrioridad.setBounds(20, 90, 64, 22);

        jLabel4.setText("Descripción");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 240, 16);

        txtDescripcion.setBackground(new java.awt.Color(102, 102, 102));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 280, 84);

        jLabel1.setText("Completado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 240, 240, 16);

        tgbtnCompletado.setBackground(new java.awt.Color(102, 102, 102));
        tgbtnCompletado.setText("None");
        getContentPane().add(tgbtnCompletado);
        tgbtnCompletado.setBounds(20, 260, 80, 22);

        btnCRUD.setBackground(new java.awt.Color(102, 102, 102));
        btnCRUD.setText("CRUD");
        getContentPane().add(btnCRUD);
        btnCRUD.setBounds(20, 310, 280, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Tarea tarea;
    private DefaultMutableTreeNode nodo;
    private int accion; //0 crear | 1 editar | 2 ver
    
    public void establecerAbierto(int accion, Tarea tarea, DefaultMutableTreeNode nodo){
        this.accion = accion;
        switch (accion) {
            
            case 0: //Crear
            {
                btnCRUD.setText("Agregar Tarea");
                
                btnCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    
                if(txtNombreTarea.getText().isBlank()) { JOptionPane.showMessageDialog(null, "El nombre de la tarea está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
                if(spnPrioridad.getComponentCount() < 0) { JOptionPane.showMessageDialog(null, "La prioridad no puede ser negativa", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
                if(txtDescripcion.getText().isBlank()) { JOptionPane.showMessageDialog(null, "La descripción está vacía", "Tarea", JOptionPane.WARNING_MESSAGE); return;}
                
                Tarea algo = new Tarea(txtNombreTarea.getText(), spnPrioridad.getComponentCount(), txtDescripcion.getText(), tgbtnCompletado.isSelected());
                
                
                }
                });
                
            }
                break;
            default: throw new AssertionError();
        }
    }
    
    public Tarea agregarTarea(){
        return tarea;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vTarea().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCRUD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnPrioridad;
    private javax.swing.JToggleButton tgbtnCompletado;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables
}
