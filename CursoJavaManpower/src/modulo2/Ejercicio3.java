package modulo2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce el me\nPor ejemplo 1 es Enero, 2 Febrero...");
		int mes=sc.nextInt();
		
		if(mes==1) {
			System.out.println("El mes es enero, tiene 31 dias");
		}else if (mes==2) {
			System.out.println("El mes es febrero, tiene 28 dias o 29 dias");
		}else if (mes==3) {
			System.out.println("El mes es marzo, tiene 31 dias");
		}else if (mes==4) {
			System.out.println("El mes es abril, tiene 30 dias");
		}else if (mes==5) {
			System.out.println("El mes es mayo, tiene 31 dias");
		}else if (mes==6) {
			System.out.println("El mes es junio, tiene 30 diass");
		}else if (mes==7) {
			System.out.println("El mes es julio, tiene 31 dias");
		}else if (mes==8) {
			System.out.println("El mes es agosto, tiene 31 dias");
		}else if (mes==9) {
			System.out.println("El mes es septiembre, tiene 30 dias");
		}else if (mes==10) {
			System.out.println("El mes es octubre, tiene 31 dias");
		}else if (mes==11) {
			System.out.println("El mes es noviembre, tiene 30 dias");
		}else if (mes==12) {
			System.out.println("El mes es diciembre, tiene 31 dias");
		}
		

	}

}
