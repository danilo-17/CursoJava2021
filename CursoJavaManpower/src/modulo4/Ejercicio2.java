package modulo4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce el numero");
		int numero=sc.nextInt();
		
		if(numero%2==00) {
			System.out.println("El numero es par");
		}else{
			System.out.println("El numero es impar");
		}

	}

}
