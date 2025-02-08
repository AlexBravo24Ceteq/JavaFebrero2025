package com.array;

import java.util.Scanner;

public class Array2_DSL {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.
		
	        int[] numeros = new int[100]; // Array de 100 posiciones
	        int suma = 0;
	        double media;

	        // Llenar el array con valores del 1 al 100
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i + 1; // El índice empieza en 0, así que sumamos 1
	            suma += numeros[i]; // Acumulamos la suma
	        }

	        // Calcular la media
	        media = (double) suma / numeros.length;

	        // Mostrar resultados
	        System.out.println("La suma de los números del 1 al 100 es: " + suma);
	        System.out.println("La media de los números es: " + media);
	    }
	}

