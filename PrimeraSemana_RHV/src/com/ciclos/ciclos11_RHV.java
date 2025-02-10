package com.ciclos;

import java.util.Scanner;

public class ciclos11_RHV {

	public static void main(String[] args) {
		
		
//		11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
//		ancho y el alto. Ejemplo: 8 x 8
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el ancho del cuadrado: ");
        int ancho = scanner.nextInt();

        System.out.print("Ingresa el alto del cuadrado: ");
        int alto = scanner.nextInt();

        // Rellenar el cuadrado con asteriscos seguidos de espacio
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*  ");
            }
            System.out.println();  // Salto de línea después de cada fila
        }

        scanner.close();
	}

}
