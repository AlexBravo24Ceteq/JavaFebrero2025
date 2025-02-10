package com.ciclos;

import java.util.Scanner;

public class Ciclos11_YAV {

	public static void main(String[] args) {
		//11.Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 11==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.println("Introduce la altura: ");
		int altura;
		altura= input.nextInt();
		
		System.out.println("Introduce el ancho: ");
		int ancho;
		ancho= input.nextInt();
		
		for (int i = 0; i < altura ; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
