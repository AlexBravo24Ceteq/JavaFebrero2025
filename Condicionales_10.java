package com.condicionales;

import java.util.Scanner;

public class Condicionales_10 {
	//Pide un número entero entre uno y doce 
			//imprime el número de días que tiene el mes correspondiente.


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el numero del mes de 1 al 12");
		double mes = input.nextDouble(); 
		double numerodias= 0; 
		
		if( mes == 1 ) {
			numerodias = 31;
		}
		else if( mes == 2 ) {
			numerodias = 29;
		}
		else if( mes == 3 ) {
			numerodias = 31;
		}
		else if( mes == 4 ) {
			numerodias = 30;
		}
		else if( mes == 5 ) {
			numerodias = 31;
		}
		else if( mes == 6 ) {
			numerodias = 30;
		}
		else if( mes == 7 ) {
			numerodias = 31;
		}
		else if( mes == 8 ) {
			numerodias = 29;
		}
		else if( mes == 9 ) {
			numerodias = 31;
		}
		else if( mes == 10 ) {
			numerodias = 31;
		}
		else if( mes == 11 ) {
			numerodias = 30;
		}
		else if( mes == 12 ) {
			numerodias = 31;
		}
		
	
		System.out.println("El dia de la semana es " + numerodias);



	}

}
