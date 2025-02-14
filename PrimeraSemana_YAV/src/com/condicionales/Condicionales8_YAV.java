package com.condicionales;

import java.util.Scanner;

public class Condicionales8_YAV {

	public static void main(String[] args) {
		// 8. Realiza un programa que pida por teclado el resultado (dato entero) 
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero
		//en letras (dato cadena) de la cara opuesta al resultado obtenido.
		//Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
		//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
		//�ERROR: n�mero incorrecto�.
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 8==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce el numero del dado (1-6): ");
		int numdado;
		numdado=input.nextInt();
		String numletra;
		
		switch (numdado) {
		case 1:
			numletra="seis";
			break;
		case 2:
			numletra="cinco";
			break;
		case 3:
			numletra="cuatro";
			break;
		case 4:
			numletra="tres";
			break;
		case 5:
			numletra="dos";
			break;
		case 6:
			numletra="uno";
			break;

		default:
			numletra="ERROR: n�mero incorrecto";
			break;
		}
		
		System.out.println("Resultado de la cara opuesta: "+numletra);

	}

}
