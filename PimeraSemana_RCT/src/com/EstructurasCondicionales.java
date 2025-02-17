package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estas estructuras de condicion nos permite evaluar una condicion boleeana
		//y ejecutar un bloque de codigo si esa condicion se cumple, y se puede complementar
		//con otra ejecucion en caso de qeu no se cumpla
		
		/*
		 * s (esto es verdadero) {
		 *    se ejecuta este bloque de codigo
		 * } si no se cumple {
		 * se ejecuta este bloque
		 * }   
		 */
		
		int x = 9;
		
		System.out.println("Probando estructuras if/else");
		
		if (x<9) { //si esta condicion se cumple se ejecuta este bloque o instrucion de aqui
			System.out.println("Cierto");
		} else { //si no / de otro modo se ejecuta este otro bloque
			
            System.out.println("Falso");
            
		}
			
		//OPERADORES LOGICOS - CONDICIONES COMPUESTAS
		//AND, OR, NOT, IGUALDAD DIFERENTE DE 
			
		//AND - && - Devuelve el valor true cuando se cumplen Todas
			//las condiciones
		
		System.out.println("Probando operador AND &&");
		
		if (x<9 && x > 1) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//OR - || - Devuelve el valor true cuando se cumplen al menos una de las condiciones
		
		System.out.println("Probando operador OR ||");
		
		if (x<9 || x > 1) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		
		
		//NOT - ! - se podria decir que este operador niega una condicion
		// o visto de otro modo cambia el valor de una condicion de true a false
		//y viceversa
		
				System.out.println("Probando operador NOT !");
				
				if (!(x<10)) {
					System.out.println("Cierto");
				} else {
					System.out.println("falso");
				}
				
				// IGUALDAD O COMPARACION - == - ciompara 2 valores
				// y devuelve true cuando son iguales
				
				System.out.println("probando operador igualdad ==");
				
				if (x == 9) {
					System.out.println("cierto");
				}else {
					System.out.println("falso");
				}
				
				
				// DIFERENTE DE - != - compara 2 valores
				// y devuelve true cuando son DIFERENTES
				
				System.out.println("probando operador diferente !=");
				
				if (x != 9) {
					System.out.println("cierto");
				}else {
					System.out.println("falso");
				}
				
				// estructura if else anidado
				//nos permite evaluar varias condiciones en caso de ser necesario
				//esta estructura es util cuando tengamos varias
				//condiciones compuestas
				
				int opcion = 1;
				
				if (opcion == 1) {
					System.out.println("piedra");
				}else if (opcion == 2) {
					System.out.println("papel");
				}else if (opcion == 3) {
					System.out.println("tijera");
				}else {
					System.out.println("error de opcion");
				}
				
				//nos permite evaluar varios escenarios de acuerdo al cambio de variable
				
				int opcion2 = 3;
				
				switch (opcion2) {//whitch ctrl+space y genera cod
				case 1:
					System.out.println("piedra");
					break;
				case 2:
					System.out.println("papel");
					break;
				case 3:
					System.out.println("tijera");
					break;	

				default:
					System.out.println("error");
					break;
				}
				
				
				//Operador modulo %
				
				
				
				
	}
}

				
