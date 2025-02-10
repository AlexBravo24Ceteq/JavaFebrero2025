package com.condicionales;

import java.util.Scanner;

public class Condicionales5_RHV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
//		parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		System.out.println("-----------------------");
		System.out.println("-----PROBLEMA5----------");
		System.out.println("-----------------------");
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("introduce tu edad");
		
		int edad= input.nextInt();
		
		System.out.println("introduce tu califiacion");
		
		double cal= input.nextDouble();
		
		System.out.println("introduce tu sexo: M para masculino. F para femenino");
		input.nextLine();

		String sexo = input.nextLine();
			sexo=sexo.toUpperCase();
			System.out.println(" Tu edad es "+edad+ "\n tu sexo Es: " +sexo +" \n tu calificacion es "+ cal);			
			
			if (edad>=17&&cal>=5 && sexo.equals("M")) {
				
				System.out.println(" \n Estatus: PROBABLE");				
				
				
			}else if(edad>=17&&cal>=5 && sexo.equals("F")) {
				
				System.out.println(" \n Estatus: ACEPTADO");

				
			}else 
				System.out.println(" \n Estatus: NO ACEPTADO");

				
//			if(edad>=17&&cal>=5 && sexo.equals("F")) {
//				
//				switch (sexo) {
//				
//				case "F":
//		System.out.println("tu edad es "+ edad + " tu sexo es fenemino tu califiacion es "+cal+" Estatus aceptada");
//		
//			break;
//				case "M":
//		
//		System.out.println(" tu edad es "+ edad + " tu sexo es Masculino tu califiacion es "+cal+" Estatus posiblemente");
//			break;
//			
//			
//				default:
//
//
//				}
//	}else{
//		
//		System.out.println("no aceptado");
//	}
//
//		
//		

				
		

		

//
//		}else {
//			
//			
//			System.out.println("NO ACEPTADO");
//		}
		
		
		input.close();



		
		

	}



}
