package ciclos;

import java.util.Scanner;

public class Ciclos_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el ancho de la columna");
		int ancho =input.nextInt();
		System.out.println("Introduce el alto de la columna");
		int alto =input.nextInt();
		int[][] cuadrado=new int[alto][ancho]; 
		
		for (int i=0; i< alto; i ++) {
			for (int j=0; j< ancho; j++) {
				cuadrado[i][j]= i*j;
				System.out.println(cuadrado[i][j]+ "\t");
		}
			System.out.println();
		}
		

	}
}
