package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		//Realizar escritura en un archivo de prueba
		
		String cadena = "\nHoy es 7 de febrero de 2025";
		
		//System.out.println(cadena);
		
		try {
			File archivo = new File("C:\\Users\\jimen\\OneDrive\\Escritorio\\archivo.txt");
			//Como vamos a escribir el contenido de un String en el archivo
			//necesitamos a la clase FileWriter
			FileWriter writer = new FileWriter(archivo, true);//el valor booleano true aqui
			//respeta el contenido original del archivo
			
			//Procedemos a escribir nuestro String en el documento
			writer.write(cadena);
			
			//Para guardar la escritura utilizamos
			writer.close();
		} catch (Exception e) { //Si algo falla se atrapa aqui en una excepcion
			//la excepcion se atrapa y ejecutamos lo que este aqui
			//dentro del bloque catch
			e.printStackTrace();
			System.out.println("No se loaliza el archivo");
		}

	}

}
