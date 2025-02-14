package com.condicionales;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        double horasTrabajadas;

	        do {
	            System.out.print("Ingrese las horas trabajadas en la semana: ");
	            
	            while (!scanner.hasNextDouble()) {
	                System.out.println("Por favor ingrese un número válido.");
	                scanner.next(); 
	                System.out.print("Ingrese las horas trabajadas en la semana: ");
	            }

	            horasTrabajadas = scanner.nextDouble();

	            if (horasTrabajadas < 0) {
	                System.out.println("Las horas trabajadas no pueden ser negativas. Inténtelo nuevamente.");
	            }
	        } while (horasTrabajadas < 0);

	        double salarioTotal = 0;

	        if (horasTrabajadas <= 40) {
	            salarioTotal = horasTrabajadas * 16;
	        } else {
	            salarioTotal = 40 * 16;
	            double horasExtra = horasTrabajadas - 40;
	            salarioTotal += horasExtra * 20;
	        }

	        System.out.println("El salario total del obrero es: $" + salarioTotal);

	        scanner.close();
	    }


}
