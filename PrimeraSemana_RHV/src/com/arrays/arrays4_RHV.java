package com.arrays;

import java.util.Arrays;

public class arrays4_RHV {
	
	public static void main(String[] args) {
		
		
//		4. Dado un array de n�meros de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deber� tener los valores
//		{5,4,3,2,1}
		
		
        int[] numeros = {1, 2, 3, 4, 5,6,7};
        
        int[] invertido = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array invertido: " + Arrays.toString(invertido));
		
		
	}

}
