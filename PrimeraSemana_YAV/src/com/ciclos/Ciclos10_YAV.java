package com.ciclos;

import java.util.Scanner;

public class Ciclos10_YAV {

	public static void main(String[] args) {
		// 10. Programa que lea 20 números e indique 
		//si son positivos o negativos y pares o 
		//impares y además muestre la sumatoria de los 
		//positivos y sumatoria de los impares. 
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 10==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		
		int sumaPositivos = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = input.nextInt();

            // Determinar si es positivo o negativo
            if (numero >= 0) {
                System.out.println(numero + " es POSITIVO.");
                sumaPositivos += numero; // Sumar solo si es positivo
            } else {
                System.out.println(numero + " es NEGATIVO.");
            }

            // Determinar si es par o impar
            if (numero % 2 == 0) {
                System.out.println(numero + " es PAR.");
            } else {
                System.out.println(numero + " es IMPAR.");
                sumaImpares += numero; // Sumar solo si es impar
            }

            System.out.println();
        }

        // Mostrar sumatorias
        System.out.println("Sumatoria de los números positivos: " + sumaPositivos);
        System.out.println("Sumatoria de los números impares: " + sumaImpares);

	}

}
