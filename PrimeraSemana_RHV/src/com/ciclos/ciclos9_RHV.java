package com.ciclos;

import java.util.Scanner;

public class ciclos9_RHV {

	public static void main(String[] args) {

		
//		9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer n�mero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo n�mero: ");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        System.out.println("Los n�meros pares entre " + inicio + " y " + fin + " son:");

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    
	}

}
