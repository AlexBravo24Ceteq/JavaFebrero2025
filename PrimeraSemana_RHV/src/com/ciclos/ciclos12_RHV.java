package com.ciclos;

import java.util.Scanner;

public class ciclos12_RHV {

	public static void main(String[] args) {
//		12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
//		cuando el promedio de las edades sea superior a 25.
		
		
		
        Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int contadorEdades = 0;
        double promedio;

        while (true) {
            System.out.print("Ingresa la edad de la persona (o un número negativo para terminar): ");
            int edad = scanner.nextInt();

            if (edad < 0) {
                break;
            }

            sumaEdades += edad;
            contadorEdades++;

            promedio = (double) sumaEdades / contadorEdades;

            if (promedio > 25) {
                break;
            }
        }

        System.out.println("El promedio de las edades es: " + (double) sumaEdades / contadorEdades);
        System.out.println("Programa finalizado.");

        scanner.close();
	}

}
