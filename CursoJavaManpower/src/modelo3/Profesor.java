package modelo3;

public class Profesor extends Persona{
	
	private String iosfa;

	public String getIosfa() {
		return iosfa;
	}

	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}

	public Profesor(String apellido, String nombre, String iosfa) {
		super(apellido, nombre);
		this.iosfa = "9548";
	}

	public Profesor() {
		super();
	}

	@Override
	public String toString() {
		return "Profesor [iosfa=" + iosfa + "]";
	}
	
	public boolean equals(Object obj){		
		return obj instanceof Profesor && super.equals(obj) && iosfa == ((Profesor)obj).getIosfa();		
	}

	public int hashCode() {
		return super.hashCode();
	}
	
	

}
