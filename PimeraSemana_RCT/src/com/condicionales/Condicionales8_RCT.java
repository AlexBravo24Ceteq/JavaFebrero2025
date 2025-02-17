package com.condicionales;

import java.util.Scanner;

public class Condicionales8_RCT {

	public static void main(String[] args) {
		// 
		
		
		 Scanner input = new Scanner(System.in);
		    int dado;
		// Solicitud de datos al usuario
		    System.out.println("El programa indica el número aparecido en el "
		        + "lado opuesto al que sale en el dado:");
		    System.out.print("Resultado de la cara obtenida: ");
		    dado = input.nextInt();
		// Realizamos comparaciones y mostramos el resultado
		    switch (dado) {
		    case 1:
		      System.out.println("En la cara opuesta está el \"seis\".");
		      break;
		    case 2:
		      System.out.println("En la cara opuesta está el \"cinco\".");
		      break;
		    case 3:
		      System.out.println("En la cara opuesta está el \"cuatro\".");
		      break;
		    case 4:
		      System.out.println("En la cara opuesta está el \"tres\".");
		      break;
		    case 5:
		      System.out.println("En la cara opuesta está el \"dos\".");
		      break;
		    case 6:
		      System.out.println("En la cara opuesta está el \"uno\".");
		      break;
		    default:
		      System.out.println("ERROR: número incorrecto.");
		    }


	}

}
