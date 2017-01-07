
package com.cyberspace.tema14;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        //private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        private final String DB_URL = "jdbc:mysql://localhost/dbtest";
        //Base de datos credenciales    
        private final String USER = "root";
        private final String PASS = "";
    public void conectar(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con=null;
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbtest","root","");
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
    ////////////////////-------------PreparedStatement---------------/////////////////////
    public boolean leerPreparedStatement(Persona per) throws SQLException{
        boolean rpta = false;
        PreparedStatement ps = null;
         try{
            String sql = "SELECT * FROM test WHERE nombre = ? and pass = ?";
            System.out.println("Query =>" + sql);
           ps = con.prepareStatement(sql);
           ps.setString(1,per.getNombre());
           ps.setString(2,per.getPass());
            
           ResultSet rs = ps.executeQuery();
           
           if (rs.next()) {
                System.out.println("Existen datos");
                rpta = true;                 
            }else{
                System.out.println("no existen datos");
            }
                
            System.out.println("Consulta exitosa");
        }catch(Exception e){
             System.out.println(e.getMessage());
        }finally{
             ps.close();
         } 
        return rpta;
    }
    
     ////////////////////-------------Statement---------------/////////////////////
 
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
    
        ////////////////////-------------Statement---------------/////////////////////
    public void modificarBatchStatement(Persona per) throws SQLException {
		long ini = System.currentTimeMillis();
		try {
			con.setAutoCommit(false);

			for (int i = 0; i < 10000; i++) {
				Statement st = con.createStatement();
				String sql = "UPDATE test SET nombre = '" + per.getNombre() + "', pass = '" + per.getPass() + "'";
				//System.out.println("Query => " + sql);
				int numeroFilas = st.executeUpdate(sql);
				//System.out.println("#Filas Afectadas - Statement " + numeroFilas);
			}
			con.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			con.rollback();
		}
		long fin = System.currentTimeMillis();

		System.out.println("Statement : " + (fin - ini));
	}
    
  ////////////////////-------------PreparedStatement---------------/////////////////////
    
	public void modificarBatchPreparedStatement(Persona per) throws SQLException {
		long ini = System.currentTimeMillis();
		try {
			con.setAutoCommit(false);
			PreparedStatement ps = null;
			for (int i = 0; i < 10000; i++) {
				String sql = "UPDATE test SET nombre = ?,pass = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, per.getNombre());
				ps.setString(2, per.getPass());
				ps.addBatch();
			}
			ps.executeBatch();
			con.commit();
		} catch (Exception e) {
			con.rollback();
			System.out.println(e.getMessage());
		}
		long fin = System.currentTimeMillis();

		System.out.println("PreparedStatement : " + (fin - ini));
	}

    public static void main(String[] args) throws SQLException {
        AppStatement app = new AppStatement();
        app.conectar();
        /*
        //Prueba de leerPreparedStatement
        //boolean rpta = app.leerStatement(new Persona("Cyberspace", "32' OR 'M'='M"));
        boolean rpta = app.leerPreparedStatement(new Persona("Cyberspace", "32"));
        app.desconectar();
        if (rpta) {
           System.out.println("Verificacion correcta, Ingresando al sistema");
       }else{
          System.out.println("Verificacion Incorrecta, Acceso denegado");
        }
         */
        //prueba de modificarBatchStatement y  modificarBatchPreparedStatement
        
        app.modificarBatchStatement(new Persona("Cyberspace", "27"));
        System.out.println("***************************");
        app.modificarBatchPreparedStatement(new Persona("Cyberspace", "27"));
        app.desconectar();
    }
    
}
