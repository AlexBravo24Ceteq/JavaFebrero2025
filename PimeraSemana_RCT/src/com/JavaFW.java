package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// en esta clase vamos a realizar escritura en un archivo de prueba
		
		String cadena = "\nHoy es 7 de Febrero de 2025";
		
		//System.out.println(cadena);
		
		try {
			File archivo = new File("C:\\Users\\rence\\Desktop\\archivo.txt");
			//como vamos a escribir el contenido de un strig en el archivo necesitamos
			//la clase Filewriter
			FileWriter writer = new FileWriter(archivo, true);//el valor booleano true
			//aqui respeta el contenido original del archivo
			
			//procedemos a escribir nuestro string en el documento
			writer.write(cadena);
			
			//para guardar la escritura utilizamos
			writer.close();
			
		} catch (Exception e) {
			// si quiero recuperar o podewr ver el msj que lanza la excepcion
			e.printStackTrace(); //esta linea devuelve a mostrar la excepcion en consola
			
			System.out.println("No se localiza el archivo");
		}

	}

}
