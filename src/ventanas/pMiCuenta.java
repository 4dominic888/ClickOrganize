/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import Conexion.ConexionUsuarios;
import java.awt.Window;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import paqueteClasesUsuario.DatosUsuario;
import paqueteClasesUsuario.Usuario;

/**
 *
 * @author 4dominic888
 */
public class pMiCuenta extends javax.swing.JPanel {

    /**
     * Creates new form pConfiguracionCuenta
     */
    public pMiCuenta() {
        initComponents();
    }
    
    public Usuario elUsuario;
    public ConexionUsuarios conexion = new ConexionUsuarios();
    
    public void establecerDatos(Usuario usuario){
        elUsuario = usuario;
        
        txtEditarNombre.setText(elUsuario.getDatos().getNombreCompleto());
        txtApellidoPaterno.setText(elUsuario.getDatos().getApellidoPaterno());
        txtApellidoMaterno.setText(elUsuario.getDatos().getApellidoMaterno());
        jDateFechaNacimiento.setDate(elUsuario.getDatos().getFechaNacimiento());
        cb_Sexo.setSelectedIndex((elUsuario.getDatos().getSexo() == 1) ? 0 : 1);
        txtUsername.setText(elUsuario.getUsername());
        txtPassword.setText(elUsuario.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbNombreCompleto = new javax.swing.JLabel();
        txtEditarNombre = new javax.swing.JTextField();
        lbApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lbApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        lbFechaNacimiento = new javax.swing.JLabel();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lbSexo = new javax.swing.JLabel();
        cb_Sexo = new javax.swing.JComboBox<>();
        lbUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnActualizar = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        tgbtnVerPassword = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(740, 690));
        setLayout(null);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setText("Configuraci??n de cuenta");
        add(lbTitulo);
        lbTitulo.setBounds(10, 40, 440, 80);

        lbNombreCompleto.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreCompleto.setText("Nombre Completo");
        add(lbNombreCompleto);
        lbNombreCompleto.setBounds(20, 120, 120, 16);

        txtEditarNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtEditarNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtEditarNombre.setText("nombre");
        add(txtEditarNombre);
        txtEditarNombre.setBounds(20, 140, 670, 30);

        lbApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        lbApellidoPaterno.setText("Apellido Paterno");
        add(lbApellidoPaterno);
        lbApellidoPaterno.setBounds(20, 170, 120, 16);

        txtApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoPaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidoPaterno.setText("nombre");
        add(txtApellidoPaterno);
        txtApellidoPaterno.setBounds(20, 190, 670, 30);

        lbApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        lbApellidoMaterno.setText("Apellido Materno");
        add(lbApellidoMaterno);
        lbApellidoMaterno.setBounds(20, 220, 120, 16);

        txtApellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoMaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidoMaterno.setText("nombre");
        add(txtApellidoMaterno);
        txtApellidoMaterno.setBounds(20, 240, 670, 30);

        lbFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        lbFechaNacimiento.setText("Fecha De Nacimiento");
        add(lbFechaNacimiento);
        lbFechaNacimiento.setBounds(20, 270, 130, 16);

        jDateFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jDateFechaNacimiento.setForeground(new java.awt.Color(102, 102, 102));
        add(jDateFechaNacimiento);
        jDateFechaNacimiento.setBounds(20, 290, 670, 30);

        lbSexo.setForeground(new java.awt.Color(0, 0, 0));
        lbSexo.setText("Sexo");
        add(lbSexo);
        lbSexo.setBounds(20, 320, 130, 16);

        cb_Sexo.setBackground(new java.awt.Color(255, 255, 255));
        cb_Sexo.setForeground(new java.awt.Color(102, 102, 102));
        cb_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        add(cb_Sexo);
        cb_Sexo.setBounds(20, 340, 670, 30);

        lbUsername.setForeground(new java.awt.Color(0, 0, 0));
        lbUsername.setText("Username");
        add(lbUsername);
        lbUsername.setBounds(20, 370, 120, 16);

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setText("nombre");
        add(txtUsername);
        txtUsername.setBounds(20, 390, 670, 30);

        lbPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbPassword.setText("Password");
        add(lbPassword);
        lbPassword.setBounds(20, 420, 120, 16);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("contra");
        add(txtPassword);
        txtPassword.setBounds(20, 440, 670, 30);

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setForeground(new java.awt.Color(102, 102, 102));
        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
        });
        add(btnActualizar);
        btnActualizar.setBounds(20, 480, 670, 30);

        btnEliminarCuenta.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminarCuenta.setForeground(new java.awt.Color(102, 102, 102));
        btnEliminarCuenta.setText("Eliminar Cuenta");
        btnEliminarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarCuentaMousePressed(evt);
            }
        });
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });
        add(btnEliminarCuenta);
        btnEliminarCuenta.setBounds(20, 520, 670, 30);

        tgbtnVerPassword.setText("o");
        tgbtnVerPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tgbtnVerPasswordMousePressed(evt);
            }
        });
        add(tgbtnVerPassword);
        tgbtnVerPassword.setBounds(700, 440, 30, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void tgbtnVerPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbtnVerPasswordMousePressed
        if(tgbtnVerPassword.isSelected()) txtPassword.setEchoChar((char)0);
        else txtPassword.setEchoChar('\u2022');
    }//GEN-LAST:event_tgbtnVerPasswordMousePressed

    private void ImprimirVentana(String texto){
        JOptionPane.showMessageDialog(null, texto, "Actualizar Datos", JOptionPane.WARNING_MESSAGE);
    }
    
    private void actualizarBaseDeDatos(Usuario usuario, ConexionUsuarios conexion){
        try {
            
            String anio = new SimpleDateFormat("YYYY").format(usuario.getDatos().getFechaNacimiento());
            int tempMes = Integer.parseInt(new SimpleDateFormat("MM").format(usuario.getDatos().getFechaNacimiento()));
            int tempDia = Integer.parseInt(new SimpleDateFormat("d").format(usuario.getDatos().getFechaNacimiento()));
            
            String mes = (tempMes < 10) ? "0" + tempMes : tempMes+"";
            String dia = (tempDia < 10) ? "0" + tempDia : tempDia+"";
            
            conexion.insertarSentencia("UPDATE Usuarios SET Username = '" + usuario.getUsername() + "',"
                    + "Password = '" + usuario.getPassword() + "',"
                    + "NombreCompleto = '"+ usuario.getDatos().getNombreCompleto() +"',"
                    + "ApellidoPaterno = '"+ usuario.getDatos().getApellidoPaterno() +"',"
                    + "ApellidoMaterno = '"+ usuario.getDatos().getApellidoMaterno() +"',"
                    + "FechaNacimiento = '"+ anio + "-" + mes + "-" + dia +"',"
                    + "Sexo = '"+ usuario.getDatos().getSexo() +"' WHERE Username = '"+ elUsuario.getUsername() +"'");
            
            conexion.close();
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
        finally{
                try {
                    conexion.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
    }
    
    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
   
        String nombre = txtEditarNombre.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        Date fechaNacimiento = jDateFechaNacimiento.getDate();
        int sexo = (cb_Sexo.getSelectedIndex() == 0) ? 1 : 0;
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        // <editor-fold defaultstate="collapsed" desc="Validaciones">
        
        if(nombre.trim().equals("")) { ImprimirVentana("El nombre est?? vac??o"); return;}
        if(apellidoPaterno.trim().equals("")) {ImprimirVentana("El apellido paterno est?? vac??o");return;}
        if(apellidoMaterno.trim().equals("")) {ImprimirVentana("El apellido materno est?? vac??o"); return;}
        
        int anioActual = Integer.parseInt(new SimpleDateFormat("YYYY").format(new Date()));
        int edad = anioActual - (fechaNacimiento.getYear()+1900);
        
        if(edad <= 8) { ImprimirVentana("El a??o de nacimiento indica que tienes menos de 8 a??os"); return;}  
        if (username.trim().equals("")) { ImprimirVentana("El nombre de usuario est?? vac??o"); return;}
        
         try {
            ResultSet resultado = conexion.consultarRegistro("SELECT * FROM Usuarios WHERE Username = '" + username + "'");
            
            if(!resultado.getString(1).equals(elUsuario.getUsername())){
               if(resultado.next()) { ImprimirVentana("El username colocado ya existe, no puede editarlo"); return;}
            }
            
        } catch (Exception e) {
            System.out.println("hubo un error");
        }
         
        if (password.trim().equals("")) { ImprimirVentana("La contrase??a est?? vac??a"); return;}
        if (password.trim().contains("123")) { ImprimirVentana("La contrase??a que intenta colocar es insegura"); return;}
        
        // </editor-fold>
        
        String[] arreglo = {"Si", "No"};
        
        int opcion = JOptionPane.showOptionDialog(null, "??Desea actualizar sus datos?, te regresar?? a la ventana de iniciar sesi??n", "Actualizar Cuenta", 
                0, JOptionPane.QUESTION_MESSAGE, null , arreglo, "");
        
        if(opcion == 0){
            actualizarBaseDeDatos(new Usuario(username, password, new DatosUsuario(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo)), conexion);
            
                vIniciarSesion ventana = new vIniciarSesion();
                Window w = SwingUtilities.getWindowAncestor(this);
                w.setVisible(false);
                ventana.show(true);
        }
    }//GEN-LAST:event_btnActualizarMousePressed
    
    private void btnEliminarCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMousePressed

        String[] arreglo = {"Si", "No"};
        
        int opcion = JOptionPane.showOptionDialog(null, "??Desea eliminar esta cuenta? te regresar?? a la ventana de iniciar sesi??n", "Crear cuenta", 
                0, JOptionPane.QUESTION_MESSAGE, null , arreglo, "");
        
        if(opcion == 0){
            
            try {
                conexion.insertarSentencia("DELETE FROM Usuarios WHERE Username = '"+ elUsuario.getUsername() + "'");
                conexion.close();
                
                vIniciarSesion ventana = new vIniciarSesion();
                Window w = SwingUtilities.getWindowAncestor(this);
                w.setVisible(false);
                ventana.show(true);
                
            } catch (SQLException ex) {
                System.out.println(ex);
            } finally{
                try {
                    conexion.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarCuentaMousePressed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JComboBox<String> cb_Sexo;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel lbApellidoMaterno;
    private javax.swing.JLabel lbApellidoPaterno;
    private javax.swing.JLabel lbFechaNacimiento;
    private javax.swing.JLabel lbNombreCompleto;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JToggleButton tgbtnVerPassword;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
