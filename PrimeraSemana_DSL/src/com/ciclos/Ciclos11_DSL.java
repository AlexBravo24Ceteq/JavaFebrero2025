package com.ciclos;

import java.util.Scanner;

public class Ciclos11_DSL {

	public static void main(String[] args) {
		//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8 
		
		Scanner scanner = new Scanner(System.in);
	      
		//Pedimos al usuario ingresar los datos
		System.out.print("Ingresa el ancho de la figura: ");
		int ancho = scanner.nextInt();
		System.out.print("Ingresa el alto de la figura: ");
		int alto = scanner.nextInt();
	    
		//Ciclo en el que se ira incrementando hasta que la condicion se cumpla
		 for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				
		//Se imprime el resultado en este caso * para formar el cuadrado con el ancho y alto ingresado por teclado		
		System.out.print("* ");
		}
		System.out.println();
		}
	}
}


