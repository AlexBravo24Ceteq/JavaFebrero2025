package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	
	public static void main(String[] args) {
		
		// Realizar escritura en un archivo de prueba
		
		String cadena = "\nHoy es 7 de Febrero de 2025";
		
		//System.out.println(cadena);
		
		try {
			File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\archivo.txt");
			//Como vamos a escribir el contenido de un String en el archivo
			//necesitamos a la clase FileWriter
			FileWriter writer = new FileWriter(archivo, true); //el valor booleano true aqui
			//respeta el contenido original del archivo
			
			//Procedemos a escribir nuestro String en el documento
			writer.write(cadena);
			
			//Para guardar la escritura utilizamos
			writer.close();
			
		} catch (Exception e) {
			System.out.println("No se localiza el archivo");
		}

	}

}
