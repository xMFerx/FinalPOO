package model;

/**
 * Clase con la conexión a la base de datos local
 * 	 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLconnection {

	private final String USER ="root";
	private final String URL ="jdbc:mysql://localhost:3306/store"; //jdcb:mysql://[ip]:[port]
	private final String PASSWORD ="";
	private Connection con = null;
	
	public Connection getConnection() {
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);			
			
		}catch(SQLException sqlEx) {					
			System.err.println(sqlEx); 			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
