package com.ciclos;

import java.util.Scanner;

public class Ciclos12_YAV {

	public static void main(String[] args) {
		//12.Se ingresan un conjunto de n edades de personas por teclado. 
		//El programa finalizara cuando el promedio de las edades sea superior a 25.
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 11==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		 
	    System.out.println("Ingrese edades (El programa terminará cuando el promedio supere 25):");
	    
	    int sumaEdades = 0;
        int contador = 0;
        double promedio = 0.0;

	        for (int i = 0; i < Integer.MAX_VALUE; i++) { // Bucle infinito, se romperá con break
	            System.out.println();
	        	System.out.print("Ingrese una edad: ");
	            int edad = input.nextInt();

	            sumaEdades += edad; // Sumar la edad ingresada
	            contador++; // Aumentar el número de edades ingresadas
	            promedio = (double) sumaEdades / contador; // Calcular promedio

	            System.out.println("Promedio actual: " + promedio);

	            if (promedio > 25) { // Si el promedio supera 25, terminamos el ciclo
	                break;
	            }
	        }
	        System.out.println();
	        System.out.println("Edades ingresadas: "+contador);
	        System.out.println("El programa ha finalizado porque el promedio superó 25.");
		

	}

}
