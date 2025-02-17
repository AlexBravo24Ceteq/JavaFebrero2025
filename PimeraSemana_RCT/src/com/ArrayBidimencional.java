package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		
		//ArrayBidimensional. Pasa de ser un concepto de una fila a
		//tener mas elementos en una tabla
		//permitiendonos tener una capacidad mayor de almacenar elementos
		//Los Arrays de 2 dimensiones son conocidos tambien matrices
		
		//Declarar un Array de dos dimenciones para almacenar numeros enteros
		
		int [][] matriz = new int [3][3]; //[filas] [columnas]
		
		//como almacenasmos valores en cada pocision en nuestro array bidimensional
		
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3; //[1][2][3]
		
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6; //[4][5][6]
		
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 9; //[7][8][9]
		
		//eje. si quiero utilizar un valor para imprimirlo en consola
		System.out.println(matriz[2][1]);
		
		//otra forma de crear un arry de 2 dimensiones es con los valores 
		//asignados desde un principio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//eje. mandar a imprimir en consola todos los valores de array de 2 dimensiones
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " ");
				
			}
			
		}
		
		//¿comco puedo trener un arry que me permita almacenar tipos de datos
		//Int, String, double , Boleanos etc?
		
		Object objeto = "Rene";
		Object objeto2 = 20020;
		
		Object [] objetos = {"Nombres", 1000, 3.1416, true, '$'};
		
		
		
		
		
		
		
		
				
	}

}
