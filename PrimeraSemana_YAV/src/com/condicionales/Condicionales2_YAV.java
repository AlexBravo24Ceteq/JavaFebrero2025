package com.condicionales;

import java.util.Scanner;

public class Condicionales2_YAV {

	public static void main(String[] args) {
		
		//2.Realiza un programa que pida un número por teclado
		//y nos indique si es par o impar.

		System.out.println("============================");
		System.out.println("==PROBLEMA 2==");
		System.out.println("============================");
		
        Scanner input=new Scanner (System.in);
		
        System.out.print("Introduce el numero: ");
		int x;
		
		x= input.nextInt();
		int y;
		y=x%2; //el % es el residuo de una division, dado a que si nos da 0 el numero es par 
		
		if (y==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}

	}

}
