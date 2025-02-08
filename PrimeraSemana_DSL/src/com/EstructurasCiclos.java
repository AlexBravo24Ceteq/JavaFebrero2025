package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//Estructuras Ciclicas o de Iteracion
		//Nos van a permitir repetir sentencias o procesos n veces
		
		//While - Mientras---
		
		//Mientras una condicion se cumpla, se realiza una tarea
		
		/*
		 * Mienatras(esto se cumpla){
		 * se ejecuta este bloque de codigo
		 * }
		 */
		
		int x = 1;
		
//		while(x<5) {//mientras x sea menor a 5 se imprime esta linea indeterminadamente.
//			System.out.println("Hola mundo");
//			
//			//Si quiero detener este ciclo debo introducir un cambio o control
//			// ej. un incremento en x
//			//x= x+1; //incrementamos el valor de x en 1
//			//Otra formade expresar el incremento de 1 en 1 en x
//			
//			x++;
//		}

		//do while - Nos sirve para ejecutar nuestro programa antes de evaluar si debe
		//seguir ejecutandose. Util en momentos en los que una condicion no se pueda cumplir
		
//		do {
//			System.out.println("Hola mundo");
//		}while (x>10); //esta condicion no se cumple, pero al menos se imprimira una vez en consola
//		
		
		//for - ciclo determinado
		//util cuando sabemos cuantas veces se va a realizar una tarea
		
		/*para (estos argumentos)
		 * ejecuta este bloque de codigo
		 * }
		 * 
		 * (una variable que nos ayudara a iterar; una condicion; un incremento/decremento;)
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola mundo");
		}
		
		for (int i = 1; i<=10; i++) {
			System.out.println("5"+"x" + i + "=" + (5*i));
		}
		}
	}

