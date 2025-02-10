package com;

public class Arrays {

	public static void main(String[] args) {
		//Los arrays tambien son conocidos como arreglos o vectores
		//Son una estructura de elementos de un tipo de dato en comun
		//Se declaran cun un tamaño inicial y una vez declarando su tamaño
		//estos no se pueden cambiar
		
		//Ej. declarar un array para contener 5 numeros enteros 
		
		int[] numeros = new int[6];
		
		//como guardar valores en cada posicion del array
		
		numeros[0]=40;
		numeros[1]=100;
		numeros[2]=1000;
		numeros[3]=50;
		numeros[4]=19;
		numeros[5]=1;
		//Podemos hacer uso de nuestros elementos de nuestro array mandandolos a llamar 
		//por su pocision
		
		//Ej. mandar a imprimir en consola para realizar alguna operacion
		System.out.println(numeros[2]);
		
		//Ej2. Puedo utilizarlos para realizar alguna operacion
		System.out.println(numeros[4]+numeros[3]);
		
		//que pasa si mando a utilizar una posicion que no existe
		System.out.println(numeros[5]);
		
		//como puedo mandar a imprimir todas las pocisiones
		System.out.println("Mandando a imprimir todas las posiciones de mi Array con un for");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//Otra forma de declarar un array ya con sus elementos asignados
		
		int [] numero2= {11,12,13,14,15,16};
		String[]nombres= {"David","Ricardo","Ambar","Cristopher"};

	}

}
