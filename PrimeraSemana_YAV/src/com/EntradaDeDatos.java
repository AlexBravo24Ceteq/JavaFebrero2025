package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Vamos a aprender a como introducir datos a traves de teclado
		//y guardarlos en alguna variable. Ej. solicitar un numero
		//y utilizarlo
		
		//La clase Scanner nos va a permitir crear un objeto para poder teclear
		//valores y utilizarlos aqui en java
		//Se importa del paquete java.util
		Scanner input= new Scanner(System.in);
		
		//mandamos un msj en consola que vamos a solicitar . Por Ej. un numero
		System.out.print("Introduce un primer numero: ");
		
		int x;
		
		x= input.nextInt();
		
        System.out.print("Introduce un segundo numero: ");
		
		int y;
		
		y= input.nextInt();
		
		System.out.println("El primer numero que tecleaste fue: "+x);
		System.out.println("El segundo numero que tecleaste fue: "+y);
		
		//con el mismo Scanner que tenemos podemos tambien solicitar otro dato, ej. un String
		
		System.out.print("Introduce tu nombre: ");
		//String nombre=input.next(); con .next(), podemos capturar Strings pero solo la primera 
		//palabra
		//como nextLine() es capaz de consumir espacios, primer debemos consumir el espacio
		//vacio de la instruccion anterior
		input.nextLine(); //esta instruccion consume ese espacio y nos permite continuar
		String nombre=input.nextLine(); //con .nextLine(); me permite capturar espacios
		
		System.out.println("Tu nombre es: "+nombre);
		

	}

}
