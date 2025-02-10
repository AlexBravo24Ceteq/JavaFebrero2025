package com.condicionales;

import java.util.Scanner;

public class Condicionales_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el total de la donacion recibida");
		double donacion = input.nextDouble(); 
		
		double salud= 0; 
		double comedor=0; 
		double bolsa=0; 
		
		if(donacion >= 10000) {
			salud= donacion*.30; 
			comedor= donacion*.50;
			bolsa = donacion*.20; 

		}

		else {
			salud= donacion*.25; 
			comedor= donacion*.60;
			bolsa = donacion*.15; 

		}
		System.out.println("Se destinara al centro del salud:  " +  salud + ", al comedor: " + comedor + " y a la bolsa: " + bolsa );

		
		}
		

}
