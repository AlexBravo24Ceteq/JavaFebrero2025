package com.ciclos;

public class ciclos7_RHV {

	public static void main(String[] args) {
		 double principal = 700.00;
	        double tasaInteres = 2.0;
	        double montoObjetivo = 1500.00;

	        int meses = 0;
	        double montoActual = principal;

	        while (montoActual <= montoObjetivo) {
	            montoActual *= (1 + tasaInteres / 100);
	            meses++;
	            System.out.println("monto de mes: "+ meses + " $"+montoActual);
	        }

	        System.out.println("Se necesitarán " + meses + " meses para superar los $1500.");
	   }

}
