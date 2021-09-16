package modulo1;

public class Ejercicio3 {

	public static void main(String[] args) {
		byte bmin = -128;
		byte bmax = 127;
		short smin = (short)(Math.pow(2, 15)*(-1));
		short smax = (short)(Math.pow(2, 15)-1);
		int imax = (int)(Math.pow(2, 31)-1);
		int imin = (int)(Math.pow(2, 31)*(-1));
		long lmin = (long)(Math.pow(2, 63)*(-1));
		long lmax = (long)Math.pow(2, 63);

		System.out.println("Tipo de dato \t\t\t\t Minimo \t\t\t\t\t Maximo");
		System.out.println("------ \t\t\t\t\t ------ \t\t\t\t\t ------");
		System.out.println("Byte \t\t\t\t\t " + bmin + "\t\t\t\t\t\t " + bmax);
		System.out.println("Short \t\t\t\t\t " + smin + "\t\t\t\t\t\t " + smax);
		System.out.println("Int \t\t\t\t\t " + imin + "\t\t\t\t\t " + imax);
		System.out.println("Long \t\t\t\t\t " + lmin + "\t\t\t\t " + lmax);
		
	}

}
