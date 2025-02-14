package com.condicionales;

import java.util.Scanner;

public class Condicionales5_YAV {

	public static void main(String[] args) {
		//5. Realiza un programa que calcule la aceptación de 
		//una solicitud en base a los siguientes: parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 5==");
		System.out.println("============================");
		
        Scanner input= new Scanner(System.in);
		
		System.out.print("Introduce la nota: ");
		
		int nota;
		
		nota= input.nextInt();
		
        System.out.print("Introduce la edad: ");
		
		int edad;
		
		edad= input.nextInt();
		
		System.out.print("Ingrese el sexo (M/F): ");
        char sexo = input.next().toUpperCase().charAt(0);
		
        
        if(nota>=5 && edad>=18 && sexo=='M') {
        	System.out.println("Posible");
        }else if (nota>=5 && edad>=18 && sexo=='F') {
        	System.out.println("Aceptada");
        }else {
        	System.out.println("No Aceptada");
        }
	}
}


	    
	

	


