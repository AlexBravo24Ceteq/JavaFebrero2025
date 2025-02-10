package com.condicionales;

import java.util.Scanner;

public class Condicionales1_DSL {

	public static void main(String[] args) {
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el primer numero");
		int x = input.nextInt();
		System.out.println("Introduce el segundo numero");
		int y = input.nextInt();
		 
		
		 if (x>y) {//Condicion si x es mayor que y entonces x es mayor
			System.out.println("El primer numero es mayor");
		}else if (x<y) {//Sino x es menor que y por lo tanto y es mayor
			System.out.println("El segundo numero es mayor");
		}else {//si lo anterior nose cumple entonces los dos numeros son iguales
			System.out.println("Los numero son iguales");
		}
	}
}
