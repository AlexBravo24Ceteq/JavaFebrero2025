package com.arrays;

import java.util.Scanner;

public class arrays1RHV {

	public static void main(String[] args) {
		
//		Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde.
//		
		 Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[10];

	        // Pedir valores para llenar el array
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingresa el valor para el índice " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar los índices y los valores del array
	        System.out.println("\nÍndices y valores del array:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }

	        scanner.close();
		
	}

}
