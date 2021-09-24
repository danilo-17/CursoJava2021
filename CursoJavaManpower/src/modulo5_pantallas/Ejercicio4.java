package modulo5_pantallas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto="Esto es una prueba de la clase String";
		
		int con=0;
		int vocal=0;
		
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' || texto.charAt(i)=='o' || texto.charAt(i)=='u') {
				vocal++;
			}else {
				con++;
			}
		}
		System.out.println("Tiene "+ vocal +" vocales");
		System.out.println("Tiene "+ con +" vocales");
	}

}
