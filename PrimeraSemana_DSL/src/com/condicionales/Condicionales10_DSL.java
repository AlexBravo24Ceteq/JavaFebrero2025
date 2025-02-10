package com.condicionales;

import java.util.Scanner;

public class Condicionales10_DSL {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		//mes correspondiente. 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un numero del 1 al 12 refente a los meses del año: ");
        int mes = scanner.nextInt();
        
         if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){//Condicion si el numero de mes es el
        	//siguiente entonces se cumple
            System.out.println("El mes seleccionado tiene 31 días");
          } else if (mes ==2){//Si es el numero dos se cumple esta otra
            System.out.println("Febrero tiene 28 días");
          } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){//sino es ninguno de los anteriores entonces puede ser alguno
        	  //de los siguientes numeros
            System.out.println("El mes seleccionado tiene 30 días");
          } else {
        	  //En dado caso que no se ingrese del 1-12 que se ingrese algun otro marcaria error
            System.out.println("Error, el mes debe estar entre 1-12.");
          }
      }
 }