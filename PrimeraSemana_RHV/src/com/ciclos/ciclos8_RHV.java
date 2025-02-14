package com.ciclos;

import java.util.Scanner;

public class ciclos8_RHV {
	
//	8. Programa Java que lea dos números y muestre los números desde el menor hasta el
//	mayor

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("Los números desde el menor hasta el mayor son:");

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
        
        scanner.close();
	}

}
