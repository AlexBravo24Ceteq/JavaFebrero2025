package com.arrays;

import java.util.Scanner;

public class arrays1RHV {

	public static void main(String[] args) {
		
//		Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
//		Muestra por consola el �ndice y el valor al que corresponde.
//		
		 Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[10];

	        // Pedir valores para llenar el array
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingresa el valor para el �ndice " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar los �ndices y los valores del array
	        System.out.println("\n�ndices y valores del array:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("�ndice " + i + ": " + numeros[i]);
	        }

	        scanner.close();
		
	}

}
