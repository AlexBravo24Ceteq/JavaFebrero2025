package com.condicionales;

import java.util.Scanner;

public class Condicionales2_DSL {

	public static void main(String[] args) {
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar.

		Scanner num = new Scanner (System.in);
		System.out.println("Introduce un numero");
		 
		int n = num.nextInt();
		if(n%2==0) {
			System.out.println("Es par");
			}else{
			System.out.println("Es impar");
		}
	}
}
