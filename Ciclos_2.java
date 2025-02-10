package ciclos;

import java.util.Scanner;

public class Ciclos_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el numero que desea que se realice la trabla de multiplicar");
		int numero = input.nextInt(); 
		System.out.println("Introduce el numero hasta donde desea que se realice la trabla de multiplicar");
		int limite = input.nextInt(); 
		
		for (int i = 0; i < limite+ 1 ; i++) {
			System.out.println(numero + " x " +  i + "=" + numero * i);
			
		}
		
	}

}
