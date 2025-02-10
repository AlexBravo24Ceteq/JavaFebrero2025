package com.condicionales;

import java.util.Scanner;

public class Condicionales10_RHV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int mes;
        
        do {
            System.out.print("Ingrese un número del 1 al 12 para conocer los días del mes: ");
            while (!scanner.hasNextInt()) {
                System.out.println("ERROR: entrada no válida. Debe ingresar un número entero.");
                scanner.next(); // Limpiar entrada inválida
                System.out.print("Ingrese un número del 1 al 12 para conocer los días del mes: ");
            }
            mes = scanner.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("ERROR: número fuera de rango. Debe estar entre 1 y 12.");
            }
        } while (mes < 1 || mes > 12);
	        scanner.close();
	        
	        int dias=0;
	        switch (mes) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                dias = 31;
	                break;
	            case 4: case 6: case 9: case 11:
	                dias = 30;
	                break;
	            case 2:
	                dias = 28; // No se considera año bisiesto
	                break;
	            default:
	        }
	        
	        System.out.println("El mes " + mes + " tiene " + dias + " días.");

	}

}
