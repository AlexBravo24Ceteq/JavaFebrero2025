package com.condicionales;

import java.util.Scanner;

public class Condicionales4_RCT {

	
	public static void main(String[] args) {
		//  Realiza un programa que lea una cadena por teclado 
		//y compruebe si es una letra may�scula
		
		  Scanner scanner = new Scanner (System.in);
		    String cadena;

		// Solicitud de datos al usuario
		    System.out.println("Este programa nos pide una cadena y comprueba si es una letra may�scula.");
		    System.out.println("Introduce la cadena que desees: ");
		   
			cadena = scanner.nextLine();
			
			System.out.println(cadena.substring(0));
			
			if (cadena.length() == 0) {
			    System.out.println("The string length is 1.");
			}
		    
		// Realizamos C�lculos y mostramos en pantalla
		    if (cadena.length() != 1){
		      System.out.println("La cadena no es una letra may�scula");
		   // }else if ((cadena > "A") && (cadena < "Z")) {
		    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       System.out.println("La cadena es una letra may�scula.");
		    }else {
		        System.out.println("La cadena no es una letra may�scula.");
		    }
		    
		 
		    	 }
		    }
	

		   
		    	
		  




