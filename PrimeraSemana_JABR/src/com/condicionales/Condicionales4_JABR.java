package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JABR {

	public static void main(String[] args) {
		// Ejercicio 4 - Realiza un programa que lea una cadena por teclado
		// y compruebe si es una letra mayúscula.

		System.out.println("=====================================");
		System.out.println("=============PROBLEMA 4==============");
		System.out.println("===PROGRAMA COMPROBAR SI UNA CADENA==");
		System.out.println("=DE TEXTO CONTIENE LETRAS MAYÚSCULAS=");
		System.out.println("=====================================");
		System.out.println();

		String cadena;
		
		// Declaro un Scanner para introducir por teclado la cadena de texto
		Scanner entrada = new Scanner(System.in);

		// Mando el msj a consola para introducir la cadena de texto y guardarla
		System.out.println("Introduce una cadena de texto");

		cadena = entrada.next();
	
		// Evaluamos si la cadena original es igual a la cadena convertida en minusculas
		// Si la cadena original es igual a la segunda, entonces, contiene minusculas
		// De lo contrario, contiene mayúsculas

		System.out.println();
		
		if (cadena.equals(cadena.toLowerCase())) {
			System.out.println("Evaluando... ");
			System.out.println();
			System.out.println("El texto esta en minusculas");
		} else {
			System.out.println("Evaluando... ");
			System.out.println();
			System.out.println("El texto tiene maýusculas");
		}
		
		System.out.println();
		System.out.println("=================================");
		System.out.println("========FIN DEL PROGRAMA=========");
		System.out.println("=================================");
	}

}
