package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Estructuras Ciclicas o de Iteración
		//Nos van a permitir repetir sentencias o procesos
		//n veces
		
		//while - Mientras....
		
		//Mientras una condicion se cumpla, se realiza una tarea
		
		/*
		 * mientras (esto se cumpla){
		 * 		Se ejecuta este bloque de codigo
		 * }
		 */
		//El ciclo while es un ciclo indeterminado
		
		int x = 1;
		
//		while (x<=5) { //mientras x sea menor a 5
//			//Se imprime esta linea
//			System.out.println(x + ".-Hola mundo");
//			//Si quiero detener este ciclo debo introducir un cambio o control
//			//Ej. un incremento en x
//			//x = x + 1; //incrementamos el valor de x en 1
//			//Otra forma de expresar el incremento de 1 en 1 en x
//			x++;
//		}
		
		//do while - Nos sirve para ejecutar nuestro programa antes de evaluar si debe
		//seguir ejecutandose. Util en momentos en los que una condicion no se pueda cumplir
		
//		do { //ejecuta lo siguiente
//			System.out.println("Hola Mundo");
//		}while(x>10); //esta condicion no se cumple, pero al menos se imprimira una vez en consola
//		//mi linea
		
		//for - ciclo determinado
		//util cuando sabemos cuantas veces se va a realizar una tarea
		
		/*
		 * para (estos argumentos)
		 * 		ejecuta este bloque de codigo
		 * }
		 * 
		 * (una variable que nos ayudara a iterar; una condicion; un incremento/decremento;)
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i + ".-Hola mundo");
		}
		
		//Realizar una tabla de multiplicar del 5
		//y que multiplique hasta 5 x 10
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("5" + "x" + i + "=" + (5*i));
		}

	}

}
