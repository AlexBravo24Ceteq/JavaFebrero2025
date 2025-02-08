package com.array;

import java.util.Scanner;

public class Array3_DSL {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.

		Scanner scanner = new Scanner(System.in);

        // Pedir la frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Convertir la frase en un array de caracteres
        char[] caracteres = frase.toCharArray();

        // Mostrar el array de caracteres
        System.out.println("\nCaracteres de la frase:");
         for (int i = 0; i < caracteres.length; i++) {
        System.out.println("Índice " + i + ": " + caracteres[i]);
        }
    }
}

