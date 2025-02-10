package com.ciclos;

public class Ciclos6_RHV {

	public static void main(String[] args) {
		 double principal = 1000.00; 
	        double tasaInteres = 2.0; 
	        int meses = 12; 

	        
	        double montoFinal = principal * Math.pow(1 + (tasaInteres / 100), meses);

	        System.out.printf("El monto final después de 1 año será: $%.2f\n", montoFinal);
	    
	}

}
