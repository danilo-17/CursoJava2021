package modulo4;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		int tabla = 0;
		int suma=0;
		do {
			System.out.println("ingresa la tabla a mostrar menor igual que 10 y mayor que 0");
			Scanner sc = new Scanner(System.in);
			tabla = sc.nextInt();
		} while (tabla < 0 || tabla > 10);
		System.out.println("Tabla del " + tabla);

		for (int i = 0; i < 11; i++) {
			int resultado = tabla * i;
			System.out.println(tabla + "x" + i + "=" + resultado);
			if (resultado % 2 == 0) {
				int sumando = resultado;
				suma += sumando;
			}
		}
		System.out.println("La suma de los numeros pares es "+ suma);
	}
}

//No  se como haverlo con un algoritmo.