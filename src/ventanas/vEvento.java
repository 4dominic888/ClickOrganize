/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import paqueteActividad.Evento;
import paqueteActividad.Tarea;
public class vEvento extends javax.swing.JFrame {

    public vEvento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private Evento editarEvento = new Evento();
    public Evento getEditarEvento() {return editarEvento;}
    public void setEditarTarea(Evento editarEvento) { this.editarEvento = editarEvento;}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtNombreEvento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spnPrioridad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        tgbtnCompletado = new javax.swing.JToggleButton();
        btnCRUD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Evento");
        setBackground(new java.awt.Color(102, 102, 102));
        setType(java.awt.Window.Type.POPUP);

        jLabel3.setText("Nombre del Evento");

        txtNombreEvento.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreEvento.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEventoKeyTyped(evt);
            }
        });

        jLabel2.setText("Prioridad");

        spnPrioridad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Descripción");

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel7.setText("Lugar");

        txtLugar.setBackground(new java.awt.Color(255, 255, 255));
        txtLugar.setForeground(new java.awt.Color(0, 0, 0));
        txtLugar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Fecha Inicial");

        jLabel6.setText("Fecha Final");

        jLabel1.setText("Completado");

        tgbtnCompletado.setBackground(new java.awt.Color(158, 158, 158));
        tgbtnCompletado.setForeground(new java.awt.Color(0, 0, 0));
        tgbtnCompletado.setText("No");
        tgbtnCompletado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tgbtnCompletado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tgbtnCompletadoStateChanged(evt);
            }
        });
        tgbtnCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnCompletadoActionPerformed(evt);
            }
        });

        btnCRUD.setBackground(new java.awt.Color(255, 255, 255));
        btnCRUD.setForeground(new java.awt.Color(0, 0, 0));
        btnCRUD.setText("CRUD");
        btnCRUD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLugar)
                            .addComponent(jScrollPane1)
                            .addComponent(txtNombreEvento)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbtnCompletado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(spnPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(tgbtnCompletado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getAccessibleContext().setAccessibleParent(btnCRUD);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbtnCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnCompletadoActionPerformed
        tgbtnCompletado.setText(tgbtnCompletado.isSelected() ? "Si" : "No");
        tgbtnCompletado.setBackground(tgbtnCompletado.isSelected() ? Color.getHSBColor(0, 0, 100) : Color.white);
    }//GEN-LAST:event_tgbtnCompletadoActionPerformed

    private void txtNombreEventoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEventoKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_txtNombreEventoKeyTyped

    private void tgbtnCompletadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tgbtnCompletadoStateChanged
        tgbtnCompletado.setText(tgbtnCompletado.isSelected() ? "Si" : "No");
        tgbtnCompletado.setBackground(tgbtnCompletado.isSelected() ? Color.getHSBColor(0, 0, 100) : Color.white);
    }//GEN-LAST:event_tgbtnCompletadoStateChanged

    public void validacionCaracteres(java.awt.event.KeyEvent evt){
        if(evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64
        || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96
        || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 208
        || evt.getKeyChar() >= 210 && evt.getKeyChar() <= 240
        || evt.getKeyChar() >= 242 && evt.getKeyChar() <= 255){
            
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
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
    public javax.swing.JButton btnCRUD;
    public com.toedter.calendar.JDateChooser fechaFinal;
    public com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner spnPrioridad;
    public javax.swing.JToggleButton tgbtnCompletado;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtLugar;
    public javax.swing.JTextField txtNombreEvento;
    // End of variables declaration//GEN-END:variables
}
