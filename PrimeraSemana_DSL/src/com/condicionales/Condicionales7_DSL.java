package com.condicionales;

import java.util.Scanner;

public class Condicionales7_DSL {

	public static void main(String[] args) {
//		//El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//		cobrar es la siguiente: 
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros. 
//		* De 50 a 99 alumnos, el costo es de 70 euros. 
//		* De 30 a 49 alumnos, el costo es de 95 euros. 
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//		alumnos. 
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//		pagar cada alumno por el viaje.

		Scanner input = new Scanner (System.in);
		
		//Entrada de datos
		System.out.println("Introduce el numero de alumnos que tomaran el viaje: ");
		double NumAlum = input.nextDouble();
		
		//Declara variable para operaciones condicionales
	    double x = NumAlum;
	    
	    // Condicionales
		 if (x>=100) {
			System.out.println("El costo por cada alumno es de 65 euros y el costo total es: " + (x*65) +  " EUROS ");
		} else if (x>=50 && x<=99){
			System.out.println("El costo por cada alumno es de 70 euros y el costo total es: " + (x*70) + " EUROS ");
		} else if (x>=30 && x<=49) {
			System.out.println("El costo por cada alumno es de 95 euros y el costo total es: " + (x*95) + " EUROS ");
		} else if (x<30 && x>=1) {
			System.out.println("El costo de la renta del autobus es de 4000 euros, lo cual por alumnos se estaria pagando: " + (4000/x) + " por alumno ");
		} else {
			System.out.println("El numero ingresado es invalido");
		}
	}
}
