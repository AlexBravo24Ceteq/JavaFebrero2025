package com.arrays;

public class arrays2_RHV {
	public static void main(String[] args) {
		
		
		
//		2.Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
//		1 al 100. Obt�n la suma de todos ellos y la media.
		
		 int[] numeros = new int[100];
	        int suma = 0;

	        for (int i = 0; i < 100; i++) {
	            numeros[i] = i + 1;
	            suma += numeros[i];
	        }

	        double media = suma / 100.0;

	        System.out.println("Suma: " + suma);
	        System.out.println("Media: " + media);
	    
	}

}
