package com.ciclos;

import java.util.Scanner;

public class Ciclos9_DSL {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números pares entre ellos

		
		    Scanner entrada = new Scanner(System.in);
			
			//Pedimos ingresar por teclado dos numeros
			System.out.print("Ingrese el primer numero:");
			int num1 = entrada.nextInt();		
			System.out.print("Ingrese el segundo numero:");
			int num2 = entrada.nextInt();
			
			 // Asegurar que num1 sea menor que num2
	         if (num1 > num2) {
	            int temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }

	        // Mostrar los números pares entre num1 y num2
	        System.out.println("Números pares entre " + num1 + " y " + num2 + ":");
	         for (int i = num1; i <= num2; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }     
	    }
	}

