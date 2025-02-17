package com.ciclos;

import java.util.Scanner;

public class Ciclos4_RCT {

	public static void main(String[] args) {
		//Programa que reciba una frase y una letra por teclado. 
		//Deberá retornar como resultado cuántas veces existe esa letra dentro 
		//de la frase. Si no existe, imprimir un mensaje 
		//“Carácter no encontrado”.  
		
        System.out.println("Ciclos Problema 4");
		System.out.println("CUANTAS VECES SE ENCUENTRA LA LETRA DENTRO DE LA FRASE");
		
		System.out.println("");
		 String frase = "";
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Ingrese una Palabra o Frase:");
	        frase = entrada.nextLine();
		 
	        char letra = ' ';
	        int contador = 0;
	        
	        System.out.println("Digite una letra");
	        letra = entrada.nextLine().charAt(0);
	        for (int i = 0; i < frase.length(); i++) {
	            if(frase.charAt(i) == letra) contador++;
	        }
	        if(contador == 0) System.out.println("Caracter no encontrado");
	        else if(contador == 1) System.out.println("Solo hay una letra "
	        		+ "en la frase");
	        else System.out.println("La letra '" + letra + "' se repite " + contador + " veces");
	    }
	}

	
