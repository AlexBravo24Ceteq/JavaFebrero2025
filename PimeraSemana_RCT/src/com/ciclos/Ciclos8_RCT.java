package com.ciclos;

import java.util.Scanner;

public class Ciclos8_RCT {

	public static void main(String[] args) {
		//Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
		//mayor 
        System.out.println("Ciclos Problema 8");
        System.out.println("***************************************************************************");
		System.out.println("INTRODUCIR DOS NUMEROS Y MOSTRAR LOS NUMEROS DESDE EL MENOR HASTA EL MAYOR.");
        System.out.println("***************************************************************************");
        Scanner scanner = new Scanner(System.in);

        // Leer los dos n�meros
        System.out.print("Introduce el primer n�mero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo n�mero: ");
        int num2 = scanner.nextInt();

     // Realizamos condicionales para mostrar en consola
        if (num1 > num2){
            System.out.println("El primer n�mero, " +num1 + ", es mayor que el n�mero dos," +num2);
        }else if (num1 < num2){
            System.out.println("El segundo n�mero, " +num2 + ", es mayor que el primer n�mero " +num1);
        }else {
            System.out.println("Ambos n�meros son iguales, " +num1);
        }    

        // Variante para determinar el numero menor y el numero mayor del problema
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Muestra los n�meros desde el menor hasta el mayor de los dos numeros ingresados
        System.out.println("N�meros desde el menor hasta el mayor:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

