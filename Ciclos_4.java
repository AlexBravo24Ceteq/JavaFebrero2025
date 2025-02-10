package ciclos;

import java.util.Scanner;

public class Ciclos_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce una palabra");
		String palabra= input.nextLine(); 
		System.out.println("Introduce la letra a buscar");
		char letra= input.next().charAt(0); 
		
		int tamaño = palabra.length();
		int incidencias= 0; 
		
		
			for(int i=0; i<tamaño; i++) {
			if(palabra.charAt(i)== letra) {
				incidencias++; 
				
			}
			
			
			else {

			}
			}
			System.out.println(incidencias);
			if(incidencias==0){
				System.out.println("Caracter no encontrado");

			}



	}

}
