package com.condicionales;

import java.util.Scanner;

public class Condicionales9_RHV {

	public static void main(String[] args) {
		
		
		
//		9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
//		introducimos otro número nos da un error.
//		
		 Scanner scanner = new Scanner(System.in);
	        int numero;
	        
	        while (true) {
	            System.out.print("Ingrese un número del 1 al 7 para conocer el día de la semana: ");
	            if (scanner.hasNextInt()) {
	                numero = scanner.nextInt();
	                break;
	            } else {
	                System.out.println("ERROR: entrada no válida. Debe ingresar un número entero.");
	                scanner.next(); 
	            }
	        }
	        scanner.close();
	        String dia;
	        switch (numero) {
	            case 1: dia = "Lunes"; break;
	            case 2: dia = "Martes"; break;
	            case 3: dia = "Miércoles"; break;
	            case 4: dia = "Jueves"; break;
	            case 5: dia = "Viernes"; break;
	            case 6: dia = "Sábado"; break;
	            case 7: dia = "Domingo"; break;
	            default: dia = "ERROR: número incorrecto";
	        }
	        
	        System.out.println(dia);
	}

}
