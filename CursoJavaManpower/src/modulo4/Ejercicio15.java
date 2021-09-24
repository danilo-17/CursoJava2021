package modulo4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el numero para ver las caracteristicas de los coches");
		int caracter= sc.nextInt();
		
		switch(caracter) {
		
		case 1:
			System.out.println("El coche es de clase A y tiene\n- 4 ruedas\n- Motor");
			break;
		case 2:
			System.out.println("El coche es de clase B y tiene\n- 4 ruedas\n- Motor\n- Cierre centralizado\n- Aire");
			break;
		case 3:
			System.out.println("El coche es de clase C y tiene\n- 4 ruedas\n- Motor\n- Cierre centralizado\n- Aire\n- Airbag");
			break;
			
		default:
			System.out.println("No existe esta clase de coche");
			break;
		}

	}

}
