package com.condicionales;

import java.util.Scanner;

public class Condicionales10_YAV {

	public static void main(String[] args) {
		// 10.Realiza un programa que pida un número entero entre uno y doce
		//e imprima el número de días que tiene el 
		//mes correspondiente.
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 10==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce el numero de la semana (1-12): ");
		int mes;
		mes=input.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("El mes es Enero y tiene 31 Dias");
			break;
			
		case 2:
			System.out.println("El mes es Febrero y tiene 28 Dias");
			break;
			
		case 3:
			System.out.println("El mes es Marzo y tiene 31 Dias");
			break;
			
		case 4:
			System.out.println("El mes es Abril y tiene 30 Dias");
			break;
			
		case 5:
			System.out.println("El mes es Mayo y tiene 31 Dias");
			break;
			
		case 6:
			System.out.println("El mes es Junio y tiene 30 Dias");
			break;
			
		case 7:
			System.out.println("El mes es Julio y tiene 31 Dias");
			break;
			
		case 8:
			System.out.println("El mes es Agosto y tiene 31 Dias");
			break;
			
		case 9:
			System.out.println("El mes es Septiembre y tiene 30 Dias");
			break;
			
		case 10:
			System.out.println("El mes es Octubre y tiene 31 Dias");
			break;
			
		case 11:
			System.out.println("El mes es Noviembre y tiene 30 Dias");
			break;
			
		case 12:
			System.out.println("El mes Diciembre y tiene 31 Dias");
			break;

		default:
			System.out.println("Error");
			break;
		}


	}

}
