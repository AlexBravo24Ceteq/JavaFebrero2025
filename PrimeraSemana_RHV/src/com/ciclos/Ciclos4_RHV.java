package com.ciclos;

import java.util.Scanner;

public class Ciclos4_RHV {

	public static void main(String[] args) {
//		4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
//		“Carácter no encontrado”
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una frase: ");
	        String frase = scanner.nextLine();

	        System.out.print("Ingrese una caracter a buscar: ");
	        char letra = scanner.next().charAt(0);

	        int ocurrencias = contarLetra(frase, letra);

	        if (ocurrencias > 0) {
	            System.out.println("La letra '" + letra + "' aparece " + ocurrencias + " veces en la frase.");
	        } else {
	            System.out.println("Carácter no encontrado");
	        }

	        scanner.close();
	    }

	    public static int contarLetra(String frase, char letra) {
	        frase = frase.toLowerCase();
	        letra = Character.toLowerCase(letra);

	        int contador = 0;

	        for (int i = 0; i < frase.length(); i++) {
	            if (frase.charAt(i) == letra) {
	                contador++;
	            }
	        }

	        return contador;

		
	}

}
