package modelo3;

public abstract class Persona {
	
	private String apellido;
	private String nombre;
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona() {
		super();
	}
	
	public Persona(String apellido, String nombre) {
		super();
		this.apellido = "Memphis";
		this.nombre = "Garcia";
	}
	@Override
	public String toString() {
		return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
	}
	
	public boolean equals(Object obj){		
		return obj instanceof Persona && super.equals(obj) && apellido == ((Persona)obj).getApellido()&& nombre==((Persona)obj).getNombre();		
	}
	
	public int hashCode() {
		return apellido.hashCode()+ nombre.hashCode();
	}
}
