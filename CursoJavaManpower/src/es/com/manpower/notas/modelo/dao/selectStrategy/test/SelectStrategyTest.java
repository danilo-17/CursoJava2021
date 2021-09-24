package es.com.manpower.notas.modelo.dao.selectStrategy.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.com.manpower.notas.modelo.Alumno;
import es.com.manpower.notas.modelo.dao.selectStrategy.SelectStrategy;

public class SelectStrategyTest  {

	Alumno aluVacio;
	Alumno aluConCodigo;
	Alumno aluConNombre;
	Alumno aluConNombreYapellido;
	Alumno aluConEstudios;
	Alumno aluConNombreEstudiosLink;
	
	@Before
	public void setUp() throws Exception {
		
		aluVacio=new Alumno();
		aluConCodigo=new Alumno(10);
		aluConNombre=new Alumno(0, "Gabriel", null,null, null);
		aluConNombreYapellido=new Alumno(0, "Gabriel", "Casas", null, null, null);
		aluConEstudios=new Alumno(0, null, null, "DAM", null);
		aluConNombreEstudiosLink=new Alumno(0, "Gabriel", null, "DAM", "http://gitlab/gcasas1972");
		
	}

	@After
	public void tearDown() throws Exception {
		aluVacio=null;
		aluConCodigo=null;
		aluConNombre=null;
		aluConNombreYapellido=null;
		aluConEstudios=null;
	}
	
	@Test
	public void testGetSqlVacio() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos", 
				SelectStrategy.getSql(aluVacio));
	}
	
	@Test
	public void testGetSqlNull() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos", 
				SelectStrategy.getSql(null));
	}


	@Test
	public void testGetSql() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_id=10", 
				SelectStrategy.getSql(aluConCodigo));
	}
	
	@Test
	public void testGetNombre() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_nombre like '%Gabriel%'",
				SelectStrategy.getSql(aluConNombre));
	}
	
	@Test
	public void testGetApellido() {
		StringBuilder sb=new StringBuilder("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit");
		sb.append(" from alumnos");
		sb.append(" where alu_nombre like '%Gabriel%'");
		sb.append(" and alu_apellido like '%Casas%'");
		assertEquals(sb.toString(), SelectStrategy.getSql(aluConNombreYapellido));
	}
	
	@Test
	public void testGetEstudios() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_estudios like '%DAM%'", 
				SelectStrategy.getSql(aluConEstudios));
	}
	
	@Test
	public void testGetLinkgit() {
		StringBuilder sb=new StringBuilder("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit");
		sb.append(" from alumnos");
		sb.append(" where alu_nombre like '%Gabriel%'");
		sb.append(" and alu_estudios like '%DAM%'");
		sb.append(" and alu_linkgit like '%http://gitlab/gcasas1972%'");
		assertEquals(sb.toString(), SelectStrategy.getSql(aluConNombreEstudiosLink));
	}

}
