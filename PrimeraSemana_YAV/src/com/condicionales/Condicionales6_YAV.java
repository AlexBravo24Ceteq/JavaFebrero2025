package com.condicionales;

import java.util.Scanner;

public class Condicionales6_YAV {

	public static void main(String[] args) {
		//6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		//Cuando se realiza la venta del producto, �sta 
		//es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
		//entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
		//es de tama�o 2.
		//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
		//tama�o 2.
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
		
		System.out.print("Introduce el tama�o de la uva 1 o 2: ");
		int tama�o;
		tama�o=input.nextInt();
		
		if (tipo=='A' && tama�o==1) {
			precio=precio+0.20;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tama�o de uva "+tama�o);
			System.out.println("Ganacia total "+total);
		}else if(tipo=='A' && tama�o==2) {
			precio=precio+0.30;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tama�o de uva "+tama�o);
			System.out.println("Ganacia total "+total);
		}else if(tipo=='B' && tama�o==1) {
			precio=precio-0.30;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tama�o de uva "+tama�o);
			System.out.println("Ganacia total "+total);
		}else if(tipo=='B' && tama�o==2) {
			precio=precio-0.50;
			total=precio*kilos;
			System.out.println("Kilos de uva "+kilos);
			System.out.println("Tipo de uva "+tipo);
			System.out.println("Tama�o de uva "+tama�o);
			System.out.println("Ganacia total "+total);
		}else {
			System.out.println("Error");
		}
		

	}

}
