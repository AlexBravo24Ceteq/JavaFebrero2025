package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Intentar realizar la lectura de nuestro archivo de prueba
		//con las clases File, FileReader y BufferedReader
		
		//Necesitamos un String donde recuperar la informacion 
		//que vamos a leer
		
		String linea;
		
		//En caso de que pudiera ocurrir alguna excepcion
		//es necesario utilizar una estructura llamada try & catch
		
		try {//se va intentar ejecutar el sig. bloque de codigo
			File archivo = new File("C:\\Users\\jimen\\OneDrive\\Escritorio\\archivo.txt");
			//Necesitamos a la clase FileReader para abrir nuestro archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			//Necesitamos a la clase BufferedReader para poder leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Leemos las lineas de nuestro archivo
			//Si queremos leer mas lineas, debemos poner esto dentro de un ciclo
			
			while((linea=buffer.readLine()) !=null) {
				//Y lo mandamos a imprimir en consola linea a linea
				System.out.println(linea);
			}
			
			
		}catch(Exception e) {//si algo falla se atrapa aqui en una Excepcion
			//la excepcion se atrapa y ejecutamos lo que este aqui
			//dentro del bloque catch
			System.out.println("No es posible localizar el archivo");
			
		}

	}

}
