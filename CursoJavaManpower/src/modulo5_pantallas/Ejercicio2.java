package modulo5_pantallas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto="curso de Java";
		
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}

	}

}
