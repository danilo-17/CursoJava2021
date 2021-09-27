package modulo8;

public class Cuadrado extends Figura {

	private float lado;

	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(String nombre, float lado) {
		super(nombre);
		this.lado = lado;

	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float calcularPerímetro() {
		
		float perimetro = lado * 4;
		return perimetro;
	}

	@Override
	public float calcularSuperficie() {
		
		float superficie = lado * lado;
		
		if(superficie > Figura.getMaximaSuperficie()) {
			
			Figura.setMaximaSuperficie(superficie);
			
		}
		return superficie;
	}
		
		

	public String getValores() {

		StringBuilder sb = new StringBuilder("lado: ");
		sb.append(this.lado);
		sb.append("area : ");
		sb.append(calcularSuperficie());
		sb.append("perimetro: ");
		sb.append(calcularPerímetro());

		return sb.toString();

	}
	
	public String toString() {
		
		return super.toString() + getValores() + "\n";
		
	}
	
	public int hashCode() {
		
		return (int) (getNombre().hashCode() + getMaximaSuperficie() + calcularPerímetro());
		
	}
	
	public boolean equals(Object obj) {
		
		return obj instanceof Cuadrado 
				&& super.equals(obj)
				&&getNombre() == ((Cuadrado)obj).getNombre()
				&&getLado() == ((Cuadrado)obj).getLado();
		
	}

}
