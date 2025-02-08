package com.condicionales;

import java.util.Scanner;

public class Condicionales13_DSL {

	public static void main(String[] args) {
//		//13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente: 
//			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//			y el resto se invierte en la bolsa. 
//			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			niños y el resto se invierte en la bolsa. 
//			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

		
		Scanner scanner = new Scanner(System.in);

        // Solicitar el monto de la donación
        System.out.print("Ingrese el monto de la donación: ");
        double donacion = scanner.nextDouble();

        // Variables para almacenar los montos de cada rubro
        double centroSalud, comedorNinos, inversionBolsa;

        // Calcular la distribución según la cantidad donada
         if (donacion >= 10000) {
            centroSalud = donacion * 0.30;
            comedorNinos = donacion * 0.50;
        } else {
            centroSalud = donacion * 0.25;
            comedorNinos = donacion * 0.60;
        }

        // Lo que queda se invierte en la bolsa
        inversionBolsa = donacion - (centroSalud + comedorNinos);

        // Mostrar resultados
        System.out.println("\nDistribución de la donación:");
        System.out.println("Centro de Salud: $" + centroSalud);
        System.out.println("Comedor de Niños: $" + comedorNinos);
        System.out.println("Inversión en Bolsa: $" + inversionBolsa);
    }
}