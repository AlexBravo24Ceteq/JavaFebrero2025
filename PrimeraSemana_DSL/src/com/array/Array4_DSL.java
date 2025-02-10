package com.array;

public class Array4_DSL {

	public static void main(String[] args) {
//		//Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deberá tener los valores
//		{5,4,3,2,1}.

		// Array original
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        
        // Array para guardar los valores invertidos
        int[] arrayInvertido = new int[arrayOriginal.length];
        
        // Recorremos el array original desde el final y lo almacenamos en el array invertido
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        
        // Imprimir el array invertido
        System.out.print("Array invertido: ");
         for (int i : arrayInvertido) {
        System.out.print(i + " ");
        }
    }
}

