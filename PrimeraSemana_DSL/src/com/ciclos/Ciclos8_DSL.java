package com.ciclos;

import java.util.Scanner;

public class Ciclos8_DSL {

	public static void main(String[] args) {
		//Programa Java que lea dos números y muestre los números desde el menor hasta el 
		//mayor  

        Scanner entrada = new Scanner(System.in);
		
		//Pedimos ingresar por teclado dos numeros
		System.out.print("Ingrese el primer numero:");
		int num1 = entrada.nextInt();		
		System.out.print("Ingrese el segundo numero:");
		int num2 = entrada.nextInt();
		
		int menor = Math.min(num1, num2);//determinar el numero menor
		int mayor = Math.max(num1, num2);//determinar el numero mayor
		
		//Muestra el ciclo el menor hasta el mayor con el ciclo for
		System.out.println("Numeros en orden: ");
		 for (int i = menor; i <= mayor; i++) {
			System.out.println(i + " ");	
		}
	}
}
