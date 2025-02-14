package com.condicionales;

import java.util.Scanner;

public class Condicionales3_YAV {

	public static void main(String[] args) {
		//3.Crea un programa que pida al usuario dos números 
		//y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.

		
		System.out.println("============================");
		System.out.println("==PROBLEMA 3==");
		System.out.println("============================");
		
        Scanner input=new Scanner (System.in);
		
        System.out.print("Introduce un primer numero: ");
		int x;
		x= input.nextInt();
	
        System.out.print("Introduce un segundo numero: ");
		int y;
		y= input.nextInt();
		
		
		if (y==0) {
			System.out.println("Error");
		}else {
			System.out.println("El resultado es:" +x/y);
		}

	}

}
