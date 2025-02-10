package com.condicionales;

import java.util.Scanner;

public class Condicionales6_DSL {

	public static void main(String[] args) {
//		// La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//		entrega en un embarque considerando lo siguiente: 
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//		es de tamaño 2. 
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//		tamaño 2. 
//		Precio inicial se recibe desde teclado
		
		Scanner input = new Scanner (System.in);
		
		  // Entrada de datos
        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = input.nextDouble();
        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = input.next().toUpperCase().charAt(0);
        System.out.print("Ingrese el tamaño de uva (1 o 2): ");
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
            System.out.println("Tipo de uva inválido.");
            return;
        }

        // Cálculo del precio final
        double precioFinal = precioInicial + ajuste;
        double totalAPagar = precioFinal * kilos;

        // Mostrar resultado
        System.out.printf("El productor recibirá: %.2f euros%n", totalAPagar);
    }
}