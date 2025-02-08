package com.condicionales;

import java.io.IOException;
import java.util.Scanner;

public class Condicionales4_DSL {

	public static void main(String[] args) throws IOException {
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula. 

		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String input = scanner.nextLine();
        scanner.close();

         if (contieneMayusculas(input)) {
            System.out.println("La cadena contiene al menos una letra mayúscula.");
        } else {
            System.out.println("La cadena no contiene letras mayúsculas.");
        }
    }

     public static boolean contieneMayusculas(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}

