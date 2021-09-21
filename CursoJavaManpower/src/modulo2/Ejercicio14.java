package modulo2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un mes como numero");
		int mes=sc.nextInt();
		
		switch(mes) {
		
			case 1:
				System.out.println("Enhorabuena Campeon, medalla de oro");
			break;
			case 2:
				System.out.println("Enhorabuena, medalla de plata");
			break;
			case 3:
				System.out.println("Enhorabuena, medalla de bronce");
			break;
			
			default:
				System.out.println("No existe la posicion indicado");
			break;
		}
	}
}
