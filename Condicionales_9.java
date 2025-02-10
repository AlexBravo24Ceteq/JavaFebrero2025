package com.condicionales;

import java.util.Scanner;

public class Condicionales_9 {
	//pide el día de la semana (del 1 al 7) y escribe el día correspondiente. Si
	//introducimos otro número nos da un error.

	public static void main(String[] args) {
		
		System.out.println("---------------PROBLEMA 7-----------------");
		
		double dia; 
		String diastring = " " ; 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el dia de la semana del 1 al 7");
		dia = input.nextDouble(); 
		
		if( dia == 1 ) {
			diastring = "lunes";
		}
		else if( dia == 2 ) {
			diastring = "martes";
		}
		else if( dia == 3 ) {
			diastring = "miercoles";
		}
		else if( dia == 4 ) {
			diastring = "jueves";
		}
		else if( dia == 5 ) {
			diastring = "viernes";
		}
		else if( dia == 6 ) {
			diastring = "sabado";
		}
		else if( dia == 7 ) {
			diastring = "domingo";
		}
	
		System.out.println("El dia de la semana es " + diastring);



	}

}
