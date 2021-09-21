package modulo2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero\nPor ejemplo 1, 2 o 3");
		int numero=sc.nextInt();
		
		if(numero==1 && numero>=1 &&numero<=12) {
			System.out.println("Es la primera docena");
		}else if (numero==2 && numero>=13 &&numero<=24) {
			System.out.println("Es la segunda docena");
		}else if (numero==3 && numero>=25 &&numero<=36) {
			System.out.println("Es la tercera docena");
		}else {
			System.out.println("Docena no existe");
		}

	}

}
