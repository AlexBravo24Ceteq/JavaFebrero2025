package com.condicionales;

import java.util.Scanner;

public class Condicionales13_YAV {

	public static void main(String[] args) {
		//13. Una institución benéfica recibe anualmente una donación proveniente de Europa
		//y lo reparte entre un centro de salud, un comedor de niños
		//y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	    //Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud,
		//50% al comedor de niños y el resto se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 
		//60% al comedor de niños y el resto se invierte en la bolsa.
		//La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 13==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce la donacion: ");
		double donacion;
		donacion=input.nextDouble();
		double salud,comedor,bolsa;
		if(donacion>=10000) {
			salud=(30*donacion)/100;
			System.out.println("Se tiene que destinar a salud: "+salud);
			comedor=(50*donacion)/100;
			System.out.println("Se tiene que destinar al comedor de niños: "+comedor);
			bolsa=(20*donacion)/100;
			System.out.println("Y por ultimo a la bolsa de valores: "+bolsa);
	
		}else if(donacion<10000){
			salud=(25*donacion)/100;
			System.out.println("Se tiene que destinar a salud: "+salud);
			comedor=(60*donacion)/100;
			System.out.println("Se tiene que destinar al comedor de niños: "+comedor);
			bolsa=(15*donacion)/100;
			System.out.println("Y por ultimo a la bolsa de valores: "+bolsa);
			
		}

	}

}
