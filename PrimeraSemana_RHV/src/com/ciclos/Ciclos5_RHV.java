package com.ciclos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ciclos5_RHV {

	public static void main(String[] args) {
//		Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
//		de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    System.out.printf("\r"+"%02d:%02d:%02d", hora, minuto, segundo);

                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
		
//		 while (true) {
//	            // Crear un objeto Date para obtener la hora actual
//	            Date ahora = new Date();
//	            
//	            // Crear un formato para mostrar solo hora:minuto:segundo
//	            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
//	            
//	            // Imprimir la hora actual en formato de reloj digital
//	            System.out.print("\r" + formatoHora.format(ahora));  // \r para sobrescribir la línea anterior
//	            
//	            try {
//	                Thread.sleep(1000);  
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	        }
		
		
//		 while (true) {
//	            // Crear un objeto Date para obtener la hora actual
//	            Date ahora = new Date();
//	            
//	            // Crear un formato para mostrar solo hora:minuto:segundo
//	            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
//	            
//	            // Imprimir la hora actual en formato de reloj digital
//	            System.out.print("\r" + formatoHora.format(ahora));  // \r para sobrescribir la línea anterior
//	            
//	            // Pausa de 1 segundo
//	            try {
//	                Thread.sleep(1000);  // Pausa de 1000 milisegundos (1 segundo)
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	        }
//		
//		
		
	}

}
