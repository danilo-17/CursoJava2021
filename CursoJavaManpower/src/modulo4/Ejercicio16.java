package modulo4;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tabla = 0;
		do {
			System.out.println("ingresa la tabla a mostrar menor igual que 10 y mayor que 0");
			tabla = sc.nextInt();
		} while (tabla < 0 || tabla > 10);
		System.out.println("tabla del " + tabla);

		for (int i = 0; i < 11; i++) {
			int mult = tabla * i;
			System.out.println(tabla + "x" + i + "=" + mult);
		}

	}

}
