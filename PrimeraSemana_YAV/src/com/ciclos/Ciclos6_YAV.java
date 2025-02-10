package com.ciclos;

public class Ciclos6_YAV {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, 
		//el cual le otorga un 2% de interés mensual. 
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		//todo el dinero lo reinvierte?
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 6==");
		System.out.println("============================");
		
		double dinero,interes,gana,total;
		dinero=1000;
		interes=0.02;
		
		
		for (int i = 0; i < 12; i++) {
			dinero += dinero * interes;
			
		}
		System.out.println("la cantidad de tu dinero total es: "+ dinero);
		


	}

}
