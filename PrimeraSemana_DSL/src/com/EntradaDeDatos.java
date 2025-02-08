package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Vamos aprender a como introducir datos a traves de teclado
		//y guardarlos en alguna variable. ej. Solicitar un numero
		//y utilizarlo.
		
		//La clase Scanner nos va permitir crear un objeto para poder teclear
		//valores y utilizarlos en java
		//Se importa del paquete de java.util.
		Scanner input = new Scanner(System.in);

		//Mandamos un msj en consola para saber que vamos a solicitar. por ej. un numero
		
		System.out.println("Introduce un numero");
		
		int x;
		
		x = input.nextInt();
		
		System.out.println("Introduce un segundo numero");
		
		int y = input.nextInt();
		
		System.out.println("El primer numero que tecleaste fue: " + x);
		System.out.println("El segundo numero que tecleaste fue: " + y);
		
		//Con el mismo Scanner que tenemos podemos tambien solicitar otro dato, ej. un string
		
		System.out.println();
	}

}
