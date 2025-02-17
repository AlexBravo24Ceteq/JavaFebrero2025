package com.ciclos;

import java.util.Scanner;

public class Ciclos3_RCT {

	public static void main(String[] args) {
		//  Realiza un programa para determinar si un String es palíndromo.
		
		//Si pedimos al usuario por teclado el string, se necesita donde guardarlo.
		
        System.out.println("Ciclos Problema 3");
		
		System.out.println("DETERMINAR SI LA PALABRA O FRASE INGRESADO"
				+ " ES UN PALINDROMO:");
		String frase;
		
		Scanner entrada = new Scanner (System.in);
		
		//enviar menj que se introduzca una frase
		
		System.out.println("Escribe una palabra o frase:");
		frase = entrada.nextLine();
		
		System.out.println(frase.replace(" ", ""));
		
		//Vamos a relaizar un proceso en el cual armemos una frase original
		//en reversa y guardarla en otro String
		
		String reversa = "";
		//Creamos un ciclo que nos permita extraer cad caracter
		//para voltear la frase original pero ahora en reversa
		
		for (int i = frase.length()-1; i >=0; i--) {
			reversa = reversa + frase.charAt(i);
			
		}
			System.out.println(reversa.replace(" ", ""));
			
			//ahora tenemos que comparar la frase original contra la armada en reversa
			
			if(frase.replace(" ","").equalsIgnoreCase(reversa.replace(" ", ""))) {
				System.out.println("La palabra es palindromo");
				
			}else {
				System.out.println("La palabra no es palindromo");
			}
		}
		
			
		
		
		
		
		

	}

