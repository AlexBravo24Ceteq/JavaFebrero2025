package com.condicionales;

import java.util.Scanner;

public class Condicionales14_YAV {

	public static void main(String[] args) {
		//14. Un obrero necesita calcular su salario semanal, 
		//el cual se obtiene de la siguiente manera: Si trabaja 40 
		//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas 
		//se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 14==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce las horas trabajadas: ");
		int horas;
		horas=input.nextInt();
		int horax, total, resto, totalextra;
		
		if(horas<=40) {
			horax=horas*16;
			System.out.println("Tu salario semanal es de: "+horax);
		}else if(horas>40) {
			horax=640;
			resto=horas-40;
			total=resto*20;
			totalextra=horax+total;
			System.out.println("Tu salario semanal es de: "+totalextra);
		}

	}

}
