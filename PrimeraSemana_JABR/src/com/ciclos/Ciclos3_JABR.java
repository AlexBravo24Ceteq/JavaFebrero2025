package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JABR {

	public static void main(String[] args) {
		
		// 3. Realiza un programa para determinar si un String es palíndromo.
		//2002
		//radar
		
		//Si pedimos al usuario por teclado el String, necesitamos donde guardarlo
		String frase;
		
		Scanner entrada = new Scanner(System.in);
		
		//Enviamos el msj para solicitar que se introduzca una frase
		System.out.println("Introduce una palabra o frase");
		frase = entrada.nextLine();
		
		System.out.println(frase.replace(" ", ""));
		
		//Vamos realizar un proceso en el cual armemos nuestra frase original
		//en reversa y la guardemos en otro String
		String reversa = "";
		
		//Creamos un ciclo que nos permita extraer cada caracter
		//parar voltear la frase original, pero ahora en reversa
		for (int i = frase.length()-1; i >=0; i--) {
			reversa = reversa + frase.charAt(i);
		}
		
		System.out.println(reversa.replace(" ", ""));
		
		//Ahora tenemos que comparar la frase original contra la armada en reversa
		
		if(frase.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("La palabra es palíndromo");
		}else {
			System.out.println("La palabra no es palíndromo");
		}
		
		
		

	}

}
