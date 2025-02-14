package com.ciclos;

import java.util.Scanner;

public class Ciclos2_RHV {

	public static void main(String[] args) {
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
//		desde teclado, hasta la iteración deseada por el usuario.
		
		
        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        int iteraciones = -1;

        do {
            System.out.print("Ingrese el número para la tabla de multiplicar (positivo): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un número entero válido.");
                scanner.next();
            }
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("El número debe ser positivo. Inténtelo nuevamente.");
            }
        } while (numero <= 0);

        do {
            System.out.print("Ingrese la cantidad de iteraciones (número positivo): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un número entero válido.");
                scanner.next(); 
            }
            iteraciones = scanner.nextInt();

            if (iteraciones <= 0) {
                System.out.println("La cantidad de iteraciones debe ser positiva. Inténtelo nuevamente.");
            }
        } while (iteraciones <= 0);

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= iteraciones; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
		
		

	}

}
