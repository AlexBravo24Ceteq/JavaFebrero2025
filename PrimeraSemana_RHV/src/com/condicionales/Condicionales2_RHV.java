package com.condicionales;

import java.util.Scanner;

public class Condicionales2_RHV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Realiza un programa que pida un número por teclado y
		//nos indique si es par o impar.
			
		
		System.out.println("-----------------------");
		System.out.println("-----PROBLEMA2----------");
		System.out.println("-----------------------");
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("introduce un numero");
		
		int numero= input.nextInt();
		
        // Determinar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        // Cerrar el scanner
        input.close();

	}

}
