package com.condicionales;

import java.util.Scanner;

public class Condicionales1 {

	public static void main(String[] args) {
		//Realize un programa que reciba dos numeros 
		//por teclado e indique cual es mayour si son iguales 
		
		
		System.out.println("---------------PROBLEMA 1-----------------");
		
		double numero1;
		double numero2;
		
		Scanner input1 = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		numero1 = input1.nextDouble(); 
		
		Scanner input2 = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		numero2 = input2.nextDouble(); 
		
		if(numero1 > numero2) {
			
			System.out.println("El numero mayor es: " + numero1);
			
		}
		else if(numero1 < numero2){
			
			System.out.println("El numero mayor es: " + numero2);
		}
		else {
			System.out.println("Los numeros son iguales " );
		}
		

		
	}
}


