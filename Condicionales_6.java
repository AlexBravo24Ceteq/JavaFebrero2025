package com.condicionales;

import java.util.Scanner;

public class Condicionales_6 {
	// Fijar un precio inicial al kilo de uva, la cual se
	//clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
	//Cuando se realiza la venta del producto, �sta
	//es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
	//entrega en un embarque considerando lo siguiente:
	//* Si es de tipo A: 
	//se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 
	//30 c�ntimos si es de tama�o 2.
	//Si es de tipo B, 
	 //se rebajan 30 c�ntimos cuando es de tama�o 1
	//50 c�ntimos cuando es de tama�o 2.
	//Precio inicial se recibe desde teclado

	public static void main(String[] args) {
	
		
System.out.println("---------------PROBLEMA 6-----------------");
		
		
		char tipo; 
		double tama�o; 
		double precioinicial; 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el tipo de uva (A o B)");
		tipo = input.next().charAt(0); 
		System.out.println("Introduce el tama�o de la uva (1 o 2)");
		tama�o = input.nextDouble(); 
		System.out.println("Introduce el precio inicial de la uva");
		precioinicial = input.nextDouble();
		
		System.out.println( );
		if( tipo == 'A' && tama�o == 1 ) {
			System.out.println("El precio final es: " + (precioinicial + .20) );
		}
		else if( tipo == 'A' && tama�o == 2 ) {
			System.out.println("El precio final es: " + (precioinicial + .30) );
		}
		else if( tipo == 'B' && tama�o == 1 ) {
			System.out.println("El precio final es: " + (precioinicial - .30) );
		}
		else if( tipo == 'B' && tama�o == 2 ) {
			System.out.println("El precio final es: " + (precioinicial - .50) );
		}

	}

}
