package es.com.manpower.notas.modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	
	private static Connection connection;
	
	public static void conectar() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower", "root","Danilodejesus-8");
		//Statement stm = conexion.createStatement();
	}
		
	public static void desConectar() throws SQLException {
		connection.close();
	}
	public static Connection getConection() {
		return connection;
	}

}
