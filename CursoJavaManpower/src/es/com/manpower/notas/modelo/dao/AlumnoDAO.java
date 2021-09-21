package es.com.manpower.notas.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import es.com.manpower.notas.modelo.Alumno;
import es.com.manpower.notas.modelo.Model;
import es.com.manpower.notas.modelo.util.ConnectionManager;

public class AlumnoDAO implements DAO {
	
	private Connection con;

	@Override
	public void agregar(Model pModel) throws ClassNotFoundException, SQLException {
		Alumno alumno=(Alumno)pModel;
		
		//1ª Me tengo que conectar a la base de datos
		ConnectionManager.conectar();
		con=ConnectionManager.getConection();
		
		//2ª Statemente
		StringBuilder sql=new StringBuilder("INSERT INTO alumnos (ALU_NOMBRE,ALU_APELLIDO,ALU_ESTUDIOS,ALU_LINKGIT)VALUES ");
		sql.append("?,?,?,?");
		PreparedStatement stm=con.prepareStatement(sql.toString());
		stm.setString(1, alumno.getNombre());
		stm.setString(2, alumno.getApellido());
		stm.setString(3, alumno.getEstudios());
		stm.setString(4, alumno.getLinkARepositorio());
		
		stm.executeUpdate();
		ConnectionManager.desConectar();
	}

	@Override
	public void modificar(Model pModel) throws ClassNotFoundException, SQLException {
		Alumno alumno=(Alumno)pModel;
		
		//1ª Me tengo que conectar a la base de datos
		ConnectionManager.conectar();
		con=ConnectionManager.getConection();
		
		StringBuilder sql=new StringBuilder("UPDATE alumnos SET (ALU_NOMBRE,ALU_APELLIDO,ALU_ESTUDIOS,ALU_LINKGIT)VALUES ");
		sql.append("?,?,?,?");
		PreparedStatement stm=con.prepareStatement(sql.toString());
		stm.setString(1, alumno.getNombre());
		stm.setString(2, alumno.getApellido());
		stm.setString(3, alumno.getEstudios());
		stm.setString(4, alumno.getLinkARepositorio());
		
		stm.executeUpdate();
		ConnectionManager.desConectar();
		
	}

	@Override
	public void eliminar(Model pModel) throws ClassNotFoundException, SQLException {
		
	Alumno alumno=(Alumno)pModel;
		
		//1ª Me tengo que conectar a la base de datos
		ConnectionManager.conectar();
		con=ConnectionManager.getConection();
		
		StringBuilder sql=new StringBuilder("DELETE FROM alumnos WHERE ALU_ID = '"+alumno.getCodigo()+ "'");
		sql.append("?,?,?,?");
		PreparedStatement stm=con.prepareStatement(sql.toString());
		stm.setLong(1, alumno.getCodigo());
	
		
		stm.executeUpdate();
		ConnectionManager.desConectar();

	}

	@Override
	public List<Model> leer(Model pModel) {
		return null;
	}

}
