package com.condicionales;

import java.util.Scanner;

public class Condicionales8_DSL {

	public static void main(String[] args) {
//		//Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
//		obtenido. 
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
//		“ERROR: número incorrecto”

		        Scanner scanner = new Scanner(System.in);
		        
		        // Solicitar al usuario el número del dado
		        System.out.print("Introduce el número obtenido en el dado (1-6): ");
		        int numero = scanner.nextInt();
		        
		        // Determinar el número opuesto y convertirlo a texto
		        String resultado;
		         switch (numero) {
		            case 1: resultado = "seis";
		            break;
		            case 2: resultado = "cinco"; 
		            break;
		            case 3: resultado = "cuatro"; 
		            break;
		            case 4: resultado = "tres"; 
		            break;
		            case 5: resultado = "dos"; 
		            break;
		            case 6: resultado = "uno"; 
		            break;
		            default: resultado = "ERROR: número incorrecto";
		            break;
		        }

		        // Mostrar el resultado
		        System.out.println(resultado);
		    }
	}
