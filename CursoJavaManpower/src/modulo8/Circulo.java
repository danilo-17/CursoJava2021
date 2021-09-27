package modulo8;

public class Circulo extends Figura {

	private float radio;

	public Circulo() {

	}

	public Circulo(String nombre, float radio) {
		super(nombre);
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public String getValores() {

		StringBuilder sb = new StringBuilder("radio: ");
		sb.append(this.radio);
		sb.append("area : ");
		sb.append(calcularSuperficie());
		sb.append("perìmetro: ");
		sb.append(calcularPerímetro());

		return sb.toString();

	}

	public float calcularPerímetro() {

		float perimetro = 2 * (float) Math.PI * radio;

		return perimetro;
	}

	public float calcularSuperficie() {

		float superficie = (float) Math.PI * radio * radio;

		if (superficie > Figura.getMaximaSuperficie()) {

			Figura.setMaximaSuperficie(superficie);

		}

		return superficie;
	}

	public String toString() {

		return super.toString() + getValores() + "\n";

	}
	
    public boolean equals(Object obj) {
		
		return obj instanceof Circulo
				&&super.equals(obj)
				&&getNombre() == ((Circulo)obj).getNombre()
				&&getRadio() == ((Circulo)obj).getRadio();
		
	}
}
