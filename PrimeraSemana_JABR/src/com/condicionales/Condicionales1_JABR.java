package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JABR {

	
	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números 
		//por teclado e indique cuál es mayor o si son iguales.
		
		System.out.println("=================================");
		System.out.println("=========PROBLEMA 1==============");
		System.out.println("=PROGRAMA PARA EVALUAR 2 NUMEROS=");
		System.out.println("=Y DETERMINAR CUÁL ES MAYOR O SI=");
		System.out.println("==========SON IGUALES============");
		System.out.println("=================================");
		System.out.println();
		
		//Declaro un Scanner para poder teclear los numeros
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int x = input.nextInt();
		System.out.println("Introduce otro numero");
		int y = input.nextInt();
		
		//Evaluamos
		if (x>y) {
			System.out.println("El primer numero es mayor");
		}else if(x<y) {
			System.out.println("El segundo numero es mayor");
		}else {
			System.out.println("Los numeros son iguales");
		}
		
		System.out.println("=================================");
		System.out.println("======FIN DEL PROGRAMA===========");
		System.out.println("=================================");
	}

}
