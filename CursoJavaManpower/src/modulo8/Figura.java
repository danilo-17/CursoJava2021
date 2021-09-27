package modulo8;

public abstract class Figura {

	private static float maximaSuperficie;
	private String nombre;
	
	public Figura() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public static float getMaximaSuperficie() {
		return maximaSuperficie;
	}

	
	public static void setMaximaSuperficie(float maximaSuperficie) {
		Figura.maximaSuperficie = maximaSuperficie;
	}

	public abstract float calcularPerímetro();
	public abstract float calcularSuperficie();
	public abstract String getValores();
	
	public boolean equals(Object obj) {
		return obj instanceof Figura && ((Figura)obj).getNombre().equals(nombre);
	}
	
	public int hashCode() {
		return nombre.hashCode();
	}

	public String toString() {
		
		return "Nombre "+nombre;
	}
	
}
