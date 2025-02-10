package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		//El siguiente metodo sirve para informacion en un archivo en especifico en una ruta en especifico.
		
		String cadena = ("\nHoy es 7 de Febrero de 2025;");
				
				try {
					File archivo = new File("C:\\Users\\david\\Desktop\\archivo.txt");
					//Como vamos a escribir el contenido de un String en el archivo
					//necesitamos a la clase FileWriter
					FileWriter writer = new FileWriter(archivo, true); //el valor booleano true aqui
					//respeta el contenido original del archvio
					
					//Procedemos a escribir nuestro String en el documento
					writer.write(cadena);
					
					//para guardar la escritura utilizamos
					writer.close();
					
				} catch(Exception e) {
					System.out.println("no se localiza el archivo");
				}

	}

}
