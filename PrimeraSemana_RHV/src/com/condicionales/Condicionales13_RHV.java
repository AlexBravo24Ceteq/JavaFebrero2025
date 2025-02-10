package com.condicionales;

import java.util.Scanner;

public class Condicionales13_RHV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
//		y el resto se invierte en la bolsa.
//		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
//		ni�os y el resto se invierte en la bolsa.
//		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
//		
		 Scanner scanner = new Scanner(System.in);

	        double donacion = -1;

	        while (donacion < 0) {
	            System.out.print("Ingrese el monto de la donaci�n (un valor positivo): ");
	            
	            if (scanner.hasNextDouble()) {
	                donacion = scanner.nextDouble();
	                if (donacion < 0) {
	                    System.out.println("El monto debe ser un valor positivo.");
	                }
	            } else {
	                System.out.println("Por favor ingrese un n�mero v�lido.");
	                scanner.next();
	            }
	        }

	        double centroSalud;
	        double comedorNinos;
	        double inversionBolsa;

	        if (donacion >= 10000) {
	            centroSalud = donacion * 0.30;
	            comedorNinos = donacion * 0.50;
	            inversionBolsa = donacion - (centroSalud + comedorNinos);
	        } else {
	            centroSalud = donacion * 0.25;
	            comedorNinos = donacion * 0.60;
	            inversionBolsa = donacion - (centroSalud + comedorNinos); 
	        }

	        System.out.println("Monto destinado al centro de salud: $" + centroSalud);
	        System.out.println("Monto destinado al comedor de ni�os: $" + comedorNinos);
	        System.out.println("Monto destinado a la inversi�n en la bolsa: $" + inversionBolsa);

	        scanner.close();
	}

}
