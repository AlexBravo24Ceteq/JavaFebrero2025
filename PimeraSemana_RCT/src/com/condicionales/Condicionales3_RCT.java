package com.condicionales;

import java.util.Scanner;

public class Condicionales3_RCT {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos numeros y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		System.out.println("PROBLEMA 3");
		
		Scanner input = new Scanner (System.in);
		
		
        System.out.print("Introduzca el numero a dividir: ");
        double x = input.nextDouble();
        System.out.print("Introduzca el numero divisor: ");
        double y = input.nextDouble();
        if(y ==0){
           System.out.println("Error el numero no se puede dividir");   
        }else{
            System.out.println( " = " + x/y);  
            
        }

	}

}
