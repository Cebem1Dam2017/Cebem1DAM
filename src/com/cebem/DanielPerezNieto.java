package com.cebem;
import java.util.Scanner;

public class DanielPerezNieto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ponga su nombre: ");
		String nb = sc.next().trim();
		
		System.out.println("");
		System.out.println("Tu nombre es: "+nb);
		
		System.out.println("");
		System.out.println("Tiene "+cuentaLetras(nb)+" letras");
		
		System.out.println("");
		System.out.println("En mayusculas es: "+pasarMayusculas(nb));
		
		System.out.println("");
		System.out.println("Al reves es: "+nombreReves(nb));
	}

	public static int cuentaLetras(String nb) {
		int letras = 0;

		for (int c = 0; c <= nb.length() - 1; c++) {
			letras++;
		}

		return letras;
	}

	public static String pasarMayusculas(String nb) {
		String mayusculas = nb.toUpperCase();

		return mayusculas;
	}

	public static String nombreReves(String nb) {
		String reves = "";
		for (int c = nb.length() - 1; c >= 0; c--) {
			reves += nb.charAt(c);
		}

		return reves;
	}

}
