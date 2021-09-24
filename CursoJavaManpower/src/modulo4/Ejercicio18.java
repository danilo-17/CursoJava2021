package modulo4;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero=sc.nextInt();
		
		for (int i = numero; i < (numero +10); i++) {
			System.out.println("Tabla " + i + ": ");
			for (int j = 0; j < 11; j++) {
				int suma=i*j;
				System.out.println(i + " X " + j + " = " + suma);
			}
		}

	}

}
