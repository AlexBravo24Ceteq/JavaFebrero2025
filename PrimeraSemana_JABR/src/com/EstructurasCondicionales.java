package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {

		// Estructuras de condición. Nos permiten evaluar una condición
		// booleana y ejecutar un bloque de codigo si esa condicion
		// se cumple. Se pueden complementar con otra ejecución
		// en caso de que no se cumpla

		/*
		 * si (esto es verdero) { se ejecuta este bloque de codigo } si no se cumple {
		 * se ejecuta este bloque }
		 */

		int x = 9;

		System.out.println("Probando estructuras if/else");

		if (x <= 9) { // si esta condicion se cumple
			// Se ejecuta este bloque o instrucción de aqui
			System.out.println("Cierto");
		} else { // Si no / De otro modo
			// Se ejecuta este otro bloque de aqui
			System.out.println("Falso");
		}

		// OPERADORES LÓGICOS - CONDICIONES COMPUESTAS
		// AND , OR, NOT, IGUALDAD Y DIFERENTE DE

		// AND - && - Devuelve el valor true cuando se cumplen TODAS
		// LAS CONDICIONES

		System.out.println("Probando operador AND &&");

		if (x < 9 && x > 1) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// OR - || - Devuelve el valor true cuando se cumplen al menos UNA de
		// LAS CONDICIONES

		System.out.println("Probando operador OR ||");

		if (x < 9 || x > 1) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// NOT - ! - Se podría decir que este operador niega una condicion
		// O visto de otro modo, cambia el valor de una condicion de true a false
		// y viceversa

		System.out.println("Probando operador NOT !");

		if (!(x < 10)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// IGUALDAD o COMPARACION - == - Compara dos valores
		// y devuelve true cuando son IGUALES

		System.out.println("Probando operador IGUALDAD ==");

		if (x == 9) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// DIFERENTE DE - != - Compara dos valores
		// y devuelve true cuando son DIFERENTES

		System.out.println("Probando operador DIFERENTE DE !=");

		if (x != 11) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		
		//ESTRUCTURA IF ELSE ANIDADO
		//Nos permite evaluar varias condiciones en caso de ser necesario
		//Esta estructura es util cuando tengamos varias condciones compuestas
		
		int opcion = 1;
		
		if (opcion == 1) {
			System.out.println("Piedra");
		}else if (opcion == 2) {
			System.out.println("Papel");
		}else if (opcion == 3) {
			System.out.println("Tijera");
		}else {
			System.out.println("Error de opcion");
		}
		
		//SWITCH CASE - Nos permite evaluar varios escenarios de acuerdo al cambio de una variable
		
		int opcion2 = 3;
		
		switch (opcion2) {
		case 1:
			System.out.println("Piedra");
			break;
		case 2:
			System.out.println("Papel");
			break;
		case 3:
			System.out.println("Tijera");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
		//Operador modulo %
		
		
		
		
		
		

	} // cierre del main

} // cierre de la clase
