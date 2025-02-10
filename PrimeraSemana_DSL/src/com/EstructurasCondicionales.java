package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras de condicion nos permiten evaluar una condicion
		//booleana y ejecutar un bloque de codigo si esa condicion
		// se cumple. Se puede complementar con otra ejecucion
		//en caso de que no se cumpla
		
		/*
		 * si (esto es verdadero){
		 *   se ejecuta este bloque de codigo
		 *  } sino se cumple {
		 *  se ejecuta este bloque
		 *  }
		 */

		int x = 9;
		
		System.out.println("Probando estructuras if/else");
		
		if(x<10) {//si la condicion se cumple se ejecuta este bloque
			System.out.println("Cierto");
		} else {//sino se ejecuta este otro bloque
			System.out.println("Falso");
		}
		
		//Operadores logicos- Condiciones compuestas
		// AND,OR,NOT,IGUALDAD O DIFERENTE DE
		
		//AND-&&- Devuelve el valor true cuando se cumplen todas las condiciones
		
		System.out.println("Probando operador AND &&");
		
		if(x<9 && x>1){
			System.out.println("cierto");
		} else {
			System.out.println("Falso");
		}
		
		//Operador OR - ||- Devuelve el valor true cuando se cumple al menos una de las condiciones
		
		System.out.println("Probando operador OR ||");
		
		if(x<9 || x>1) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//NOT- ! - Se podria decir que este operador niega una condicion o visto
		//de otra manera, cambia el valor de una condicion de true a false y vicerversa.
		
		System.out.println("Probando operador NOT !");
		
		if(!(x<10)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");	
		}
		
		//IGUALDAD O COMPARACION - == - Compara dos valores y devuelve true cuando son iguales
		
		if(x == 9) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//DIFERENTE DE - != - Compara dos valores y devulve true cuando son DIFERENTES
		
		System.out.println("Probando operador DIFERENTE DE !=");
		
		if (x!= 11) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
			}
		
		//ESTRUCTURA IF ELSE ANIDADO
		//Nos permite evaluar varias condiciones en caso de ser necesario
		//Esta estructura es util cuando tengamos varias condiciones compuestas
		
		int opcion = 1;
		
		if (opcion == 1) {
			System.out.println("Piedra");
		} else if(opcion ==2) {
			System.out.println("Papel");
		} else if (opcion == 3) {
			System.out.println("Tijera");
		} else {
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
				System.out.println("error");
				break;
				
			//Operador modulo %
		}
		}
	}

