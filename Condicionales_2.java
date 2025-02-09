package com.condicionales;

import java.util.Scanner;

public class Condicionales_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------PROBLEMA 2-----------------");

		//pide un número por teclado y nos indica si es par o impar.

		
		double numero;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		numero = input.nextDouble(); 
		
		
		if(numero % 2 == 0) {
			
			System.out.println("El numero mayor es par" );
			
		}
		
		else {
			System.out.println("El numero es impar " );
		}
		

	}

}
