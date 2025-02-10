package ciclos;

import java.util.Scanner;

public class Ciclos_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce una palabra");
		String palabra= input.nextLine(); 
		int longitud= palabra.length()-1;
		int inicio=0;
		
		while(inicio < longitud) {
			if(palabra.charAt(inicio)== palabra.charAt(longitud)) {
				inicio ++;
				longitud++; 
				System.out.println("Es palindromo");

			}
			else {
				System.out.println("no es palindromo");
				break; 

			}
			

		}
		

	}

}
