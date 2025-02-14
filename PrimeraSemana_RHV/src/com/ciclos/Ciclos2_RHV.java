package com.ciclos;

import java.util.Scanner;

public class Ciclos2_RHV {

	public static void main(String[] args) {
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
//		desde teclado, hasta la iteraci�n deseada por el usuario.
		
		
        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        int iteraciones = -1;

        do {
            System.out.print("Ingrese el n�mero para la tabla de multiplicar (positivo): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un n�mero entero v�lido.");
                scanner.next();
            }
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("El n�mero debe ser positivo. Int�ntelo nuevamente.");
            }
        } while (numero <= 0);

        do {
            System.out.print("Ingrese la cantidad de iteraciones (n�mero positivo): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un n�mero entero v�lido.");
                scanner.next(); 
            }
            iteraciones = scanner.nextInt();

            if (iteraciones <= 0) {
                System.out.println("La cantidad de iteraciones debe ser positiva. Int�ntelo nuevamente.");
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
