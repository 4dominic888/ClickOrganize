/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import paqueteClasesUsuario.DatosUsuario;
import paqueteClasesUsuario.Usuario;
import Conexion.ConexionUsuarios;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class vCrearCuenta extends javax.swing.JFrame {
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloCrearCuenta = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        txtRegistroNombre = new javax.swing.JTextField();
        lbApellidoPaterno = new javax.swing.JLabel();
        txtRegistroApellidoPaterno = new javax.swing.JTextField();
        lbApellidoMaterno = new javax.swing.JLabel();
        txtRegistroApellidoMaterno = new javax.swing.JTextField();
        lbFechaDeNacimiento1 = new javax.swing.JLabel();
        jCalendario = new com.toedter.calendar.JDateChooser();
        lbSexo1 = new javax.swing.JLabel();
        cbRegistroSexo = new javax.swing.JComboBox<>();
        lbUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();
        tgbtnVerPassword = new javax.swing.JToggleButton();
        bg_CrearCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Cuenta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTituloCrearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lbTituloCrearCuenta.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        lbTituloCrearCuenta.setForeground(new java.awt.Color(204, 204, 204));
        lbTituloCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloCrearCuenta.setText("Ingrese sus datos");
        getContentPane().add(lbTituloCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 70));

        lbNombre.setBackground(new java.awt.Color(255, 255, 255));
        lbNombre.setForeground(new java.awt.Color(204, 204, 204));
        lbNombre.setText("Nombre");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtRegistroNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtRegistroNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtRegistroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtRegistroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, -1));

        lbApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        lbApellidoPaterno.setForeground(new java.awt.Color(204, 204, 204));
        lbApellidoPaterno.setText("Apellido paterno");
        getContentPane().add(lbApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtRegistroApellidoPaterno.setBackground(new java.awt.Color(102, 102, 102));
        txtRegistroApellidoPaterno.setForeground(new java.awt.Color(204, 204, 204));
        txtRegistroApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroApellidoPaternoKeyTyped(evt);
            }
        });
        getContentPane().add(txtRegistroApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, -1));

        lbApellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        lbApellidoMaterno.setForeground(new java.awt.Color(204, 204, 204));
        lbApellidoMaterno.setText("Apellido materno");
        getContentPane().add(lbApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtRegistroApellidoMaterno.setBackground(new java.awt.Color(102, 102, 102));
        txtRegistroApellidoMaterno.setForeground(new java.awt.Color(204, 204, 204));
        txtRegistroApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroApellidoMaternoKeyTyped(evt);
            }
        });
        getContentPane().add(txtRegistroApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 240, -1));

        lbFechaDeNacimiento1.setForeground(new java.awt.Color(204, 204, 204));
        lbFechaDeNacimiento1.setText("Fecha de nacimiento");
        getContentPane().add(lbFechaDeNacimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jCalendario.setBackground(new java.awt.Color(102, 102, 102));
        jCalendario.setForeground(new java.awt.Color(255, 255, 255));
        jCalendario.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, -1));

        lbSexo1.setForeground(new java.awt.Color(204, 204, 204));
        lbSexo1.setText("Sexo");
        getContentPane().add(lbSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        cbRegistroSexo.setBackground(new java.awt.Color(102, 102, 102));
        cbRegistroSexo.setForeground(new java.awt.Color(204, 204, 204));
        cbRegistroSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(cbRegistroSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 240, -1));

        lbUsername.setForeground(new java.awt.Color(204, 204, 204));
        lbUsername.setText("Username");
        getContentPane().add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txtUsername.setBackground(new java.awt.Color(102, 102, 102));
        txtUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, -1));

        lbPassword.setForeground(new java.awt.Color(204, 204, 204));
        lbPassword.setText("Contraseña");
        getContentPane().add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        txtPassword.setBackground(new java.awt.Color(102, 102, 102));
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 240, -1));

        btnRegistrarse.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarse.setForeground(new java.awt.Color(204, 204, 204));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setHideActionText(true);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 240, 40));

        btn_Regresar.setBackground(new java.awt.Color(51, 51, 51));
        btn_Regresar.setForeground(new java.awt.Color(204, 204, 204));
        btn_Regresar.setText("Regresar");
        btn_Regresar.setHideActionText(true);
        btn_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_RegresarMousePressed(evt);
            }
        });
        getContentPane().add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, 20));

        tgbtnVerPassword.setText("o");
        tgbtnVerPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tgbtnVerPasswordMousePressed(evt);
            }
        });
        getContentPane().add(tgbtnVerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 30, -1));

        bg_CrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BG_InicioSesion.jpg"))); // NOI18N
        getContentPane().add(bg_CrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public vCrearCuenta(){
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void limiteTextBox(java.awt.event.KeyEvent evt, JTextField txt){
        if(txt.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        
        ConexionUsuarios conexion = new ConexionUsuarios();
        
        String nombre = txtRegistroNombre.getText();
        String apellidoPaterno = txtRegistroApellidoPaterno.getText();
        String apellidoMaterno = txtRegistroApellidoMaterno.getText();
        Date fechaNacimiento = jCalendario.getDate();
        int sexo = (cbRegistroSexo.getSelectedIndex() == 0) ? 1 : 0; //condicional ternario
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        // <editor-fold defaultstate="collapsed" desc="Validaciones">
        if (nombre.trim().equals("")) { ImprimirVentana("El nombre está vacío"); return;}
        if (apellidoPaterno.trim().equals("")) { ImprimirVentana("El apellido paterno está vacío"); return;}
        if (apellidoMaterno.trim().equals("")) { ImprimirVentana("El apellido materno está vacío"); return;}
        
        int anioActual = Integer.parseInt(new SimpleDateFormat("YYYY").format(new Date()));
        int edad = anioActual - (fechaNacimiento.getYear()+1900);
        
        if(edad <= 8) { ImprimirVentana("El año de nacimiento indica que tienes menos de 8 años"); return;}
        
        if (username.trim().equals("")) { ImprimirVentana("El nombre de usuario está vacío"); return;}
        
        try {
            ResultSet resultado = conexion.consultarRegistro("SELECT * FROM Usuarios WHERE Username = '" + username + "'");   
            if(resultado.next()) { ImprimirVentana("El username colocado ya existe, elija otro"); return;}
            
        } catch (Exception e) {
            System.out.println("hubo un error");
        }
        
        if (password.trim().equals("")) { ImprimirVentana("La contraseña está vacío"); return;}
        
        // </editor-fold>
        
        subirBaseDeDatos(new Usuario(username, password, new DatosUsuario(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo)), conexion);
        
        JOptionPane.showMessageDialog(null, "Se ha registrado al usuario correctamente", "Crear cuenta", JOptionPane.INFORMATION_MESSAGE);
        
        txtRegistroNombre.setText("");
        txtRegistroApellidoPaterno.setText("");
        txtRegistroApellidoMaterno.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        jCalendario.setDate(new Date());
        cbRegistroSexo.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void subirBaseDeDatos(Usuario usuario, ConexionUsuarios conexion){
        try {
            
            int administrador = (usuario.isAdministrador()) ? 1 : 0;
            
            String anio = new SimpleDateFormat("YYYY").format(usuario.getDatos().getFechaNacimiento());
            int tempMes = Integer.parseInt(new SimpleDateFormat("MM").format(usuario.getDatos().getFechaNacimiento()));
            int tempDia = Integer.parseInt(new SimpleDateFormat("d").format(usuario.getDatos().getFechaNacimiento()));
            
            String mes = (tempMes < 10) ? "0" + tempMes : tempMes+"";
            String dia = (tempDia < 10) ? "0" + tempDia : tempDia+"";
            
            conexion.insertarSentencia("INSERT INTO Usuarios(Username, Password, Administrador, NombreCompleto, ApellidoPaterno, ApellidoMaterno, FechaNacimiento, Sexo) "
                    + "Values ('" + usuario.getUsername() + "', "
                            + "'" + usuario.getPassword() + "'"
                            + "," + administrador + ", "
                            + "'" + usuario.getDatos().getNombreCompleto() + "', "
                            + "'" + usuario.getDatos().getApellidoPaterno() + "', "
                            + "'" + usuario.getDatos().getApellidoMaterno() + "', "
                            + "'" + anio + "-" + mes + "-" + dia + "'"
                            + "," + usuario.getDatos().getSexo() +")");
            
            conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("sucedio un error al insertar datos");
        }
        finally{
                try {
                    conexion.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
    }
    
    private void ImprimirVentana(String texto){
        JOptionPane.showMessageDialog(null, texto, "Crear cuenta", JOptionPane.WARNING_MESSAGE);
    }
    
    private void btn_RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarMousePressed
        String[] arreglo = {"Si", "No"};
        
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea abandonar esta ventana?", "Crear cuenta", 
                0, JOptionPane.QUESTION_MESSAGE, null , arreglo, "");
        
        if(opcion == 0){
            vIniciarSesion ventana = new vIniciarSesion();
            ventana.show(true);
            this.show(false);
        }
    }//GEN-LAST:event_btn_RegresarMousePressed

    private void txtRegistroNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroNombreKeyTyped
        limiteTextBox(evt, txtRegistroNombre);
    }//GEN-LAST:event_txtRegistroNombreKeyTyped

    private void txtRegistroApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroApellidoPaternoKeyTyped
        limiteTextBox(evt, txtRegistroApellidoPaterno);
    }//GEN-LAST:event_txtRegistroApellidoPaternoKeyTyped

    private void txtRegistroApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroApellidoMaternoKeyTyped
        limiteTextBox(evt, txtRegistroApellidoMaterno);
    }//GEN-LAST:event_txtRegistroApellidoMaternoKeyTyped

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        limiteTextBox(evt, txtUsername);
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        limiteTextBox(evt, txtPassword);
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void tgbtnVerPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbtnVerPasswordMousePressed
        if(tgbtnVerPassword.isSelected()) txtPassword.setEchoChar((char)0);
        else txtPassword.setEchoChar('\u2022');
    }//GEN-LAST:event_tgbtnVerPasswordMousePressed


    
    
    

 
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
            java.util.logging.Logger.getLogger(vCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vCrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_CrearCuenta;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JComboBox<String> cbRegistroSexo;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JLabel lbApellidoMaterno;
    private javax.swing.JLabel lbApellidoPaterno;
    private javax.swing.JLabel lbFechaDeNacimiento1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSexo1;
    private javax.swing.JLabel lbTituloCrearCuenta;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JToggleButton tgbtnVerPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRegistroApellidoMaterno;
    private javax.swing.JTextField txtRegistroApellidoPaterno;
    private javax.swing.JTextField txtRegistroNombre;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
