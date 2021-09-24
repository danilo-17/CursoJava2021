package modulo5_pantallas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		String nombre=sc.nextLine();
		
		System.out.println("Introduce el apellido");
		String apellido=sc.nextLine();
		
		String suma=nombre + " "+ apellido ;
		
		System.out.println(suma);

	}

}
