package modulo4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int numero=sc.nextInt();
		
		if(numero==0) {
			System.out.println("Jardín de infantes");
		}else if(numero>=1&&numero<=6) {
			System.out.println("Primaria");
		}else if (numero>=7&&numero<=12) {
			System.out.println("Secundaria");
		}else {
			System.out.println("No existe");
		}

	}

}
