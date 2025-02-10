package com.condicionales;

import java.util.Scanner;

public class Condicionales6_YAV {

	public static void main(String[] args) {
		//6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		//Cuando se realiza la venta del producto, ésta 
		//es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		//entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		//es de tamaño 2.
		//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		//tamaño 2.
		//Precio inicial se recibe desde teclado
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 6==");
		System.out.println("============================");
		
        Scanner input= new Scanner(System.in);
		double total;
		System.out.print("Introduce los kilos de uva: ");
		int kilos;
		kilos=input.nextInt();
		
		System.out.print("Introduce el precio de la uva: ");
		double precio;
		precio=input.nextInt();
		
		System.out.print("Introduce el tipo de uva A o B: ");
		char tipo = input.next().toUpperCase().charAt(0);
		
		System.out.print("Introduce el tamaño de la uva 1 o 2: ");
		int tamaño;
		tamaño=input.nextInt();
		
		if (tipo=='A' && tamaño==1) {
			precio=precio+0.20;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tamaño de uva "+tamaño);
			System.out.println("Ganacia total "+total);
		}else if(tipo=='A' && tamaño==2) {
			precio=precio+0.30;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tamaño de uva "+tamaño);
			System.out.println("Ganacia total "+total);
		}else if(tipo=='B' && tamaño==1) {
			precio=precio-0.30;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tamaño de uva "+tamaño);
			System.out.println("Ganacia total "+total);
		}else if(tipo=='B' && tamaño==2) {
			precio=precio-0.50;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tamaño de uva "+tamaño);
			System.out.println("Ganacia total "+total);
		}else {
			System.out.println("Error");
		}
		

	}

}
