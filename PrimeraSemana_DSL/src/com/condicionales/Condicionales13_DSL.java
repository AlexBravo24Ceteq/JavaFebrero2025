package com.condicionales;

import java.util.Scanner;

public class Condicionales13_DSL {

	public static void main(String[] args) {
//		//13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente: 
//			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//			y el resto se invierte en la bolsa. 
//			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			ni�os y el resto se invierte en la bolsa. 
//			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

		
		Scanner scanner = new Scanner(System.in);

        // Solicitar el monto de la donaci�n
        System.out.print("Ingrese el monto de la donaci�n: ");
        double donacion = scanner.nextDouble();

        // Variables para almacenar los montos de cada rubro
        double centroSalud, comedorNinos, inversionBolsa;

        // Calcular la distribuci�n seg�n la cantidad donada
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
        System.out.println("\nDistribuci�n de la donaci�n:");
        System.out.println("Centro de Salud: $" + centroSalud);
        System.out.println("Comedor de Ni�os: $" + comedorNinos);
        System.out.println("Inversi�n en Bolsa: $" + inversionBolsa);
    }
}