package com.condicionales;

import java.util.Scanner;

public class Condicionales14_DSL {

	public static void main(String[] args) {
//		//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra.
		
		        Scanner scanner = new Scanner(System.in);

		        // Definimos las tasas de pago
		        final int HORAS_BASE = 40;
		        final double PAGO_NORMAL = 16.0;
		        final double PAGO_EXTRA = 20.0;

		        // Pedimos la cantidad de horas trabajadas
		        System.out.print("Ingrese las horas trabajadas en la semana: ");
		        int horasTrabajadas = scanner.nextInt();

		        double salario;

		        // Calculamos el salario
		         if (horasTrabajadas <= HORAS_BASE) {
		            salario = horasTrabajadas * PAGO_NORMAL;
		        } else {
		            int horasExtras = horasTrabajadas - HORAS_BASE;
		            salario = (HORAS_BASE * PAGO_NORMAL) + (horasExtras * PAGO_EXTRA);
		        }

		        // Mostramos el resultado
		        System.out.println("El salario semanal es: $" + salario);
		        
		    }
		}