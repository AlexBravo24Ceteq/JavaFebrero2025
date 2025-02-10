package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//ArrayBidimensional pasa de sser un concepto de una fila
		// a tener mas elementos en una tabla
		//Permitiendonos tener una capacidad mayor de alamacenar elementos
		//Los arrays de dos dimensiones son conocidos tambien como "Matrices
		
		//Declarar un array de dos domensiones para alamacenar numero enteros
		 int [][] matriz = new int [3][3]; //[filas] [Columnas]
		 
		 //Como alamacenaremos valores en cada posicion de nuestro array bidimensional
		 
		 matriz[0][0] = 1;
		 matriz[0][1] = 2;
		 matriz[0][2] = 3; //[1] [2] [3] graficamente quedarian asi
		 
		 matriz[1][0] = 4;
		 matriz[1][1] = 5;
		 matriz[1][2] = 6; //[4] [5] [6] graficamente quedarian asi
		 
		 matriz[2][0] = 7;
		 matriz[2][1] = 8;
		 matriz[2][2] = 9; //[7] [8] [9] graficamente quedarian asi
		 
		 
		 
		
		//Si quiero utilizar unvalor para imrpimirlo en consola
		
		System.out.println(matriz[2][1]);
		
		// otra forma de crear una matriz o array de dos dimensiones es con 
		//los valores asignadors desde un principio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Ej. Mandar a imprimir rn consola todos los valores de mi array de dos dimensiones
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " ");
				}
			
		}
		
		//¿Como puedo tener un array que me permita almacenar tipos de datos int, String,
		//Double,booleanos, etc?
		
		//Tipo de clase OBJECT
		
		Object objeto = "Alex";
		Object objeto2 = 20000;
		
		Object [] Objetos = {" Nombre", 1000, 3.1416, true, '$'};

		
	}

}
