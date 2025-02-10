package com.condicionales;

import java.util.Scanner;

public class Condicionales4_YAV {

	public static void main(String[] args) {
	
		//4. Realiza un programa que lea una cadena por teclado 
		//y compruebe si es una letra mayúscula
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 4==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce la frase: ");
	 
		String frase=input.nextLine();
		boolean esmayuscula = false;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (caracter >= 'A' && caracter <= 'Z') { // Se encuentra una mayuscula
                esmayuscula = true;
                break; // No es necesario seguir revisando
            }
        }

        if (esmayuscula) {
            System.out.println("La frase contiene mayusculas");
        } else {
            System.out.println("La frase NO contiene mayusculas");
        }


	}

}
