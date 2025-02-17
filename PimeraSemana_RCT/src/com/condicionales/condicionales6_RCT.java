package com.condicionales;

import java.util.Scanner;

public class condicionales6_RCT {
	

	public static void main(String[] args) {
		//Se requiere determinar cuánto recibirá un productor por la uva que 
		//entrega en un embarque considerando lo siguiente: 
	    //Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 
		//y 30 céntimos si es de tamaño 2.
	    //Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, 
	    //y 50 céntimos cuando es de tamaño 2.
		System.out.println("PROBLEMA 6");
		
	      Scanner input = new Scanner(System.in);
	           
	          System.out.println("Este programa calcula la ganancia según el tipo de vino, tamaño y cantidad vendida:");
	          
	          int kilos;
	           double precioInicial;
	           String tipo;
	           int tamano;
	          
	          System.out.print("Introduce los Kg. de uva entregada: ");
	          kilos = input.nextInt();
	          System.out.print("Precio por Kg.: ");
	          precioInicial = input.nextDouble();
	    System.out.print("Tipo de uva A ó B: ");
	    tipo = input.next(); input.nextLine();
	    System.out.print("Tañano de uva 1 ó 2: ");
	    tamano = input.nextInt(); 


	            if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
	        (tamano == 1 || tamano == 2))) {
	      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
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

