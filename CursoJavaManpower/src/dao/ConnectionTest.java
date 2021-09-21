package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	
	public ConnectionTest() {
		
	}

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower", "root","Danilodejesus-8");
			Statement stm = conexion.createStatement();
			ResultSet rs= stm.executeQuery("select alu_id, alu_apellido, alu_nombre, alu_estudios, alu_linkgit from alumnos");
			while(rs.next()) {
				System.out.println("Apellido ="+rs.getString("alu_apellido"));
				System.out.println("Nombre="+rs.getString("alu_nombre"));
			}
			rs.close();
			conexion.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
