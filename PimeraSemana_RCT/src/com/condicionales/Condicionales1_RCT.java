package com.condicionales;

import java.util.Scanner;

public class Condicionales1_RCT {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales

		System.out.println("PROBLEMA 1");
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero:");
		int x = input.nextInt();
		System.out.println("Introduce otro numero:");
		int y = input.nextInt();
		
		//evaluacion MAYOR QUE
		if (x>y) {
			System.out.println("El primer numero es mayor");
		}else if (x<y) {
			System.out.println("El segundo numero es mayor");
		}else {
			System.out.println("Los dos numeros son iguales");
		}
		
	}

}
