package com.ciclos;

public class Ciclos7_DSL {

	public static void main(String[] args) {
//		// Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
//		dinero? 

		double p= 700;//Inicializamos el costo que se va invertir
		double r = 0.02;//Inicializamos el interes que se le otroga mes con mes
		double a = 1500;//inicializamos el capital que se logra obtener
		int mes = 0;//iniciaizamos la variable mes
		
		//Se declara el ciclo while en el cual decimos que p(Capital) es menor igual a(interes)
		 while(p<=a) {
			p+=(p*r);//despues hacemos la ecuacion de la suma junto con la multiplicacion para poder saber cuanto estara subiendo por mes
			 mes++;//Nos sirve para incrementar la variable mes
		}
		//Mandamos a consola el resultado de los meses para llegar al objetivo
		System.out.printf("Se necesitan " + mes + " meses para recuperar los 1500.");
	}
}


