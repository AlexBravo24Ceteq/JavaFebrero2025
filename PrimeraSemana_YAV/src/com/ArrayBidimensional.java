package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//Array bidimensinal pasa de ser un concto de una fila
		//a tener mas elementos en una "tabla"
		//Permitiendonos tener una capacidad mayor de almacenar elementos
		//los arrays de dos dimensiones son conocidos tambien como
		//"matrices"
		
		//Declarar un array de dos dimensiones para almacenar numeros enteros
		
		int[][]matriz = new int [3][3];//[filas][columnas]
		
		//Como almacemos valores en cada posicion de nuestro array bidimensional
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;           // [1][2][3]
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;           //[4][5][6] 
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;           //[7][8][9]
		
		//Ej. Si quiero utilizar un valor para imprimirlo en consola
		System.out.println(matriz[2][1]);
		
		//Otra forma de crear una matriz o array de dos dimensiones es con
		//los valores asignados desde un principio
		
		int[][] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//Ej. mandar a imprimir en consola todos los valores de mi array de dos dimensiones
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		
		//¿Como puedo tener un array que me permita almacenar tipos de dato int, String,
		//double, booleanos, etc.?
		
		Object objeto="Alex";
		Object objeto2=20000;
		
		Object [] objetos= {"Nombres",1000,3.1416,true,'$'};
		
		
		
		

	}

}
