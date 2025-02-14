package com.ciclos;

import java.util.Scanner;

public class Ciclos9_YAV {

	public static void main(String[] args) {
		//9. Programa Java que lea dos números 
		//y muestre los números pares entre ellos
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 9==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int n;
		n= input.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int n2;
		n2= input.nextInt();
		
		int menor = Math.min(n, n2);
	    int mayor = Math.max(n, n2);
		
		System.out.println("Números pares entre " + menor + " y " + mayor + ":");
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) { // Verifica si el número es par
                System.out.println(i + " ");
            }
        }

	}

}
