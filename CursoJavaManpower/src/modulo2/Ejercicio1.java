package modulo2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la nota de Lengua");
		float notaLengua=sc.nextFloat();
		
		System.out.println("Introduce la nota de Matematicas");
		float notaMatematicas=sc.nextFloat();
		
		System.out.println("Introduce la nota de Historia");
		float notaHistoria=sc.nextFloat();
		
		
		float prom=(notaLengua + notaMatematicas + notaHistoria)/3;
		
		if(prom>=7) {
			System.out.println("Has aprobado\nLa nota media es: "+ prom);
		}else {
			System.out.println("Has suspendido\nLa nota media es: "+ prom);
			
		}

	}

}
