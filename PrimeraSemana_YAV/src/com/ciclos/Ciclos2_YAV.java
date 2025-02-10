package com.ciclos;

import java.util.Scanner;

public class Ciclos2_YAV {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar 
		//de un numero introducido desde teclado, hasta la iteración deseada 
		//por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		System.out.println("============================");
		System.out.println("==PROBLEMA 2==");
		System.out.println("============================");
		System.out.println();
		
        Scanner input= new Scanner(System.in);
		System.out.print("Introduce que tabla deseas multiplicar: ");
		int m;
		m= input.nextInt();
		
		System.out.print("Introduce hasta que numero los deseas multiplicar: ");
		int i;
		i= input.nextInt();
		System.out.println();
		for (int y = 1;  y<=i; y++) {

			System.out.println( m + "x" + y + "=" + (m * y));
			
		}


	}

}
