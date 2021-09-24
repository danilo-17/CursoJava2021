package modulo4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Por ejemplo 0=piedra, 1=papel y 2=tijera");
		
		System.out.println("Introduce un numero jugador uno");
		int jugador1=sc.nextInt();
		System.out.println("Introduce un numero jugador dos");
		int jugador2=sc.nextInt();
		
		if(jugador1==0 && jugador2==2 || jugador1==1 && jugador2==0 || jugador1==2 &&jugador2==1) {
			System.out.println("Ha ganado el jugador 1");
		}else if (jugador2==0 && jugador1==2 || jugador2==1 && jugador1==0 || jugador2==2 &&jugador1==1) {
			System.out.println("Ha ganado el jugador 2");
		}else {
			System.out.println("No ha ganado nadie");
		}
	}

}
