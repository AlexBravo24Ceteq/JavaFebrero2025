package com.ciclos;

import java.util.Scanner;

public class Ciclos2_RCT {
       // Programar un algoritmo que realice la tabla de multiplicar de n numero
	   //introducido desde teclado, hasta la iteración deseada por el usuario. 
	   //Ejemplo, tabla de 23 hasta el 95. 
 
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("ingresa numero de la tabla para multiplicar:");
		int n = valor.nextInt();
		
		System.out.println("ingresa numero de veces a multiplicar:");
		int m = valor.nextInt();
		
		for (int i = n; i <=n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
		
		

	}

}
