package com.condicionales;

import java.util.Scanner;

public class Condicionales3_DSL {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división 
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		
Scanner num = new Scanner (System.in);
		
		System.out.println("Introduce el primer numero");
		int x = num.nextInt();
		System.out.println("Introduce el segundo numero");
		int y = num.nextInt();
		
		int z = 0;
		 if(y==0) {
			System.out.println("ERROR");	
		} else z = x/y; {
			System.out.println("El resultado es:" + z);
		}
	}
}
