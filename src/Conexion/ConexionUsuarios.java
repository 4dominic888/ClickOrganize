package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import org.sqlite.SQLiteException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConexionUsuarios {
    
    String strConexion = "jdbc:sqlite:src/BaseDeDatos/Usuarios.s3db";
    Connection conexion = null;
    
    public ConexionUsuarios(){
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(strConexion);
        } 
        catch (Exception e) {
            System.out.println("ocurrio un error de conexión\n" + e);
        }
    }
    
    public int insertarSentencia(String lineaCodigo) throws SQLException{
        try {
            PreparedStatement pstm = conexion.prepareStatement(lineaCodigo);
            pstm.execute();
            return 1;
        } catch (SQLiteException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistro(String lineaCodigo){
        try {
           PreparedStatement pstm = conexion.prepareStatement(lineaCodigo);
           ResultSet respuesta = pstm.executeQuery();
           return respuesta;
        } catch (Exception e) {
            System.out.println("error");
            return null;
        }
    }
}
