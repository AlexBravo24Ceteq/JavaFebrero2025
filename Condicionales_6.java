package com.condicionales;

import java.util.Scanner;

public class Condicionales_6 {
	// Fijar un precio inicial al kilo de uva, la cual se
	//clasifica en tipos (A y B), y además en tamaños (1 y 2).
	//Cuando se realiza la venta del producto, ésta
	//es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
	//entrega en un embarque considerando lo siguiente:
	//* Si es de tipo A: 
	//se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 
	//30 céntimos si es de tamaño 2.
	//Si es de tipo B, 
	 //se rebajan 30 céntimos cuando es de tamaño 1
	//50 céntimos cuando es de tamaño 2.
	//Precio inicial se recibe desde teclado

	public static void main(String[] args) {
	
		
System.out.println("---------------PROBLEMA 6-----------------");
		
		
		char tipo; 
		double tamaño; 
		double precioinicial; 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el tipo de uva (A o B)");
		tipo = input.next().charAt(0); 
		System.out.println("Introduce el tamaño de la uva (1 o 2)");
		tamaño = input.nextDouble(); 
		System.out.println("Introduce el precio inicial de la uva");
		precioinicial = input.nextDouble();
		
		System.out.println( );
		if( tipo == 'A' && tamaño == 1 ) {
			System.out.println("El precio final es: " + (precioinicial + .20) );
		}
		else if( tipo == 'A' && tamaño == 2 ) {
			System.out.println("El precio final es: " + (precioinicial + .30) );
		}
		else if( tipo == 'B' && tamaño == 1 ) {
			System.out.println("El precio final es: " + (precioinicial - .30) );
		}
		else if( tipo == 'B' && tamaño == 2 ) {
			System.out.println("El precio final es: " + (precioinicial - .50) );
		}

	}

}
