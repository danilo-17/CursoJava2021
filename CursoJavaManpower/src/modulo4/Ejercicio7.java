package modulo4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce el primer numero");
		int numero1=sc.nextInt();
		
		System.out.println("Introduce el segundo numero");
		int numero2=sc.nextInt();
		
		System.out.println("Introduce el tercer numero");
		int numero3=sc.nextInt();
		
		if (numero1>numero2 && numero1>numero3 ) {
			System.out.println("Imprimo el "+ numero1);
		}else if (numero2>numero1 && numero2>numero3) {
			System.out.println("Imprimo el "+ numero2);
		}else if (numero3>numero1 && numero3>numero2) {
			System.out.println("Imprimo el "+ numero3);
		}else {
			System.out.println("Ninguno es mayor");
		}
		

	}

}
