package es.com.manpower.notas.modelo.util;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConnectionManagerTest {
	
	Connection con;
	
	@BeforeEach
	public void setUp() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower", "root","Danilodejesus-8");
		 ConnectionManager.conectar();
	}
	
	@After
	public void tearDown() throws Exception {
		con=null;
		ConnectionManager.desConectar();
	}

	@Test
	void testConectar() {
		try {
			ConnectionManager.conectar();
			assertTrue(ConnectionManager.getConection().isValid(0));
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	void testDesConectar() {
		try {
			ConnectionManager.desConectar();
			assertTrue(ConnectionManager.getConection().isClosed());
		} catch (SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	void testGetConection() throws SQLException {
		
		assertFalse(ConnectionManager.getConection().isClosed());
	}

}
