package modulo4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=sc.nextInt();
		int suma=0;
		
		while(numero < 10) {
			
			int azar = (int)(Math.random()*100-1);
			System.out.println("El numero random de " + numero + " es " + azar);
			int numero1 = azar;
			suma += numero1;
			numero++;
		}
		
		float promedio = suma/10f;
		System.out.println("La suma de todos los numeros es " + suma);
		System.out.println("El promedio es " + promedio);
		

	}

}
