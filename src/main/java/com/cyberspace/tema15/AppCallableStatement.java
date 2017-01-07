/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema15;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author ariel.villarreal
 */
public class AppCallableStatement {

   
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
    public void registrarCallableStatement(com.cyberspace.tema15.Persona per){
		try{
			String sql = "{call spTest(?,?)}";
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1, per.getNombre());
			cs.setString(2, per.getPass());
			cs.execute();
			cs.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
    
    
	
	public void listarCallableStatement(){
		try{
			String sql = "{call spListar()}";
			CallableStatement cs = con.prepareCall(sql);			
			cs.execute();
			
			ResultSet rs = cs.getResultSet();
			
			while(rs.next()){
				System.out.print(rs.getInt("id"));
				System.out.print(rs.getString("nombre"));
				System.out.println(rs.getString("pass"));
			}
			cs.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void listarOutCallableStatement(Persona per){
		try{
			String sql = "{call spSalidaID(?,?)}";
			CallableStatement cs = con.prepareCall(sql);			
			cs.setString(1, per.getNombre());
			cs.registerOutParameter("idParam", Types.INTEGER);
			cs.execute();
			
			int idSalida = cs.getInt("idParam");
			System.out.println("El codigo obtenido de salida es: " + idSalida);
			cs.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	
	public boolean leerPreparedStatement(Persona per) throws SQLException {
		boolean rpta = false;
		PreparedStatement ps = null;

		try {
			String sql = "SELECT * FROM test WHERE nombre = ? and pass = ?";
			System.out.println("Query => " + sql);

			ps = con.prepareStatement(sql);
			ps.setString(1, per.getNombre());
			ps.setString(2, per.getPass());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("exiten datos");
				rpta = true;
			} else {
				System.out.println("no existen datos");
			}

			System.out.println("Consulta exitosa");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ps.close();
		}
		return rpta;
	}
    
    public static void main(String[] args) throws SQLException {
        AppCallableStatement app = new AppCallableStatement();
		app.conectar();

		//app.registrarCallableStatement(new Persona("Mito", "25"));
		app.registrarCallableStatement(new Persona("Ariel", "25"));

		app.desconectar();
    }
    
}
