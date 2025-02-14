package com.condicionales;

import java.util.Scanner;

public class Condicionales13_RHV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
//		y el resto se invierte en la bolsa.
//		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
//		niños y el resto se invierte en la bolsa.
//		La institución desea saber cuánto de dinero destinará a cada rubro anualmente
//		
		 Scanner scanner = new Scanner(System.in);

	        double donacion = -1;

	        while (donacion < 0) {
	            System.out.print("Ingrese el monto de la donación (un valor positivo): ");
	            
	            if (scanner.hasNextDouble()) {
	                donacion = scanner.nextDouble();
	                if (donacion < 0) {
	                    System.out.println("El monto debe ser un valor positivo.");
	                }
	            } else {
	                System.out.println("Por favor ingrese un número válido.");
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
	        System.out.println("Monto destinado al comedor de niños: $" + comedorNinos);
	        System.out.println("Monto destinado a la inversión en la bolsa: $" + inversionBolsa);

	        scanner.close();
	}

}
