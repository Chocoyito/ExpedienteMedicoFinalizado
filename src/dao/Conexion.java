/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josar
 */
public class Conexion {
    private static final String SERVIDOR = "localhost";
    private static final String USUARIO = "sa";
    private static final String CONTRA = "1234567890";
    private static final String NOMBREBD = "ExpedienteClinico";
    private static final String PUERTO = "1433";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection obtenerConexion(){
        try {
            String conexionUrl = "jdbc:sqlserver://" + SERVIDOR +": " + PUERTO +
                    "; Databasename= " + NOMBREBD +"; user= " + USUARIO + 
                    "; password = " + CONTRA + ";";
            Class.forName(DRIVER);
            return (DriverManager.getConnection(conexionUrl));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void cerrarConexion(Connection con){
        try {
           con.close();
        } catch(SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
