package com.ciclos;

import java.util.Scanner;

public class Ciclos4_DSL {

	public static void main(String[] args) {
//		// .Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//		“Carácter no encontrado”.  

		Scanner entrada = new Scanner(System.in);
		
		//Pedimos ingresar datos en este caso frase  y letra
		System.out.print("Introduce la frase:");
		String frase = entrada.nextLine();
		
		System.out.print("Introduce una letra:");
		char letra = entrada.next().charAt(0);
		
		//declaramos un contador para poder llevar un control de cuantas veces se repite la letra
		int contador = 0;
		
		//el ciclo va comparando la frase letra por letra y con el contador incrementando va capturando el numero de
		//veces que se repite la letra
		 for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == letra) {
				contador++;
			}
		}
	    // si el contador el contador es 0 significa que no encontro la letra en la frase escrita ninguna vez
		//Por ende el caracter no fue encontrado en la palabra 
		 if(contador>0) {
			System.out.println("El caracter ' " + letra + " ' aparece " + contador + " veces en la frase. ");
		}else {
			System.out.println("Caracter no encontrado");
		}
	}

}
