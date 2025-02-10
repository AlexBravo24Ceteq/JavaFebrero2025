package com.condicionales;

import java.util.Scanner;

public class Condicioanles4_RHV {

	public static void main(String[] args) {
		
		
//		Realiza un programa que lea una cadena 
//		por teclado y 
//		compruebe si es una letra mayúscula.
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        
//	        // Solicitar una palabra al usuario
//	        System.out.print("Ingrese una palabra: ");
//	        String palabra = scanner.nextLine();
//	        
//	        // Evaluar cada letra de la palabra
//	        for (int i = 0; i < palabra.length(); i++) {
//	            char caracter = palabra.charAt(i);
//	            if (Character.isUpperCase(caracter)) {
//	                System.out.println("El carácter '" + caracter + "' es una letra mayúscula.");
//	            } else {
//	                System.out.println("El carácter '" + caracter + "' no es una letra mayúscula.");
//	            }
//	        }
	        
		 
	        System.out.print("Ingrese una cadena de caracteres(palabra): ");
	        
	        String palabra = scanner.nextLine();
	        
	        boolean ContMayus = false;
	        
	        for(int x =0; x < palabra.length();x++) {
	        	
	        	char letra =palabra.charAt(x);
	        	
	     
	        	if(Character.isUpperCase(letra)) {
	        		
	        		ContMayus = true;   		
	        		
	        	}break; 
	        	        
	        }
	        if(ContMayus=true)
	        {
		        System.out.print("la palabra contiene al menos una letra mayuscula ");

	        }
	        else {
	        	
		        System.out.print("la palabra no contiene ninguna letra mayuscula ");

	        	
	        }
		 
	        scanner.close();
		
		
		
		
		

	}

}
