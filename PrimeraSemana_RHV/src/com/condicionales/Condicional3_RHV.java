package com.condicionales;

import java.util.Scanner;

public class Condicional3_RHV {

	public static void main(String[] args) {
		
		
		
		// Crea un programa que pida al usuario
//		dos n�meros y muestre el resultado de su
//		divisi�n. Si el
//		segundo n�mero es 0, debe mostrar un
//		mensaje de error
//		
		System.out.println("-----------------------");
		System.out.println("-----PROBLEMA3----------");
		System.out.println("-----------------------");
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("introduce un numero");
		
		double x= input.nextDouble();
		System.out.println("introduce segundo numero");		
		double y= input.nextDouble();
		
		if(y!=0) {
		
		double res=x/y;
		
		
		System.out.println(x+" divido por "+y+ " es igual a = "+res);
		}else {
			
			System.out.println(" ERROR el segundo numero debe de ser diferente de cero");

		}
input.close();
		
		
		
		
		
		

	}

}
