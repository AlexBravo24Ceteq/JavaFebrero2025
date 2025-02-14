package com.condicionales;

import java.util.Scanner;

public class Condicionales1_YAV {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado
		//e indique cuál es mayor o si son iguales.

		System.out.println("============================");
		System.out.println("==PROBLEMA 1==");
		System.out.println("============================");
		
		
		//Declaro un Scanner para poder teclear los numeros
		Scanner input=new Scanner (System.in);
		
        System.out.print("Introduce un primer numero: ");
		int x;
		x= input.nextInt();
	
        System.out.print("Introduce un segundo numero: ");
		int y;
		y= input.nextInt();
		
		//Evaluamos
		if (x>y) {
			System.out.println("El primer numero es mayor");
		}else if (x<y) {
			System.out.println("El segundo numero es menor");
		}else {
			System.out.println("Los numeros son iguales");
		}
		
	}

}
