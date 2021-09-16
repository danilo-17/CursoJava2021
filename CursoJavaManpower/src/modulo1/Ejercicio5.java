package modulo1;

public class Ejercicio5 {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i = 30;
		long l= 40;
		byte sumabb=(byte)((byte) b+b);
		short sumabs=(short)((byte)b+s);
		int sumabi=b+i;
		int sumaii=i+i;
		long sumasl=s+l;
		
		System.out.println("Primera suma "+ sumabb);
		System.out.println("Segunda suma "+ sumabs);
		System.out.println("Tercera suma "+ sumabi);
		System.out.println("Cuarta suma "+ sumaii);
		System.out.println("Quinta suma "+ sumasl);

	}

}
