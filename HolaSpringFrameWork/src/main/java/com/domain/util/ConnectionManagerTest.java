package com.domain.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class ConnectionManagerTest {
	
	Connection con;
	
	@Before
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
