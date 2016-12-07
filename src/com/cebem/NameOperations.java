package com.cebem;

import java.util.Scanner;

public class NameOperations {

	private static final char WHITE_SPACE = ' ';

	public String printName(String name) {
		return name;
	}

	public int countString(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != WHITE_SPACE) {
				count++;
			}
		}
		return count;
	}

	public String uppercaseName(String name) {
		return name.toUpperCase();
	}

	public String turnName(String name) {
		int i;
		String res = "";
		for (i = (name.trim().length() - 1); i >= 0; i--) {
			res = res + name.charAt(i);
		}
		return res;
	}

	private void iniciar() {
		Scanner keyb = new Scanner(System.in);
		String name;
		System.out.println("Introduce tu nombre:");
		name = keyb.nextLine();
		name = name.trim();
		System.out.println("Tu nombre es " + printName(name));
		System.out.println("Tu nombre tiene " + countString(name) + " letras");
		System.out.println("Tu nombre en mayúsculas es " + uppercaseName(name));
		System.out.println("Tu nombre al revés es " + turnName(name));
		keyb.close();

	}

	public static void main(String[] args) {
		NameOperations name = new NameOperations();
		name.iniciar();
	}
}
