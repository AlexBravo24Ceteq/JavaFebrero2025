package com.condicionales;

import java.util.Scanner;

public class Condicionales6_RHV {

	public static void main(String[] args) {
		
		
//		6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
//		es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
//		tamaño 2.
//		Precio inicial se recibe desde teclado
//		// TODO Auto-generated method stub
		
		
		
		System.out.println("-----------------------");
		System.out.println("-----PROBLEMA_6----------");
		System.out.println("-----------------------");
		
		
		Scanner input= new Scanner (System.in);
		String clasificacionTip;
		int clasificacionTam;
		int kilos;
		double precioInicial;
		
    	do{
    		System.out.println("Ingresa tipo de uva (tipo A o B): ");
    	
    		clasificacionTip= input.nextLine().toUpperCase();
		
        if (!clasificacionTip.equals("A") && !clasificacionTip.equals("B")) {
            System.out.println("Error: Debes ingresar 'A' o 'B'.");
        }
        } while (!clasificacionTip.equals("A") && !clasificacionTip.equals("B"));

    	do {
		System.out.println("Ingresa tamaño de uva (tamaño 1 o 2): ");	
		 while (!input.hasNextInt()) { // Evitar errores si ingresan texto
             System.out.println("Error: Debes ingresar un número (1 o 2).");
             input.next(); // Limpiar 
         }
		
		clasificacionTam=input.nextInt();
		if (clasificacionTam != 1 && clasificacionTam != 2) {
            System.out.println("Error: Debes ingresar 1 o 2.");
        }
    } while (clasificacionTam != 1 && clasificacionTam != 2);


		System.out.println("Ingresa kilos totales de uva: ");	
		
		 while (!input.hasNextInt()) {
	            System.out.println("Error: Debes ingresar un número válido.");
	            input.next();
	        }
		
		 kilos= input.nextInt();
		
		System.out.println("Ingresa precio incial de la uva x kg");	
		while (!input.hasNextDouble()) {
            System.out.println("Error: Debes ingresar un número válido.");
            input.next();
        }
		
		 precioInicial= input.nextDouble();
		
		 double precioFinal;
	        if (clasificacionTip.equals("A")) {
	            precioFinal = (clasificacionTam == 1) ? precioInicial + 0.20 : precioInicial + 0.30;
	        } else { // Caso B
	            precioFinal = (clasificacionTam == 1) ? precioInicial - 0.30 : precioInicial - 0.50;
	        }

	        System.out.println("El precio x kg de uva es: $" + precioFinal);
	        System.out.println("Total a recibir: $" + (precioFinal * kilos));

	        input.close();
		

	}

}
