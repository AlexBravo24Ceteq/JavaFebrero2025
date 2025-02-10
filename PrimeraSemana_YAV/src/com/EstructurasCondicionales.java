package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {

	    //Estructuras de condicion.  Nos permiten evaluar una condicion
	    //booleana y ejecutar un bloque de codigo si esa condicion 
		//se cumple. Se pueden complementar con otra ejecucion 
		//en caso de que no se cumpla
		
		/*
		 * si (esto es verdadero) {
		 * se ejecuta este bloque de codigo 
		 * } si no se cumple {
		 * se ejecuta este bloque
		 * }
		 */
		
		int x=9;
		
		System.out.println("Probando estructuras if/else");
		if (x<9) {  //si esta condicion se cumple
			//Se ejecuta este bloque o instruccion de aqui
			System.out.println("Cierto");
		} else { //Si no / de otro modo
			//Se ejecuta este otro bloque de aqui 
			System.out.println("Falso");
		}
		
		//operadores logicos - condiciones compuestas
		//AND, OR, NOT, IGUALDAD Y DIFERENTE DE
		
		//AND - && - Devuelve el valor true cuando se cumple todas 
		//LAS CONDICIONES
		
		System.out.println("Probando operador AND &&");
		
		if (x<9 && x>1) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//OR - || - Devuelve el valor true cuando al menos una de 
		//las condiciones
		
        System.out.println("Probando operador Or ||");
		
		if (x<9 || x>1) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//NOT - ! - Se podria decir que este operador niega una condicion
				//o visto de otro modo, cambia el valor de una condicion de true a false
		//y viceversa
				
		        System.out.println("Probando operador NOT !");
				
				if (!(x<10)) {
					System.out.println("Cierto");
				}else {
					System.out.println("Falso");
				}
				
				
				//IGUALDAD o COMPARACION - == - Compara dos valores 
				//y devuelve true cuando son iguales 
				
				System.out.println("Probando operador IGUALDAD ==");
				
				if (x==9) {
					System.out.println("Cierto");
					
				}else {
					System.out.println("Falso");
				}
				
				
				//DIFERENTE DE - != - Compara dos valores
				//y devuelve true cuando son DIFERENTES 
				
				System.out.println("Probando operador DIFERENTE DE !=");
				
				if (x!=11) {
					System.out.println("Cierto");
					
				}else {
					System.out.println("Falso");
				}
				
				
				//ESTRUCTURA IF ELSE ANIDADO
				//Nos permite evaluar varias condiciones en caso de ser necesario 
				//Esta estructura es util cuando tengamos varias condiciones compuestas
				
				System.out.println("Probando ESTRUCTURA IF ELSE ANIDADO");
				int opcion =3;
				
				if(opcion ==1) {
					System.out.println("Piedra");
				}else if(opcion==2) {
					System.out.println("Papel");
				}else if (opcion==3) {
					System.out.println("Tijera");
				}else {
					System.out.println("Error de opcion");
				}
				
				//SWITCH CASE - Nos permite evaluar varios escenario de acuerdo al cambio de una 
				//variable
				System.out.println("Probando SWITCH CASE");
				int opcion2=2;
				
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
				
				

	}//cierre main

}//cierre clase
