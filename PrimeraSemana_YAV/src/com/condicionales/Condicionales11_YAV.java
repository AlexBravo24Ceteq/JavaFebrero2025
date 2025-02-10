package com.condicionales;

import java.util.Scanner;

public class Condicionales11_YAV {

	public static void main(String[] args) {
		//11. Una compa��a de transporte internacional tiene servicio 
		//en algunos pa�ses de Am�rica del Norte, Am�rica 
		//Central, Am�rica del Sur, Europa y Asia. El costo por servicio
		//de transporte se basa en el peso del paquete y 
		//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		//ZONA UBICACI�N COSTO/KILOGRAMO
		//1 Am�rica del Norte -24,00 euros
		//2 Am�rica Central - 20,00 euros
		//3 Am�rica del Sur - 21,00 euros
		//4 Europa - 10,00 euros
		//5 Asia - 18,00 euros
		//Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
		//cuestiones de log�stica y seguridad.
		//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, 
		//en su caso, el rechazo de la entrega.

		System.out.println("============================");
		System.out.println("==PROBLEMA 11==");
		System.out.println("============================");
		System.out.println();
		
		System.out.println("1-Am�rica del Norte");
		System.out.println("2-Am�rica Central");
		System.out.println("3-Am�rica del Sur");
		System.out.println("4-Europa");
		System.out.println("5-Asia");
		int pago;
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce la ubicacion (1-5) : ");
		int viaje;
		viaje=input.nextInt();
		System.out.print("Introduzca el peso a transportar : ");
		int peso;
		peso=input.nextInt();
		
		if(viaje==1 && peso<=5) {
			pago=24*peso;
			System.out.println("El pago total de la entrega es de: "+pago);
	}else if(viaje==2 && peso<=5) {
		pago=20*peso;
		System.out.println("El pago total de la entrega es de: "+pago);
	}else if(viaje==3 && peso<=5) {
		pago=21*peso;
		System.out.println("El pago total de la entrega es de: "+pago);
	}else if (viaje==4 && peso<=5) {
		pago=10*peso;
		System.out.println("El pago total de la entrega es de: "+pago);
	}else if (viaje==5 && peso<=5) {
		pago=18*peso;
		System.out.println("El pago total de la entrega es de: "+pago);
	}else {
		System.out.println("Su entrega no se puede realizar");
	}

}
}
