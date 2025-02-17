package com.ciclos;

import java.util.Scanner;

public class Ciclos9_RCT {

	public static void main(String[] args) {
		//  Programa Java que lea dos números y muestre los números pares entre ellos 
		
        System.out.println("Ciclos Problema 9");
        System.out.println("******************************************************************");
		System.out.println("MOSTRAR LOS NUMEROS PARES DE DOS NUMEROS INGRESADOS POR EL USUARIO");
		System.out.println("******************************************************************");

		Scanner scanner = new Scanner(System.in);
	    int numero1;
	    int numero2;
	    int minimo;
	    int maximo;
	    // se introducen datos por el teclado
	    System.out.print("Introduce el primer número: ");
	    numero1 = scanner.nextInt();
	    System.out.print("Introduce el segundo número: ");
	    numero2 = scanner.nextInt();
	    
	    // Condicion de los valores  en mayor y menor
	    if (numero1 < numero2) {
	      minimo = numero1;
	      maximo = numero2;
	    } else {
	      minimo = numero2;
	      maximo = numero1;
	    }
	    // Realización del ciclo para hacer cálculos y mostrar en pantalla
	    for (int i=minimo+1; i < maximo; i++){
	      if (i%2==0){
	        System.out.println(i); 
	      }
	    }

	}

}
