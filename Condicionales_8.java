package com.condicionales;

import java.util.Scanner;

public class Condicionales_8 {
			// Pide por teclado el resultado (dato entero) obtenido al lanzar un dado de
			//seis caras y muestra por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado
			//obtenido.
			//Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
			//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje:
			//�ERROR: n�mero incorrecto


	public static void main(String[] args) {
		
		System.out.println("---------------PROBLEMA 8-----------------");
	
		
		double resultado; 
		String opuesto = " " ; 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el resultado al lanzar el dado");
		resultado = input.nextDouble(); 
		
		if( resultado == 1 ) {
			opuesto = "seis";
		}
		else if( resultado == 2 ) {
			opuesto = "cinco";
		}
		else if( resultado == 3 ) {
			opuesto = "cuatro";
		}
		else if( resultado == 4 ) {
			opuesto = "tres";
		}
		else if( resultado == 5 ) {
			opuesto = "dos";
		}
		else if( resultado == 6 ) {
			opuesto = "uno";
		}
	
		System.out.println("El lado opuesto del resultado es " + opuesto);


	}
}


