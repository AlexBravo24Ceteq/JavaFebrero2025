package com.ciclos;

import java.util.Scanner;

public class Ciclos8_RCT {

	public static void main(String[] args) {
		//Programa Java que lea dos números y muestre los números desde el menor hasta el 
		//mayor 
        System.out.println("Ciclos Problema 8");
        System.out.println("***************************************************************************");
		System.out.println("INTRODUCIR DOS NUMEROS Y MOSTRAR LOS NUMEROS DESDE EL MENOR HASTA EL MAYOR.");
        System.out.println("***************************************************************************");
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

     // Realizamos condicionales para mostrar en consola
        if (num1 > num2){
            System.out.println("El primer número, " +num1 + ", es mayor que el número dos," +num2);
        }else if (num1 < num2){
            System.out.println("El segundo número, " +num2 + ", es mayor que el primer número " +num1);
        }else {
            System.out.println("Ambos números son iguales, " +num1);
        }    

        // Variante para determinar el numero menor y el numero mayor del problema
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Muestra los números desde el menor hasta el mayor de los dos numeros ingresados
        System.out.println("Números desde el menor hasta el mayor:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

