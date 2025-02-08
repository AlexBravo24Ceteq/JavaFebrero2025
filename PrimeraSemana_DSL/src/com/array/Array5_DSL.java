package com.array;

public class Array5_DSL {

	public static void main(String[] args) {
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos.

		// Array de productos
        String[] productos = {"Laptop", "Smartphone", "Cámara", "Auriculares", "Reloj Inteligente"};
        
        // Array de precios correspondientes a los productos
        double[] precios = {899.99, 499.99, 350.50, 99.99, 199.99};
        
        // Mostrar los productos y sus precios
        System.out.println("Lista de Productos y Precios:");
         for (int i = 0; i < productos.length; i++) {
        System.out.println("Producto: " + productos[i] + " | Precio: $" + precios[i]);
        }
    }
}
