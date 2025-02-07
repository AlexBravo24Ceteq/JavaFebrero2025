package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Los arrays también son conocidos como arreglos o vectores
		//Son una estructura de elementos de un tipo de dato en común
		//Se declaran con un tamaño inicial y una vez declarado su tamaño
		//estos no pueden crecer en tiempo de ejecución
		
		//Ej. declarar un array para contener 5 numeros enteros
		
		int [] numeros = new int [6];
		
		//Como guardar valores en cada posición del array
		
		numeros[0] = 40;
		numeros[1] = 100;
		numeros[2] = 1000;
		numeros[3] = 50;
		numeros[4] = 19;
		numeros[5] = 1;
		
		//Podemos hacer uso de los elementos de nuestro array mandandolos a llamar
		//por su posicion
		
		//Ej. Mandar a imprimir en consola el numero contenido en la posicion 2
		System.out.println(numeros[2]);
		
		//Ej2. Puedo utilizarlos para realizar alguna operacion
		System.out.println(numeros[4]+numeros[3]);
		
		//Que pasa si mando a utilizar una posicion que no existe
		System.out.println(numeros[5]);
		
		//Como puedo mandar a imprimir todas las posiciones del array
		System.out.println("Mandando a imprimir todas las posiciones de mi Array con un for");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//Otra forma de declarar un array ya con sus elementos asignados
		
		int [] numeros2 = {11,12,13,14,15,16};
		
		String [] nombres = {"David", "Ricardo", "Ambar", "Christopher"};
		
	}

}
