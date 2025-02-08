package com.array;

import java.util.Scanner;

public class Array1_DSL {

	public static void main(String[] args) {
		//Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.

		    Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10]; // Array de 10 posiciones

	        // Solicitar valores al usuario
	        System.out.println("Introduce 10 números:");
	         for (int i = 0; i < numeros.length; i++) {
	        System.out.print(" Número en la posición " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar los índices y valores almacenados
	        System.out.println("\nÍndice - Valor:");
	         for (int i = 0; i < numeros.length; i++) {
	        System.out.println(i + " - " + numeros[i]);
	    
	        }   
	    }
	}

