package com.condicionales;

import java.util.Scanner;

public class Condicionales13_YAV {

	public static void main(String[] args) {
		//13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa
		//y lo reparte entre un centro de salud, un comedor de ni�os
		//y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	    //Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud,
		//50% al comedor de ni�os y el resto se invierte en la bolsa.
		//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 
		//60% al comedor de ni�os y el resto se invierte en la bolsa.
		//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		
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
			System.out.println("Se tiene que destinar al comedor de ni�os: "+comedor);
			bolsa=(20*donacion)/100;
			System.out.println("Y por ultimo a la bolsa de valores: "+bolsa);
	
		}else if(donacion<10000){
			salud=(25*donacion)/100;
			System.out.println("Se tiene que destinar a salud: "+salud);
			comedor=(60*donacion)/100;
			System.out.println("Se tiene que destinar al comedor de ni�os: "+comedor);
			bolsa=(15*donacion)/100;
			System.out.println("Y por ultimo a la bolsa de valores: "+bolsa);
			
		}

	}

}
