package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Vamos a aprender a como introducir datos a trav�s de teclado
		//y guardarlos en en alguna variabel. Ej. Solicitar un n�mero
		// y utilizarlo
		
		//La clase Scanner nos va permitir crear un objeto para poder teclear
		//valores y utilizarlos aqui en Java
		//Se importa del paquete java.util
		Scanner input = new Scanner(System.in);
		
		//Mandamos un msj en consola para saber que vamos a solicitar. Por ej. un numero
		System.out.println("Introduce un n�mero");
		
		int x;
		
		x = input.nextInt();
		
		System.out.println("Introduce un segundo numero");
		
		int y = input.nextInt();
		
		System.out.println("El primer n�mero que tecleaste fue: " + x);
		System.out.println("El segundo numero que tecleaste fue: " + y);
		
		//Con el mismo Scanner que tenemos podemos tambi�n solicitar otro dato, ej. un String
		
		System.out.println("Introduce tu nombre");
		// String nombre = input.next(); con .next(), podemos capturar Strings pero solo la primera
		//palabra
		//Como nextLine() es capaz de consumir espacios, primero debemos consumir el espacio
		//vacio de la instrucci�n anterior
		input.nextLine(); //esta instrucci�n consume ese espacio y nos permite continuar
		String nombre = input.nextLine(); // .nextLine() me permite capturar espacios
		
		System.out.println("Tu nombre es: " + nombre);
		

	}

}
