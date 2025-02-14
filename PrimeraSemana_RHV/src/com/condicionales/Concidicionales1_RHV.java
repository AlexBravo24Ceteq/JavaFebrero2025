package com.condicionales;

import java.util.Scanner;

public class Concidicionales1_RHV {

	public static void main(String[] args) {
		
		
		//realiza un programa que reciba dos numeros 
		//por teclado e indique cual es mayo o si son iguales
		
		
		System.out.println("-----------------------");
		System.out.println("-----PROBLEMA1----------");
		System.out.println("-----------------------");
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("introduce un numero");
		
		int x= input.nextInt();
		System.out.println("introduce segundo numero");		
		int y= input.nextInt();
		
			if(x==y) {
				System.out.println("los numeros son iguales");		

			}else if(x>y){
				
				System.out.println("el primer numero es mayor");
				
				

				
				
			}else {
				System.out.println("el segundo numero es mayor");
				
				

				
				
			}
			
		
		
		
		input.close();
		
		
		
		
		
	}

}
