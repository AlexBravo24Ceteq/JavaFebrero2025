package com.condicionales;

import java.util.Scanner;

public class Condicionales_11 {

	public static void main(String[] args) {
		
		System.out.println("---------------PROBLEMA 11-----------------");
	
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el peso del paquete");
		double peso = input.nextDouble(); 
		System.out.println("Introduce la ubicacion del 1 al 5  \n1. America del Norte  \n2. America Central \n3. America del Sur \n4. Europa  \n5. Asia  ");
		double zona = input.nextDouble(); 
		
		double total= 0; 
		
		if( peso > 5 ) {
			System.out.println("No se puede transportar por cuestiones de seguridad");
		}
		else {
			if(zona == 1)
			{
				total = peso* 24;
			}
			else if (zona == 2)
			{
				total = peso* 20;
			}
			else if (zona == 3)
			{
				total = peso* 21;
			}
			else if (zona == 4)
			{
				total = peso* 10;
			}
			else if (zona == 5)
			{
				total = peso* 18;
			}
			
		}
		
		System.out.println("El costo por trasnportar el paquete es " +  total );


	}

}
