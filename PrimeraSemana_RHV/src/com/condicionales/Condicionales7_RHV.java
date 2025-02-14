package com.condicionales;

import java.util.Scanner;

public class Condicionales7_RHV {
//	
//	El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
//	debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
//	cobrar es la siguiente:
//	* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//	* De 50 a 99 alumnos, el costo es de 70 euros.
//	* De 30 a 49 alumnos, el costo es de 95 euros.
//	* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
//	alumnos.
//	Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
//	pagar cada alumno por el viaje.
	
	
	public static void main(String[] args) {
		
		
		System.out.println("-----------------------");
		System.out.println("-----PROBLEMA_7----------");
		System.out.println("-----------------------");
		
		
		Scanner input= new Scanner (System.in);
		
		int numeroAlumnos;
		
		do {
		
		System.out.println("Ingresa total de alumnos para el viaje: ");	
		
		 while (!input.hasNextInt()) {
	            System.out.println("Error: Debes ingresar un número válido.");
	            input.next();
	        }
		 
		 numeroAlumnos= input.nextInt();

		 
		}while(numeroAlumnos<=0);
		
		 
		 
		 double costoTotal;
		 double costoUnitario;
		 
		 if(numeroAlumnos>=100) {
			 			 
			 costoUnitario=65;
			 costoTotal=numeroAlumnos*costoUnitario;
			 		 
			 
		 }else if (numeroAlumnos>= 50 && numeroAlumnos <100) {
			 
			 costoUnitario=70;
			 costoTotal=numeroAlumnos*costoUnitario;
			 
		 }else if (numeroAlumnos>= 30 && numeroAlumnos <50) {
			 
			 costoUnitario=95;
			 costoTotal=numeroAlumnos*costoUnitario;
			 
		 }else {
			 costoUnitario=4000/(double) numeroAlumnos;
			 costoTotal=numeroAlumnos*costoUnitario;			 			 
			 
		 }
		 System.out.printf("El pago a la compañia es de:$ %.2f%n", costoTotal);
	     System.out.printf("El pago por alumno es :$ %.2f%n", costoUnitario);

	     input.close();
		 		
		
		
		
		
	}

}
