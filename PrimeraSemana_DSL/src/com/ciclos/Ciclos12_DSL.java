package com.ciclos;

import java.util.Scanner;

public class Ciclos12_DSL {

	public static void main(String[] args) {
		//Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
		//cuando el promedio de las edades sea superior a 25.
		
		    //Se inicializan las variables en 0 para poder ocuparlas mas adelante
		    Scanner scanner = new Scanner(System.in);
	        int sumaEdades = 0, cantidad = 0;
	        double promedio = 0;

	        System.out.println("Introduce edades (el programa finaliza cuando el promedio supere 25):");
             
	        //Ciclo While para poder terminar el programa cuando el promedio se mayor que 25
	         while (promedio <= 25) { //Condicion si el promedio es mayor igual a 25 
	            System.out.print("Edad: ");
	            int edad = scanner.nextInt();//Almacena las edades que se van ingresando
	            sumaEdades += edad;
	            cantidad++;
	            promedio = (double) sumaEdades / cantidad;//Saca el promedio de las sumas de todas las edades entre la cantidad
	            //de datos ingresados.
	        }
            
	         //Nos muestra el promedio de edades
	        System.out.println("El promedio de las edades es: " + promedio);
	        System.out.println("Programa finalizado.");
	    }
	}

