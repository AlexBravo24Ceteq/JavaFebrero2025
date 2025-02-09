package com.condicionales;

import java.util.Scanner;

public class Condicionales_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------PROBLEMA 4-----------------");

		//lee un caracter  y comprueba si es una letra mayúscula.

		
		 
		char letra;
		Scanner input = new Scanner (System.in);
		System.out.println("Ingrese una letra");
		letra = input.next().charAt(0); 
		
		
		if(Character.isLowerCase(letra)) {
			
			System.out.println("La letra es minuscula" );
			
		}
		
		else if (Character.isUpperCase(letra)){
			System.out.println("La letra es mayuscula" );
		}
		

	}


}
