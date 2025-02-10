package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("introduce un numero");
		
		int x;
		
		x= input.nextInt();
		System.out.println("el numero es "+x);
		
		
		//
		input.nextLine();
		System.out.println("Introduce tu nombre:" );
		String nombre = input.nextLine();

		System.out.println("tu nombre es :"  + nombre );
		

	}

}
