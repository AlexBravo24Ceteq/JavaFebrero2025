package com.ciclos;

public class Ciclos7_YAV {

	public static void main(String[] args) {
		//7- Una persona desea invertir $700.00 en un banco, 
		//el cual le otorga un 2% de interés mensual. 
		//¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 7==");
		System.out.println("============================");
		
		double dinero,interes,inversion,ganancia;
		dinero=700;
		interes=0.02;
		inversion=dinero;
		int mes;
		
		for ( mes = 0; inversion <1500 ; mes++) {
			ganancia=inversion*interes;
			inversion += ganancia;
		}
		
		System.out.println("Obtendras $1500 en " + mes + " meses" );

	}

}
