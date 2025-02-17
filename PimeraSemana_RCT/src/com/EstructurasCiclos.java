package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// estructuras ciclicas o de iteracion
		//nos van a permitir sentencias o procesos n veces
		
		//while - Mientras......
		
		//mientras una condicion se cumpla, se realiza una tarea
		
		/*
		 * mientras (esto se cumpla){
		 *  se ejecuta esta bloque de codigo
		 *  }
		 */
		//el ciclo while es un ciclo indeterminado
		int x = 1;
//		while (x<=5) { //mientras x sea menor a 5
//			//se imprime esta linea
//			System.out.println(x +".-hola mundo");
//			// si quiero detener este ciclo debo introducir un cambio o control
//			//eje. un incremento en x
//			x = x + 1; // incrementamos el valor de x en 1
//			//otra forma de espresar el incremento de 1 en 1 en x
//			x++;
//		}
		
		//do while - nos sirve para ejecutar nuestro programa antes de evaluar si debe
		//seguir ejecutandose. util en momentos en los que una condicion no se pueda cumplir
		
//		do { //ejecuta la siguiente
//			System.out.println("hola mundo");
//		}while(x>10); //esta condicion no se cumple pero al menos se imprimira una vez
//			//en consola mi linea
			
			//for - cliclo determinado util cuandpo sabemos cuantas 
		//veces se va a realizar una tarea
		
		/*
		 * para (estos argumentos)
		 *         ejecuta este bloque de codigo
		 * }
		 * 
		 * (una variable que nos ayudara a iterar; una condicion o un incremeto/decremento;)
		 * 
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i + ".-hola mundo");
			
		}
		
		//Realizar una tabla de multiplicar del 5
		//y que multiplique hasta 5 x10
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("5" + "x" + i + "=" + (5*i));
			
			
		}
		}

	}




