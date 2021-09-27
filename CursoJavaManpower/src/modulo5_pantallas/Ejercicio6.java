package modulo5_pantallas;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		String cadena="Esta cadena contiene 1 y tambien el 7";
		System.out.println("Esta es la cadena: "+ cadena);
		
		char [] numeros=cadena.toCharArray();
		
		String num="";
		 
         for(int i = 0; i< cadena.length(); i ++){
             if(Character.isDigit(cadena.charAt(i))) {
            	 num+=numeros[i];
            	 
             }
         }
         System.out.println("Los numeros son: "+ num);
	}

}
