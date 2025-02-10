package com.condicionales;

import java.util.Scanner;

public class Condicionales8_RHV {
	
	public static void main(String[] args) {
		
		
		
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
//		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
//		“ERROR: número incorrecto”.
		
		
		 Scanner scanner = new Scanner(System.in);
	        int numero;
	        
	        do {
	            System.out.print("Ingrese el resultado del dado (1-6): ");
	            numero = scanner.nextInt();
	            if (numero < 1 || numero > 6) {
	                System.out.println("ERROR: número incorrecto. Inténtelo nuevamente.");
	            }
	        } while (numero < 1 || numero > 6);
	        
	        scanner.close();
	        
	        String resultado = null;
	        switch (numero) {
	            case 1: resultado = "seis"; break;
	            case 2: resultado = "cinco"; break;
	            case 3: resultado = "cuatro"; break;
	            case 4: resultado = "tres"; break;
	            case 5: resultado = "dos"; break;
	            case 6: resultado = "uno"; break;
	            default: }
	        
	        System.out.println(resultado);
	
	}

}
