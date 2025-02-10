package com.condicionales;

import java.util.Scanner;

public class Condicionales9_YAV {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7)
		//y escriba el día correspondiente. Si 
		//introducimos otro número nos da un error.
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 9==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce el numero de la semana (1-7): ");
		int dia;
		dia=input.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El dia es Lunes");
			break;
			
		case 2:
			System.out.println("El dia es Martes");
			break;
			
		case 3:
			System.out.println("El dia es Miercoles");
			break;
			
		case 4:
			System.out.println("El dia es Jueves");
			break;
			
		case 5:
			System.out.println("El dia es Viernes");
			break;
			
		case 6:
			System.out.println("El dia es Sabado");
			break;
			
		case 7:
			System.out.println("El dia es Domingo");
			break;

		default:
			System.out.println("Error");
			break;
		}


	}

}
