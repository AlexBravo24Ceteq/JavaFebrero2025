package com.ciclos;

import java.util.Scanner;

public class Ciclos6_RCT {

	public static void main(String[] args) {
		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		//todo el dinero lo reinvierte? 
		System.out.println("ciclos Problema 6");
		System.out.println("MOSTRAR LA CANTIDAD DE DINERO GENERADA DURANTE 12 MESES CON UN INTERES"
				+ " DEL 2% OTORGADO POR EL BANCO");
		
		Scanner inversion = new Scanner(System.in);
		System.out.println("Ingrese cantidad que desee invertir");
		
		double dinero = inversion.nextDouble();
		int meses = 1;
		
		System.out.println("Total generado durante los 12 meses:");
		while (meses<=12) { dinero = dinero * 1.02;
		meses++;
		} 
		System.out.println(dinero);
				
			}
		}




	
