package com;

public class Arrays {

	public static void main(String[] args) {
		//Los arrays tambien son conocidos como ventores son una estructura de elementos de un tipo de dsto en comun
		//se declaran con un tamañano inicial,una vez declarado su tamaño estos no pueden crecer en tiempo de ejecuacion
		
		//Vamos a declarar un arrays para contener 5 num enteros
		
		int [] numeros = new int [5];
		
		//Como guardar valores en cada posicion del array
		
		numeros [0] = 40;
		numeros [1] = 100;
		numeros [2] = 1000;
		numeros [3] = 50;
		numeros [4]= 19;
		
		//Podemos hacer uso de los elementos de nuestro array mandadolos su ultima posicion
		
		//ej. mandar a imprimir en consola el nunmero contenido en la posicion 2
		
		System.out.println(numeros[2]);
		
		//Ej2. Puedo utilizarlos para realizar alguna operacion
		
		System.out.println(numeros[4]+ numeros[3]);
		
		//Que pasa si mando a utilizar una posicion que no existe
		//System.out.println(numeros[5]);
		
		//Como puedo andar a imprimir todas las posiciones del array
		
		System.out.println("Mandando a imprimir todas las posiciones del array");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
			//Otra forma de declarar un array ya con sus elementos asignados
			
			int[] numeros2 = {11,12,13,14,15,16};
			
			String[] nombres = {"David","Ricardo","Ambar","Cristopher"};
			
		}
		

	}

}
