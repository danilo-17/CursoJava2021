package modulo8;

public class Triangulo extends Figura {

	private float base;
	private float cateto1;
	private float cateto2;
	private float altura;

	public Triangulo() {
		base = 0;
		cateto1 = 0;
		cateto2 = 0;
		altura = 0;
	}

	public Triangulo(String nombre, float base, float cateto1, float cateto2, float altura) {
		super(nombre);
		this.base = base;
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
		this.altura = altura;

	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getCateto1() {
		return cateto1;
	}

	public void setCateto1(float cateto1) {
		this.cateto1 = cateto1;
	}

	public float getCateto2() {
		return cateto2;
	}

	public void setCateto2(float cateto2) {
		this.cateto2 = cateto2;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float calcularPerímetro() {
		float perimetro = base + cateto1 + cateto2;

		return perimetro;
	}

	@Override
	public float calcularSuperficie() {
		float superficie = (base * altura) / 2f;

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
		sb.append("cateto1: ");
		sb.append(this.cateto1);
		sb.append("cateto2: ");
		sb.append(this.cateto2);
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
		
		return obj instanceof Triangulo 
				&& super.equals(obj)
				&&getNombre() == ((Triangulo)obj).getNombre()
				&&getBase() == ((Triangulo)obj).getBase()
				&&getAltura() == ((Triangulo)obj).getAltura();
		
	}

}
