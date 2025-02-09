package com.condicionales;

import java.util.Scanner;

public class Condicionales_3 {

	public static void main(String[] args) {
		System.out.println("---------------PROBLEMA 3-----------------");
		
		
		double numero1; 
		double numero2; 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un primer numero");
		numero1 = input.nextDouble(); 
		System.out.println("Introduce un segundo numero");
		numero2 = input.nextDouble(); 
		
		System.out.println( );
		if(numero2 == 0 ) {
			System.out.println("evaluando..." );
			System.out.println("eError de division el segundo numero no puede ser 0" );
		}
		else {
			System.out.println("evaluando..." );
			System.out.println("El resultado de la division es: " + (numero1/numero2) ); 
		}


	}

}
