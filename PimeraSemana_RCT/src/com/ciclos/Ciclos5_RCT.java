package com.ciclos;

public class Ciclos5_RCT {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas  
		
		
		// esto se puede resolver con ciclo for anidados
		
		for (int horas = 0; horas < 24; horas++) {
			
			for (int minutos = 0; minutos < 60; minutos++) {
				
				for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + " : " + minutos + " : " + segundos);
					
					
				}
			}
			
		}

	}

}
