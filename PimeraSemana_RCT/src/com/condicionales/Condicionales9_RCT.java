package com.condicionales;

import java.util.Scanner;

public class Condicionales9_RCT {

	public static void main(String[] args) {
		//.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
		//Si introducimos otro número nos da un error.
		System.out.println("Problema 9");
		System.out.println("DIA DE LA SEMANA");
		Scanner numero = new Scanner(System.in);
		int n;
		System.out.println("ingresa un numero");
		n = numero.nextInt();
		if (n == 1){
			System.out.println("El numero ingresado corresponde al dia Lunes");
		}
		else if(n == 2){
			System.out.println("El numero ingresado corresponde al dia Martes");
		}
		else if(n == 3){
			System.out.println("El numero ingresado corresponde al dia Miercoles");
		}
		else if(n == 4){
			System.out.println("El numero ingresado corresponde al dia Jueves");
		}
		else if(n == 5){
			System.out.println("El numero ingresado corresponde al dia Viernes");
		}
		else if (n == 6){
			System.out.println("El numero ingresado corresponde al dia Sabado");
		}
			else if (n == 7){
				System.out.println("El numero ingresado corresponde al dia Domingo");				
		}
		
			else {
				System.out.println("El numero no corresponde a algun dia de la semana");
			}

	}

}
