package com.condicionales;

import java.util.Scanner;

public class Condicionales_5 {

	public static void main(String[] args) {
		//calcula la aceptación de una solicitud en base a los siguientes
		//parámetros: edad, nota y sexo.
		//Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//Otros casos -> NO ACEPTADA
		
		System.out.println("---------------PROBLEMA 5-----------------");
		
		
		double nota; 
		double edad; 
		char sexo; 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce tu nota");
		nota = input.nextDouble(); 
		System.out.println("Introduce tu Edad");
		edad = input.nextDouble(); 
		System.out.println("Introduce tu sexo F si es femenino M si es masculino");
		sexo = input.next().charAt(0); 
		
		System.out.println( );
		if(nota >= 5 && edad >= 18 && sexo == 'M' ) {
			System.out.println("POSIBLE" );
		}
		else if(nota >= 5 && edad >= 18 && sexo == 'F' ) {
			System.out.println("ACEPTADA" );
		}
		else {
			System.out.println("NO ACEPTADA" );
		
	    }

	}
	
		
}
