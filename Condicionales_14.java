package com.condicionales;

import java.util.Scanner;

public class Condicionales_14 {

		public static void main(String[] args) {

			Scanner input = new Scanner (System.in);
			System.out.println("Introduce el total de horas trabajadas");
			int horas = input.nextInt(); 
			
			int total= 0; 
			
			if(horas <= 40) {
				total= horas*16;
			}

			else {
				int horasextras= horas- 40; 
				total = (40 * 16)  + (horasextras * 20);

			}
			System.out.println("el salario semana es " + total);

			
			}
			

	}
		
	

