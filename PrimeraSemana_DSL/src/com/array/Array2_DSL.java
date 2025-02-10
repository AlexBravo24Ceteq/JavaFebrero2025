package com.array;

import java.util.Scanner;

public class Array2_DSL {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
	        int[] numeros = new int[100]; // Array de 100 posiciones
	        int suma = 0;
	        double media;

	        // Llenar el array con valores del 1 al 100
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i + 1; // El �ndice empieza en 0, as� que sumamos 1
	            suma += numeros[i]; // Acumulamos la suma
	        }

	        // Calcular la media
	        media = (double) suma / numeros.length;

	        // Mostrar resultados
	        System.out.println("La suma de los n�meros del 1 al 100 es: " + suma);
	        System.out.println("La media de los n�meros es: " + media);
	    }
	}

