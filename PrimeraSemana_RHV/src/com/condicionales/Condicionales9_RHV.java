package com.condicionales;

import java.util.Scanner;

public class Condicionales9_RHV {

	public static void main(String[] args) {
		
		
		
//		9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
//		introducimos otro n�mero nos da un error.
//		
		 Scanner scanner = new Scanner(System.in);
	        int numero;
	        
	        while (true) {
	            System.out.print("Ingrese un n�mero del 1 al 7 para conocer el d�a de la semana: ");
	            if (scanner.hasNextInt()) {
	                numero = scanner.nextInt();
	                break;
	            } else {
	                System.out.println("ERROR: entrada no v�lida. Debe ingresar un n�mero entero.");
	                scanner.next(); 
	            }
	        }
	        scanner.close();
	        String dia;
	        switch (numero) {
	            case 1: dia = "Lunes"; break;
	            case 2: dia = "Martes"; break;
	            case 3: dia = "Mi�rcoles"; break;
	            case 4: dia = "Jueves"; break;
	            case 5: dia = "Viernes"; break;
	            case 6: dia = "S�bado"; break;
	            case 7: dia = "Domingo"; break;
	            default: dia = "ERROR: n�mero incorrecto";
	        }
	        
	        System.out.println(dia);
	}

}
