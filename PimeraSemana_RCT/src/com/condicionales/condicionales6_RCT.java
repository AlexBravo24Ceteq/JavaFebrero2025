package com.condicionales;

import java.util.Scanner;

public class condicionales6_RCT {
	

	public static void main(String[] args) {
		//Se requiere determinar cu�nto recibir� un productor por la uva que 
		//entrega en un embarque considerando lo siguiente: 
	    //Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 
		//y 30 c�ntimos si es de tama�o 2.
	    //Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, 
	    //y 50 c�ntimos cuando es de tama�o 2.
		System.out.println("PROBLEMA 6");
		
	      Scanner input = new Scanner(System.in);
	           
	          System.out.println("Este programa calcula la ganancia seg�n el tipo de vino, tama�o y cantidad vendida:");
	          
	          int kilos;
	           double precioInicial;
	           String tipo;
	           int tamano;
	          
	          System.out.print("Introduce los Kg. de uva entregada: ");
	          kilos = input.nextInt();
	          System.out.print("Precio por Kg.: ");
	          precioInicial = input.nextDouble();
	    System.out.print("Tipo de uva A � B: ");
	    tipo = input.next(); input.nextLine();
	    System.out.print("Ta�ano de uva 1 � 2: ");
	    tamano = input.nextInt(); 


	            if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
	        (tamano == 1 || tamano == 2))) {
	      System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
	    } else {
	      if (tipo.toUpperCase().equals("A") && tamano == 1) {
	        System.out.println("Total: " + ((kilos * precioInicial)+(kilos*0.20)));
	      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
	        System.out.println("Total:: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
	        System.out.println("Total:: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
	        System.out.println("Total:: " + ((kilos*precioInicial)-(kilos*0.50)));
	        
	      }
	            }
	        
	    }

}

