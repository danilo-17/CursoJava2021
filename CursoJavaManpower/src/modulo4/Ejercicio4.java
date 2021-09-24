package modulo4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce una de las tres letras\n A, B o C");
		String letra=sc.nextLine();
		
		if (letra.equalsIgnoreCase("a")) {
			System.out.println("Hijo");
		}else if (letra.equalsIgnoreCase("b")) {
			System.out.println("Padres");
		}else if (letra.equalsIgnoreCase("c")) {
			System.out.println("Abuelos");
		}

	}

}
