package com.ciclos;

import java.util.Scanner;

public class Ciclos3_DSL {
public static void main(String[] args) {
	
	// Realiza un programa para determinar si un String es palíndromo.
    //Si pedimos al usuario por teclado el string necesitamos donde guardarlo
	
	String frase;
	
	Scanner entrada = new Scanner(System.in);
	
	//Enviamos el msj para solicitar que se introduzca una frase
	
	System.out.println("Introduce una palabra o frase");
	frase = entrada.nextLine();
	System.out.println(frase);
	
	//Vamos a realizar un proceso en el cual armemos nuestro frase en reversa y la guardemos en otro string
	String reversa = "";
	
	//Creamos un ciclo que nos permita extraer cada caracter para voltear la frase original pero en reversa
	
	 for (int i = frase.length()-1; i>=0; i--) {
		reversa = reversa + frase.charAt(i);
		
	}
	
	System.out.println(reversa);
	
	 if( frase.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
		System.out.println("La palabra es palindromo");
	}else {
		System.out.println("La palabra no es palindromo");
	}
  }
}
