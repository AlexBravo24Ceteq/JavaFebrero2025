package com.ciclos;

public class Ciclos5_DSL {

	public static void main(String[] args) {
		//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas  

		//Esto se puede puede resolver con ciclos for anidados
		
		for (int horas = 0; horas < 24; horas++) {
			for (int min = 0; min < 60; min++) {
				for (int seg = 0; seg < 60; seg++) {
					//Este ciclo es el que manda a imprimir las lineas en consecuencia
					//hasta que se cumpla la condicio del ciclo es como se incrementa
					//y hasta que se cumple la condicion de los min es como se incrementan las horas
					System.out.println(horas + " : " + min+ " : " + seg);	
				}
			}
		}
	}
}
