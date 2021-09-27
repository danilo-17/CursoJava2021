package modulo5_pantallas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String email="gcasas1972@gmail.com";
		char pos='@';
		
		String[] email1 = email.split("@");
		
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i)=='@') {
				System.out.println("La posicion de arroba es: "+email.indexOf(pos));
			}
		}
		System.out.println("El primer string "+email1[0]);
		System.out.println("El segundo string "+email1[1]);

	}

}
