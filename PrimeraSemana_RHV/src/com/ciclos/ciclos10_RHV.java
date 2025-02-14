package com.ciclos;

import java.util.Scanner;

public class ciclos10_RHV {

	public static void main(String[] args) {
//		10. Programa que lea 20 números e indique si son positivos o negativos y pares o
//		impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
		
		  Scanner scanner = new Scanner(System.in);

	        int sumaPositivos = 0;
	        int sumaImpares = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Ingresa el número " + i + ": ");
	            int numero = scanner.nextInt();

	            if (numero > 0) {
	                System.out.println(numero + " es positivo.");
	                sumaPositivos += numero;  
	            } else if (numero < 0) {
	                System.out.println(numero + " es negativo.");
	            } else {
	                System.out.println(numero + " es cero.");
	            }

	            if (numero % 2 == 0) {
	                System.out.println(numero + " es par.");
	            } else {
	                System.out.println(numero + " es impar.");
	                sumaImpares += numero;  
	            }
	        }

	        System.out.println("\nLa sumatoria de los números positivos es: " + sumaPositivos);
	        System.out.println("La sumatoria de los números impares es: " + sumaImpares);

	        scanner.close();
		
	}

}
