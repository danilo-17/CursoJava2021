package modelo3;

public class Alumno extends Persona{
	
	private int legajo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Alumno(String apellido, String nombre,int legajo) {
		super(apellido, nombre);
		this.legajo = 978;
	}

	public Alumno() {
		super();
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + "]";
	}
	
	public boolean equals(Object obj){		
		return obj instanceof Alumno && super.equals(obj)&& legajo == ((Alumno)obj).getLegajo();		
	}


	public int hashCode() {
		return super.hashCode();
	}
	
	
}
