package ventanas;

import paqueteClasesUsuario.Usuario;

public class vClickOrganice extends javax.swing.JFrame {

    public vClickOrganice() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void colocarDatosUsuario(Usuario user){
        lbNombreyApellido.setText(user.getDatos().getNombreCompleto() + " " + user.getDatos().getApellidoPaterno() + " " + user.getDatos().getApellidoMaterno());
        lbNombreUsuario.setText(user.getUsername());
        lbRangoUsuario.setText((user.isAdministrador()) ? "Administrador" : "Usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconoUsuario = new javax.swing.JLabel();
        lbRangoUsuario = new javax.swing.JLabel();
        lbNombreUsuario = new javax.swing.JLabel();
        lbNombreyApellido = new javax.swing.JLabel();
        btnMiCuenta = new javax.swing.JButton();
        btnTareas = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnConfiguraciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        bg_ClickOrganice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Click Organize");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUser.png"))); // NOI18N
        getContentPane().add(iconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 150));

        lbRangoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbRangoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lbRangoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRangoUsuario.setText("Rango");
        getContentPane().add(lbRangoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 230, -1));

        lbNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lbNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombreUsuario.setText("nombre usuario");
        getContentPane().add(lbNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 240, -1));

        lbNombreyApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombreyApellido.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreyApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombreyApellido.setText("nombre y apellido");
        getContentPane().add(lbNombreyApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 230, -1));

        btnMiCuenta.setBackground(new java.awt.Color(183, 227, 247));
        btnMiCuenta.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnMiCuenta.setForeground(new java.awt.Color(102, 102, 102));
        btnMiCuenta.setText("Mi cuenta");
        btnMiCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnMiCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMiCuenta.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(btnMiCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 90));

        btnTareas.setBackground(new java.awt.Color(181, 246, 210));
        btnTareas.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnTareas.setForeground(new java.awt.Color(102, 102, 102));
        btnTareas.setText("Tareas");
        btnTareas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTareas.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(btnTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 90));

        btnEventos.setBackground(new java.awt.Color(181, 246, 210));
        btnEventos.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnEventos.setForeground(new java.awt.Color(102, 102, 102));
        btnEventos.setText("Eventos");
        btnEventos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEventos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(btnEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 90));

        btnConfiguraciones.setBackground(new java.awt.Color(200, 210, 215));
        btnConfiguraciones.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnConfiguraciones.setForeground(new java.awt.Color(102, 102, 102));
        btnConfiguraciones.setText("Configuraciones");
        btnConfiguraciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnConfiguraciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguraciones.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(btnConfiguraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 250, 90));

        btnSalir.setBackground(new java.awt.Color(255, 198, 198));
        btnSalir.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 250, 90));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 740, 690));

        bg_ClickOrganice.setBackground(new java.awt.Color(255, 255, 255));
        bg_ClickOrganice.setForeground(new java.awt.Color(255, 255, 255));
        bg_ClickOrganice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bg_ClickOrganice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pexels-ben-mack-6775241.jpg"))); // NOI18N
        bg_ClickOrganice.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(bg_ClickOrganice, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 990, 690));
        bg_ClickOrganice.getAccessibleContext().setAccessibleName("bgClickOrganice");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vClickOrganice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vClickOrganice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vClickOrganice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vClickOrganice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vClickOrganice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_ClickOrganice;
    private javax.swing.JButton btnConfiguraciones;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnMiCuenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTareas;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JLabel lbNombreyApellido;
    private javax.swing.JLabel lbRangoUsuario;
    // End of variables declaration//GEN-END:variables
}
