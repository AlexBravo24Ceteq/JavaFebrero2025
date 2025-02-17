package com.ciclos;

import java.util.Scanner;

public class Ciclos11_RCT {

	public static void main(String[] args) {
		// .Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8 
		
		System.out.println("Ciclos Problema 11");
		System.out.println("DIBUJAR UN CUADRADO INDICANDO EN EL TECLADO"
				+ "EL ANCHO Y EL ALTO\n");
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ancho del cuadrado: ");
        int ancho = scanner.nextInt();

        System.out.print("Introduce el alto del cuadrado: ");
        int alto = scanner.nextInt();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
	
	    
	


