package modulo2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce una de las posiciones\n1, 2 o 3");
		int pos=sc.nextInt();
		
		if (pos==1) {
			System.out.println("Ha ganado la medalla de oro");
		}else if (pos==2) {
			System.out.println("Ha ganado la medalla de plata");
		}else if (pos==3) {
			System.out.println("Ha ganado la medalla de  bronce");
		}else {
			System.out.println("Siga participando");
		}

	}

}
