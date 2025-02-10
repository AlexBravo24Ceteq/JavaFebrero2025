package ciclos;

import java.util.Scanner;

public class Ciclos_12 {

	public static void main(String[] args) {

		double suma =0; 
		double n=0; 
		double promedio=0; 
		
		while (promedio <= 25) {
			Scanner input = new Scanner (System.in);
			System.out.println("Introduce la edad");
			int edad =input.nextInt();
			suma= suma + edad; 
			n++; 
			promedio = suma/n; 
			
		}
		System.out.println("El promedio de las edades es superior a 25");

	}
}
