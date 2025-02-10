package com.arrays;

public class arrays5_RHV {

	public static void main(String[] args) {
		
//		Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
//		respectivos precios. Muestra en consola la lista de productos y sus precios.
//		Por lo menos 5 productos o artículos.

		
		String[] productos = {"Laptop", "Smartphone", "Teclado", "Mouse", "Monitor"};
        double[] precios = {1200.99, 699.49, 45.99, 25.75, 299.99};

        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);
        }
		
	}

}
