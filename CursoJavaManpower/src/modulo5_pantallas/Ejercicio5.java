package modulo5_pantallas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String email="gcasas1972@gmail.com";
		char pos='@';
		
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i)=='@') {
				System.out.println(email.charAt(i));
			}
		}

	}

}
