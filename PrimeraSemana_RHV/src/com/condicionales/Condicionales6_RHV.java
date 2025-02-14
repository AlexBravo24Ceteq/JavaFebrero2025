package com.condicionales;

import java.util.Scanner;

public class Condicionales6_RHV {

	public static void main(String[] args) {
		
		
//		6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
//		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
//		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
//		es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
//		tama�o 2.
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
		System.out.println("Ingresa tama�o de uva (tama�o 1 o 2): ");	
		 while (!input.hasNextInt()) { // Evitar errores si ingresan texto
             System.out.println("Error: Debes ingresar un n�mero (1 o 2).");
             input.next(); // Limpiar 
         }
		
		clasificacionTam=input.nextInt();
		if (clasificacionTam != 1 && clasificacionTam != 2) {
            System.out.println("Error: Debes ingresar 1 o 2.");
        }
    } while (clasificacionTam != 1 && clasificacionTam != 2);


		System.out.println("Ingresa kilos totales de uva: ");	
		
		 while (!input.hasNextInt()) {
	            System.out.println("Error: Debes ingresar un n�mero v�lido.");
	            input.next();
	        }
		
		 kilos= input.nextInt();
		
		System.out.println("Ingresa precio incial de la uva x kg");	
		while (!input.hasNextDouble()) {
            System.out.println("Error: Debes ingresar un n�mero v�lido.");
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
