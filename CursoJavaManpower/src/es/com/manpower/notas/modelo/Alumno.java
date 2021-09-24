package es.com.manpower.notas.modelo;

import java.util.List;

public class Alumno implements Model{
	
	private int codigo;
	private String nombre;
	private String apellido;
	private String estudios;
	private String linkARepositorio;
	private List<PracticaResuelta> practicasResueltas;
	
	public Alumno() {
	}

	public Alumno(int codigo, String nombre, String apellido, String estudios, String linkARepositorio,
			List<PracticaResuelta> practicasResueltas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estudios = estudios;
		this.linkARepositorio = linkARepositorio;
		this.practicasResueltas = practicasResueltas;
	}
	
	

	public Alumno(int codigo, String nombre, String apellido, String estudios, String linkARepositorio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estudios = estudios;
		this.linkARepositorio = linkARepositorio;
	}

	public Alumno(int pCod) {
		codigo=pCod;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getLinkARepositorio() {
		return linkARepositorio;
	}

	public void setLinkARepositorio(String linkARepositorio) {
		this.linkARepositorio = linkARepositorio;
	}

	public List<PracticaResuelta> getPracticasResueltas() {
		return practicasResueltas;
	}

	public void setPracticasResueltas(List<PracticaResuelta> practicasResueltas) {
		this.practicasResueltas = practicasResueltas;
	}

	public boolean equals(Object obj) {
		return obj instanceof Alumno && ((Alumno)obj).getNombre().equals(nombre) && ((Alumno)obj).getApellido().equals(apellido);
	}
	
	public int hashCode() {
		return nombre.hashCode() + apellido.hashCode();
	}
	
	public String toString() {
		
		StringBuilder sb=new StringBuilder("codigo= ");
		sb.append(this.codigo);
		sb.append(", nombre");
		sb.append(this.nombre);
		sb.append(", apellido");
		sb.append(this.apellido);
		sb.append(", estudios");
		sb.append(this.estudios);
		sb.append(", linkARepositorio");
		sb.append(this.linkARepositorio);
		sb.append(", practicasResueltas");
		sb.append(this.practicasResueltas);
		return sb.toString();
	}
}
