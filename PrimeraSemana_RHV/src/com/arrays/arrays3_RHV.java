package com.arrays;

import java.util.Scanner;

public class arrays3_RHV {

	public static void main(String[] args) {

		
//		3.Pide al usuario por teclado una frase y pasa sus caracteres a un array de
//		caracteres
		
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        char[] caracteres = frase.toCharArray();

        System.out.println("Array de caracteres:");
        for (char c : caracteres) {
            System.out.print(c + " \n");
        }

        scanner.close();
		
		
		
	}

}
