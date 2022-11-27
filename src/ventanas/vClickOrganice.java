package ventanas;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import paqueteClasesUsuario.Usuario;

public class vClickOrganice extends javax.swing.JFrame {

    public vClickOrganice() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Usuario usuario;
    
    
    public void colocarDatosUsuario(Usuario user){
        usuario = user;
        lbNombreyApellido.setText(usuario.getDatos().getNombreCompleto() + " " + usuario.getDatos().getApellidoPaterno() + " " + usuario.getDatos().getApellidoMaterno());
        lbNombreUsuario.setText(usuario.getUsername());
        lbRangoUsuario.setText((usuario.isAdministrador()) ? "Administrador" : "Usuario");
    }
    
    private pMiCuenta elPanelMiCuenta = new pMiCuenta();
    private pTareas elPanelTareas = new pTareas();
    private pEventos elPanelEventos = new pEventos();

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
        btnMiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMiCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 90));

        btnTareas.setBackground(new java.awt.Color(181, 246, 210));
        btnTareas.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnTareas.setForeground(new java.awt.Color(102, 102, 102));
        btnTareas.setText("Tareas");
        btnTareas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTareas.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTareasMousePressed(evt);
            }
        });
        getContentPane().add(btnTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 130));

        btnEventos.setBackground(new java.awt.Color(181, 246, 210));
        btnEventos.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnEventos.setForeground(new java.awt.Color(102, 102, 102));
        btnEventos.setText("Eventos");
        btnEventos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEventos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEventosMousePressed(evt);
            }
        });
        getContentPane().add(btnEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 250, 140));

        btnSalir.setBackground(new java.awt.Color(255, 198, 198));
        btnSalir.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });
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

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        String[] arreglo = {"Si", "No"};
        
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea abandonar esta ventana?", "Crear cuenta", 
                0, JOptionPane.QUESTION_MESSAGE, null , arreglo, "");
        
        if(opcion == 0){
            vIniciarSesion ventana = new vIniciarSesion();
            ventana.show(true);
            this.show(false);            
        }

    }//GEN-LAST:event_btnSalirMousePressed

    private void cargarPanel(JPanel panel){
        
        panel.setSize(740, 690);
        panel.locate(0, 0);
        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
    
    
    private void btnTareasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTareasMousePressed

        cargarPanel(elPanelTareas);
        
    }//GEN-LAST:event_btnTareasMousePressed

    private void btnEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMousePressed

       cargarPanel(elPanelEventos);
       
    }//GEN-LAST:event_btnEventosMousePressed

    private void btnMiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiCuentaActionPerformed
        cargarPanel(elPanelMiCuenta);
        elPanelMiCuenta.establecerDatos(usuario);
    }//GEN-LAST:event_btnMiCuentaActionPerformed

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
