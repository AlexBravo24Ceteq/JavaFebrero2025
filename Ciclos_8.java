package ciclos;

import java.util.Scanner;

public class Ciclos_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int numero1= input.nextInt(); 
		System.out.println("Introduce un numero");
		int numero2= input.nextInt(); 
		
		int menor= Math.min(numero1,numero2);
		int mayor= Math.max(numero1,numero2);

			for(int i=menor; i<mayor+1; i++) {
				System.out.println(i);

			
			}
			


	
	}

}
