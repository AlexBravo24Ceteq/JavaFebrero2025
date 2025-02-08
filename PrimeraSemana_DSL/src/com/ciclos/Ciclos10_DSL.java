package com.ciclos;

import java.util.Scanner;

public class Ciclos10_DSL {
public static void main(String[] args) {
	
	//Programa que lea 20 n�meros e indique si son positivos o negativos y pares o
	//impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares
	
	
	  Scanner scanner = new Scanner(System.in);
      int sumaPositivos = 0;
      int sumaImpares = 0;

      for (int i = 1; i <= 20; i++) {
          System.out.print("Ingrese el n�mero " + i + ": ");
          int numero = scanner.nextInt();

           // Determinar si es positivo o negativo
           if (numero >= 0) {
              System.out.println(numero + " es positivo.");
              sumaPositivos += numero;
          }  else {
              System.out.println(numero + " es negativo.");
          }

           // Determinar si es par o impar
           if (numero % 2 == 0) {
          System.out.println(numero + " es par.");
          }  else {
          System.out.println(numero + " es impar.");
              sumaImpares += numero;
          }
      }
          // Mostrar resultados
          System.out.println("\nSuma de n�meros positivos: " + sumaPositivos);
          System.out.println("Suma de n�meros impares: " + sumaImpares);
  }
}
