package com.condicionales;

import java.util.Scanner;

public class condicionales2_RCT {

	public static void main(String[] args) {
		//Realiza un programa que pida un número por teclado 
		//y nos indique si es par o impar. 
		
		System.out.println("Problema 2");
		
		Scanner input = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("Ingrese un numero");
		numero = input.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println( "el numero ingresado es par" );
		}else {
			System.out.println( "el numero ingresado es impar" );
		}
		
		

	}

}
