package com.array;

import java.util.Scanner;

public class Array1_DSL {

	public static void main(String[] args) {
		//Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		//Muestra por consola el �ndice y el valor al que corresponde.

		    Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10]; // Array de 10 posiciones

	        // Solicitar valores al usuario
	        System.out.println("Introduce 10 n�meros:");
	         for (int i = 0; i < numeros.length; i++) {
	        System.out.print(" N�mero en la posici�n " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar los �ndices y valores almacenados
	        System.out.println("\n�ndice - Valor:");
	         for (int i = 0; i < numeros.length; i++) {
	        System.out.println(i + " - " + numeros[i]);
	    
	        }   
	    }
	}

