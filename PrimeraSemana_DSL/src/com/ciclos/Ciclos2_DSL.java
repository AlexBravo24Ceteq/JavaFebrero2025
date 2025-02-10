package com.ciclos;

import java.util.Scanner;

public class Ciclos2_DSL {

	public static void main(String[] args) {
//		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//		23 x 95 = ???

		Scanner numeros= new Scanner(System.in);

		//Nos pide ingresar el numero incial y el numero limite
		System.out.println("Introduce el numero para la tabla de multiplicar: ");
		int numero = numeros.nextInt();
	    System.out.println("Introduce el numero hasta donde se quiera multiplicar: ");
		int limite = numeros.nextInt();
		
		//Se manda mensaje en pantalla en donde se muestran los numero ingresados
		System.out.println("Tabla de multiplicar del " + numero + " hasta " + limite + ":");
		
		//ciclo donde se inicializa en 1 y mientras i sea menor igual al numero limite ingresado se seguira
		//con la tabla de multiplicar
		 for (int i = 1; i <= limite; i++) {
			
		//Muestra en pantalla la tabla de multiplicar
		System.out.println(numero + "X" + i + "=" + (numero*i));
		}
	}
}

