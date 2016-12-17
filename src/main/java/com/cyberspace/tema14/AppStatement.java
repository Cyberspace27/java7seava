
package com.cyberspace.tema14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ariel.villarreal
 * Tema 14 inyeccion SQL
 */
public class AppStatement {

    private Connection con = null;
   // protected Connection con;
        private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        private final String DB_URL = "jdbc:mysql://localhost/dbtest";
        //Base de datos credenciales    
        private final String USER = "root";
        private final String PASS = "";
    public void conectar(){
        try {
            
            Class.forName(JDBC_DRIVER);
            con=null;
            
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }
    public void desconectar()throws SQLException {
        if (con!=null) {
            con.close();
            
        }
    }
    
    public boolean leerStatement(Persona per) throws SQLException{
        boolean rpta = false;
        
        try(Statement st = con.createStatement()){
            String sql = "SELECT * FROM test WHERE nombre = '" + per.getNombre() + "' and pass = '" + per.getPass()+"'";
            System.out.println("Query =>" + sql);
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("Existen datos");
                rpta = true;                 
            }else{
                System.out.println("no existen datos");
            }
                
            System.out.println("Consulta exitosa");
        } 
        return rpta;
    }
    public static void main(String[] args) throws SQLException {
        AppStatement app = new AppStatement();
        app.conectar();
        boolean rpta = app.leerStatement(new Persona("Cyberspace", "32"));
        app.desconectar();
        if (rpta) {
            System.out.println("Verificacion correcta, Ingresando al sistema");
        }else{
            System.out.println("Verificacion Incorrecta, Acceso denegado");
        }
    }
    
}
