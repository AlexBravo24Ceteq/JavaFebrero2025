package com.ciclos;

import java.util.Scanner;

public class Ciclos3_RHV {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase para verificar si es palíndromo: ");
        String input = scanner.nextLine();

        if (esPalindromo(input)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        scanner.close();
    }

    // Función para verificar si un String es palíndromo
    public static boolean esPalindromo(String str) {
        str = str.replaceAll("[\\W_]", "").toLowerCase();

        // Comprobar si la cadena es igual a su reverso
        String reverso = new StringBuilder(str).reverse().toString();

        return str.equals(reverso);


	}

}
