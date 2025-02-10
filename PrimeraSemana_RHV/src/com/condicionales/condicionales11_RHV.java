package com.condicionales;

import java.util.Scanner;

public class condicionales11_RHV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica
//		Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
//		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
//		ZONA UBICACI�N COSTO/KILOGRAMO
//		1 Am�rica del Norte 24,00 euros
//		2 Am�rica Central 20, 00 euros
//		3 Am�rica del Sur 21,00 euros
//		4 Europa 10,00 euros
//		5 Asia 18,00 euros
//		Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por
//		cuestiones de log�stica y seguridad.
//		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
//		de la entrega

		
		
        Scanner scanner = new Scanner(System.in);
        int zona;
        double peso, costo = 0;
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("ERROR: Entrada no v�lida. Debe ingresar un n�mero.");
            scanner.next();
        }
        peso = scanner.nextDouble();
        
        if (peso > 5) {
            System.out.println("El paquete excede el peso permitido y no puede ser transportado.");
        } else {
            System.out.println("Seleccione la zona de destino:");
            System.out.println("1. Am�rica del Norte - 24,00 euros/kg");
            System.out.println("2. Am�rica Central - 20,00 euros/kg");
            System.out.println("3. Am�rica del Sur - 21,00 euros/kg");
            System.out.println("4. Europa - 10,00 euros/kg");
            System.out.println("5. Asia - 18,00 euros/kg");
            
            do {
                System.out.print("Ingrese el n�mero de la zona (1-5): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("ERROR: Entrada no v�lida. Debe ingresar un n�mero entero.");
                    scanner.next();
                }
                zona = scanner.nextInt();
                
                if (zona < 1 || zona > 5) {
                    System.out.println("ERROR: Zona no v�lida. Int�ntelo nuevamente.");
                }
            } while (zona < 1 || zona > 5);
            
            switch (zona) {
                case 1: costo = 24.00 * peso; break;
                case 2: costo = 20.00 * peso; break;
                case 3: costo = 21.00 * peso; break;
                case 4: costo = 10.00 * peso; break;
                case 5: costo = 18.00 * peso; break;
            }
            
            System.out.println("El costo del env�o es: " + costo + " euros.");
        }
        
        scanner.close();
		
		
	}

}
