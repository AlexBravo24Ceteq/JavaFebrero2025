package com.condicionales;

import java.util.Scanner;

public class Condicionales_7 {
	/// determina cuánto se debe cobrar a cada alumno
	//cuánto debe pagar a la compañía de viajes por el servicio.
	//Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
	// De 50 a 99 alumnos, el costo es de 70 euros.
	//De 30 a 49 alumnos, el costo es de 95 euros.
	//Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
	//alumnos.
	
	
	public static void main(String[] args) {
	
		System.out.println("---------------PROBLEMA 7-----------------");
		
		double total = 0; 
		double numeroalums; 
		double costoalum = 0; 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce numero de alumnos");
		numeroalums = input.nextDouble(); 
		
		if( numeroalums >= 100 ) {
			costoalum = 65; 
			total = costoalum* numeroalums; 
		}
		else if( numeroalums >=50 &&  numeroalums <=99 ) {
			costoalum = 70; 
			total = costoalum* numeroalums; 
		}
		else if( numeroalums >=30 &&  numeroalums <=49 ) {
			costoalum = 95; 
			total = costoalum* numeroalums; 
		}
		else if( numeroalums < 30) {
			costoalum = 4000/ 30; 
			total = 4000; 
		}
		System.out.println("El costo por alumno es " + costoalum + " El costo de la renta del autobus es de " + total );

	}

}
