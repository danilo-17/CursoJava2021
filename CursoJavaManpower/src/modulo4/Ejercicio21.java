package modulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la categoria del empleado 1=A, 2=B, 3=C");
		char categoria=sc.next().charAt(0);
		int antiguedad=(int)(Math.random()*10);
		System.out.println("La antiguedad del empleado es: "+antiguedad);
		System.out.println("Introduce el sueldo del empleado");
		float sueldo=sc.nextFloat();
		System.out.println("El sueldo inicial es: "+ sueldo +"€");
	
		if (antiguedad >= 1 && antiguedad <= 5) {
			sueldo = sueldo * 1.05f;
		} else if (antiguedad >= 6 && antiguedad <= 10) {
			sueldo = sueldo * 1.1f;
		} else {
			sueldo = sueldo * 1.3f;
		}
		
		if (categoria == 'a') {
			sueldo += 1000;
		} else if (categoria == 'b') {
			sueldo += 2000;
		} else if (categoria == 'c') {
			sueldo += 3000;
		}
		

		System.out.println("El sueldo final es: "+ sueldo + "€");
		
	}

}
