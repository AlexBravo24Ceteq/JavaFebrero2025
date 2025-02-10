package ciclos;

import java.util.Scanner;

public class Ciclos_10 {

	public static void main(String[] args) {
		
			int[] numeros=new int[20]; 
			Scanner input = new Scanner (System.in);

			for(int i=0; i<20 ; i++) {
				System.out.println("Introduce un numero");
				numeros[i]=input.nextInt();

			}
			
			
				for(int i=0; i<20; i++) {
					if(numeros[i]%2==0) {
						System.out.println(numeros[i]+ " es par");
					}
					else {
						System.out.println(numeros[i]+ " es impar");

					}
					if(numeros[i] <0) {
						System.out.println(numeros[i]+ " es negativo");

					}
					else if(numeros[i] >0) {
						System.out.println(numeros[i]+ " es positivo");

					}
					
					
				}
					
					
			
				

	}

}
