package com.ciclos;

import java.util.Scanner;

public class Ciclos8_YAV {

	public static void main(String[] args) {
		//8. Programa Java que lea dos números y 
		//muestre los números desde el menor hasta el mayor 
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 8==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int n;
		n= input.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int n2;
		n2= input.nextInt();
		
		int menor = Math.min(n, n2);//Los métodos Math.min() y Math.max() en Java pertenecen 
        int mayor = Math.max(n, n2);//a la clase Math y se utilizan para encontrar el menor y 
                                    //el mayor de dos valores respectivamente.
        
        System.out.println("Los números en secuencia desde el menor hasta el mayor son:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i + " ");
        }

	}

}
