package com.condicionales;

import java.util.Scanner;

public class Condicionales11_DSL {
 public static void main(String[] args) {
	
//	 Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
//	 Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//	 la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla: 
//	 ZONA UBICACIÓN 
//	 COSTO/KILOGRAMO 
//	 1 América del Norte 
//	 24,00 euros 
//	 2 América Central 
//	 20, 00 euros 
//	 3 América del Sur 
//	 21,00 euros 
//	 4 Europa 
//	 10,00 euros 
//	 5 Asia 
//	 18,00 euros 
//	 Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
//	 cuestiones de logística y seguridad. 
//	 Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
//	 de la entrega.
	 
	 Scanner scanner = new Scanner(System.in);
	System.out.println("1.- America del Norte");
	System.out.println("2.- America central");
	System.out.println("3.- America del sur");
	System.out.println("4.- Europa");
	System.out.println("5.-Asia");
	 
	 
	 System.out.print("Introduce la zona en la que deseas enviar el paquete (1-5): ");
     int ZonaUbi = scanner.nextInt();
     System.out.println("Introduce el peso del paquete no mayor a 5kg");
     double Peso = scanner.nextDouble();
     
     //Condiciones por cda numero existente del 1-5
      if(ZonaUbi == 1 && Peso <=5) {
    	 System.out.println("EL costo del envio a America del Norte es de: " + (Peso*24) + "EUROS");
     }else if (ZonaUbi == 2 && Peso <=5) {
    	 System.out.println("El costo del envio a America central es de: " + (Peso*20) + "EUROS");
     } else if (ZonaUbi == 3 && Peso <=5){
    	 System.out.println("El costo del envio a America del sur es de: " + (Peso*21) + "EUROS");
     } else if (ZonaUbi == 4 && Peso <=5) {
    		 System.out.println("El costo del envio a Europa es de: " + (Peso*10) + "EUROS");
    	 } else if (ZonaUbi == 5 && Peso <=5) {
    		 System.out.println("El costo del envio a Asia es de: " + (Peso*18) + "EUROS");
    	 } else {
    		 System.out.println("El pedido no se puede enviar ya que excede el peso recomendado");
       }
    }
 }