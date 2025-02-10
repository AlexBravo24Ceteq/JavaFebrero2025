package com.condicionales;

import java.util.Scanner;

public class Condicionales6_DSL {

	public static void main(String[] args) {
//		// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//		entrega en un embarque considerando lo siguiente: 
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//		es de tama�o 2. 
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//		tama�o 2. 
//		Precio inicial se recibe desde teclado
		
		Scanner input = new Scanner (System.in);
		
		  // Entrada de datos
        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = input.nextDouble();
        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = input.next().toUpperCase().charAt(0);
        System.out.print("Ingrese el tama�o de uva (1 o 2): ");
        int tamanoUva = input.nextInt();
        System.out.print("Ingrese la cantidad de kilos entregados: ");
        double kilos = input.nextDouble();

        // Determinar ajuste al precio
        double ajuste = 0;
         if (tipoUva == 'A') {
            ajuste = (tamanoUva == 1) ? 0.20 : 0.30;
        } else if (tipoUva == 'B') {
            ajuste = (tamanoUva == 1) ? -0.30 : -0.50;
        } else {
            System.out.println("Tipo de uva inv�lido.");
            return;
        }

        // C�lculo del precio final
        double precioFinal = precioInicial + ajuste;
        double totalAPagar = precioFinal * kilos;

        // Mostrar resultado
        System.out.printf("El productor recibir�: %.2f euros%n", totalAPagar);
    }
}