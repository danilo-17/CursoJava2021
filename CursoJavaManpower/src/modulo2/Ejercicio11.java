package modulo2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un caracter del abecedario");
		char caracter = sc.next().charAt(0);
		if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u') {
			System.out.println("Letra introducida es vocal");
		}else {
			System.out.println("No es vocal");
		}

	}

}
