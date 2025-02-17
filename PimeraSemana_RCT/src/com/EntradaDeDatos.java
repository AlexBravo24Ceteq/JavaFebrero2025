package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Como introducir datos atraves de teclado
		//y guardarlos en alguna variable. eje solicitar un numero
		// y utilizarlo
		
		//La clase scanner nos va a permitir crear un objeto para poder teclear valores
		//y utilizarlos en Java
		//se importa del paquete Java.util
		Scanner input = new Scanner(System.in);
		
		//Mandamos un mensaje en colsola para saber que vamos a solicitar
		//por qjem un numero
		
		System.out.println("Introduce un numero");
		
		int x;
		
		x = input.nextInt();
		
		System.out.println("Introduce el segundo numero");
		
		int y = input.nextInt();
		
		System.out.println("El primer umero que tecleaste fue: " + x);
		
		System.out.println("El segundo numero que tecleaste fue: " + y);
		
		//con el mismo objeto de la clase scanner podemos solicitar otro dato por ejemplo un string
		
		System.out.println("Introduce tu nombre");
		//String nombre = input.nextLine(); con next(), podemos capturarString pero solo la 
		//primera palabra
		//Como nextLine() es capaz de consumir espacios, primero debemos consumir el espacio
		//vacio de la instruccion anterior
		input.nextLine();//esta instruccion consume ese espacio y nos permite continuar
		String nombre = input.nextLine();// .nextLine() permitecapturar espacios
		
		System.out.println("Tu nombre es: " + nombre);
		
		

	}

}
