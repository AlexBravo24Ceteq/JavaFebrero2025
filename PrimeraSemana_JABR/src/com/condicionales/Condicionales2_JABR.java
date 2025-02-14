package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JABR {

	public static void main(String[] args) {

		// Ejercicio 2 - Realiza un programa que pida un número por teclado
		// y nos indique si es par o impar.
		
		System.out.println("=================================");
		System.out.println("===========PROBLEMA 2============");
		System.out.println("=PROGRAMA PARA EVALUAR 1 NUMERO==");
		System.out.println("=Y DETERMINAR SI ES PAR O IMPAR==");
		System.out.println("=================================");
		System.out.println();

		// Declaramos una variable donde guardar el numero ingresado por teclado
		int numero;
		// Creamos un objeto Scanner para poder introducir un valor por teclado
		Scanner entrada = new Scanner(System.in);
		// Mandamos la instrucción a consola para introducir un valor
		System.out.println("Introduce un número");
		// Asignamos el valor de lo introducido a la variable numero
		numero = entrada.nextInt();

		// Evaluamos mediante el operador de modulo la división del número entre 2.
		// Si esta operación no deja residuo, es decir, es igual a 0 el residuo
		// Entonces el número es par
		// Si no, es impar

		if (numero % 2 == 0) {
			System.out.println("Evaluando:... ");
			System.out.println();
			System.out.println("El número es par");
		} else {
			System.out.println("Evaluando:... ");
			System.out.println();
			System.out.println("El número es impar");
		}
		
		System.out.println();
		System.out.println("=================================");
		System.out.println("========FIN DEL PROGRAMA=========");
		System.out.println("=================================");

	}

}
