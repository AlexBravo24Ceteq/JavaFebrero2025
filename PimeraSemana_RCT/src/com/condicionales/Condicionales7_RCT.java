package com.condicionales;

import java.util.Scanner;

public class Condicionales7_RCT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("PROBLEMA 7");// El director de una escuela está organizando un viaje de estudios y 
		                                 //requiere determinar cuánto debe cobrar a cada alumno y 
		                                 //cuánto debe pagar a la compañía de viajes por el servicio.
		System.out.println("COTIZACION DE VIAJE POR ALUMNO");
		//La cotizacion de viaje por alumno es la sig.
		//Si son 100 alumnos o mas, el costo por cada alumno es de 65 euros. 
		//De 50 a 99 alumnos, el costo es de 70 euros. 
		//De 30 a 49 alumnos, el costo es de 95 euros. 
		//Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
		 
		Scanner input = new Scanner(System.in);
		
		    int numeroAlumnos;
		// Solicitud de datos al usuario
		    System.out.println("Este programa calcula el precio a pagar por alumno en el viaje de fin de curso:");
		    System.out.print("Número de alumnos: ");
		    numeroAlumnos = input.nextInt();
		// Realizamos Cálculos y mostramos en pantalla
		    if (numeroAlumnos >= 100) {
		      System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " "
		          + "euros y cada alumno debe pagar 65 Euros");
		    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
		      System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
		          + "euros y cada alumno debe pagar 70 Euros");
		    } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
		      System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
		          + "euros y cada alumno debe pagar 95 Euros");
		    } else {
		      System.out.println("El coste del autobús es de 4000 euros y cada alumno "
		          + "debe pagar " + (4000/numeroAlumnos) + " Euros.");

	}

}
}
