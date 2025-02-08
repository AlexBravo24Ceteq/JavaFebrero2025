package com.condicionales;

import java.util.Scanner;

public class Condicionales5_DSL {

public static void main(String[] args) {
	//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
	//parámetros: edad, nota y sexo. 
	//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
	//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
	//* Otros casos -> NO ACEPTADA
	
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Introduce la nota:");
    int n = input.nextInt();
    System.out.println("Introduce tu edad:");
    int e = input.nextInt();
    
    System.out.println("Introduce el sexo (M/F):");
    String s = input.next();
	
     if (n == 5 && e == 18) { 
        if (s.equals("M")) {
            System.out.println("POSIBLE");
        } else if (s.equals("F")) {
            System.out.println("ACEPTADA");
    } else {
        System.out.println("NO ACEPTADA");
   }
  }
 }
}

