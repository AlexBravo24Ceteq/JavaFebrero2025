package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JABR {

	public static void main(String[] args) {
		// Ejercicio 3 - Crea un programa que pida al usuario dos números
		// y muestre el resultado de su división.
		// Si el segundo número es 0, debe mostrar un mensaje de error.

		System.out.println("===================================");
		System.out.println("===========PROBLEMA 3==============");
		System.out.println("=PROGRAMA PARA REALIZAR DIVISIONES=");
		System.out.println("===================================");
		System.out.println();
		
		//Necesitamos 2 numeros. Si queremos manejar decimales, bueno,
		//necesitamos dos variables donde guardar numeros con decimal
		double numero1;
		double numero2;
		
		//Necesito un Scanner para poder solicitar los números por teclado
		Scanner input = new Scanner(System.in);
		
		//Enviamos los msjs para solicitar los numeros al usuario
		System.out.println("Introduce un primer número");
		numero1 = input.nextDouble();
		
		System.out.println("Introduce un segundo número");
		numero2 = input.nextDouble();
		
		//Evaluamos, si el usuario introduce en el segundo número un 0
		//hay que enviar un msj de error. De otra manera, mostramos
		//el resultado de la división
		System.out.println();
		
		if(numero2 == 0) {
			System.out.println("Evaluando...");
			System.out.println("Error de división. El segundo numero no puede ser 0");
		}else {
			System.out.println("Evaluando...");
			System.out.println("El resultado de la división es: " + (numero1/numero2));
		}
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("======FIN DEL PROGRAMA=======");
		System.out.println("=============================");
		
		
		

		
		

	}

}
