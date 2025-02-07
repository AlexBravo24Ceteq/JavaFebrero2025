package com.ciclos;

public class Ciclos5_JABR {

	public static void main(String[] args) {
		
		// 5. Simular el comportamiento de un reloj digital, 
		//imprimiendo la hora, minutos y segundos de 
		//un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		//Esto se puede resolver con ciclos for anidados
		
		for (int horas = 0; horas < 24; horas++) {
			for (int minutos = 0; minutos < 60; minutos++) {
				for (int segundos = 0; segundos < 60; segundos++) {
					//Este ciclo es el que manda a imprimir las lineas en consola
					//hasta que se cumpla la condicion del ciclo es como se incrementan los minutos
					// y hasta que se cumpla la condicion de los minutos es como se incrementan
					//las horas
					System.out.println(horas + " : " + minutos + " : " + segundos);
				}
			}
		}
		
		
		

	}

}
