package modulo8;

public class Rectangulo extends Figura {

	private float altura;
	private float base;

	public Rectangulo() {

	}

	public Rectangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;

	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public float calcularPerímetro() {
		float perimetro = altura * 2 + base * 2;

		return perimetro;
	}

	@Override
	public float calcularSuperficie() {
		float superficie = base * altura;
		if (superficie > Figura.getMaximaSuperficie()) {
			Figura.setMaximaSuperficie(superficie);
		}
		return superficie;
	}

	@Override
	public String getValores() {

		StringBuilder sb = new StringBuilder("base: ");
		sb.append(this.base);
		sb.append("altura: ");
		sb.append(this.altura);
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

		return obj instanceof Rectangulo && super.equals(obj) && getNombre() == ((Rectangulo) obj).getNombre()
				&& getBase() == ((Rectangulo) obj).getBase() && getAltura() == ((Rectangulo) obj).getAltura();

	}

}
