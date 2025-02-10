package com.ciclos;

import java.util.Scanner;

public class Ciclos4_YAV {

	public static void main(String[] args) {
		//4.Programa que reciba una frase y una letra por teclado. 
		//Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
		//Si no existe, imprimir un mensaje “Carácter no encontrado”. 
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 4==");
		System.out.println("============================");
		System.out.println();
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce la frase: ");
	    String frase=input.nextLine();
	    
	    System.out.print("Introduce una letra: ");
	    String letra=input.nextLine();
	    
	    char let=letra.charAt(0);
	    int conteo=0;
	   
	    for(int i=0; i<frase.length();i++) {
	    	if(frase.charAt(i)==let) {
	    		conteo++;
	    	}
	    }
	    
	    if(conteo>1) {
	    	System.out.println("La letra " + letra + " aparace en la frase " + conteo + " veces");
	    }else if (conteo==1){
	    	System.out.println("La letra " + letra + " aparace en la frase " + conteo + " una vez");
	    	
	    }else {
	    	System.out.println("Carácter no encontrado");
	    }
	    
	    
	}

}
