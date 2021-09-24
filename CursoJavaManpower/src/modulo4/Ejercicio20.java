package modulo4;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=sc.nextInt();
		int minimo = 0;
		int maximo = 0;
		do {
			int azar = (int)(Math.random()*100-1);
			System.out.println("El numero random de " + numero + " es " + azar);
			
			if(numero==0) {
				minimo=azar;
			}
			if (maximo<azar) {
				maximo=azar;
			}else if (minimo>azar) {
				minimo=azar;
			}
			numero++;
			
		}while(numero < 10) ;
				
		System.out.println("El maximo es "+ maximo + "\nEl minimo es "+ minimo);
	}

}
