/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author 4dominic888
 */
public class vIniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form vIniciarSesion
     */
    public vIniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPassword = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbCrearCuenta = new javax.swing.JLabel();
        lbOlvidoPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        bg_IniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPassword.setBackground(new java.awt.Color(204, 204, 204));
        lbPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setText("Contraseña:");
        getContentPane().add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lbUserName.setBackground(new java.awt.Color(204, 204, 204));
        lbUserName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        lbUserName.setText("Usuario:");
        getContentPane().add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        lbCrearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lbCrearCuenta.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCrearCuenta.setForeground(new java.awt.Color(204, 204, 204));
        lbCrearCuenta.setText("Crear una cuenta");
        lbCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCrearCuentaMouseClicked(evt);
            }
        });
        getContentPane().add(lbCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 110, 20));

        lbOlvidoPassword.setBackground(new java.awt.Color(255, 255, 255));
        lbOlvidoPassword.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbOlvidoPassword.setForeground(new java.awt.Color(204, 204, 204));
        lbOlvidoPassword.setText("¿Olvidó su contraseña?");
        lbOlvidoPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOlvidoPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOlvidoPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(lbOlvidoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 20));

        txtUserName.setBackground(new java.awt.Color(102, 102, 102));
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, -1));

        txtPassword.setBackground(new java.awt.Color(102, 102, 102));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 210, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(102, 102, 102));
        btnIniciarSesion.setForeground(new java.awt.Color(204, 204, 204));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 200, 30));

        bg_IniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BG_InicioSesion.jpg"))); // NOI18N
        getContentPane().add(bg_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        //Username validations
        if(txtUserName.getText().trim().isEmpty()) {JOptionPane.showMessageDialog(null, "No ha ingresado un nombre de usuario válido",
                "Error al Iniciar sesión", JOptionPane.WARNING_MESSAGE); return;}
        
        //Password validations
        if(txtPassword.getText().trim().isEmpty()) {JOptionPane.showMessageDialog(null, "No ha ingresado la contraseña",
                "Error al Iniciar sesión", JOptionPane.WARNING_MESSAGE); return;}
        
        /*Validar que una cuenta con esos datos exista*/
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void lbCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCrearCuentaMouseClicked
        vCrearCuenta ventana = new vCrearCuenta();
        ventana.show(true);
        this.show(false);
    }//GEN-LAST:event_lbCrearCuentaMouseClicked

    private void lbOlvidoPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOlvidoPasswordMouseClicked
        JOptionPane.showMessageDialog(null, "Opción aun no implementada");
    }//GEN-LAST:event_lbOlvidoPasswordMouseClicked

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(vIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vIniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_IniciarSesion;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lbCrearCuenta;
    private javax.swing.JLabel lbOlvidoPassword;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}