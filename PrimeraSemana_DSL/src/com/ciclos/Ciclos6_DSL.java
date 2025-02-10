package com.ciclos;

public class Ciclos6_DSL {

	public static void main(String[] args) {
//		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
//		todo el dinero lo reinvierte? 
		
		//se declaran el dinero a invertir,el interes y los meses que tiene el año.
		double p = 1000;
		double r = 0.02;
		int n = 12;
		
		//aplica interes compuesto mes por mes
		 for (int i = 0; i < n; i++) {
			p += p*r;//suma de interes el capital
		}
		
		System.out.printf(" El monto final despues de un año es: $%.2f%n" , p);
	}
 }
