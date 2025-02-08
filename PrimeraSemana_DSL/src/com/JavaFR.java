package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		//Intentar realizar la lectura de nuestro archivo de prueba
		//con las clases file,fileReader y BufferedReader
		
		//Necesitamos un String donde recuperar la informacion 
		//que vamos a leeer
		
		String linea;
		
		//En caso de que pudiera ocurrir alguna excepcion es util o es necesario utilizar una estructura llamada try & catch
		
		try {// Se va intentar el siguiente bloque de codigo
			File archivo = new File("C:\\Users\\david\\Desktop\\archivo.txt");
			
			//Necesitamos a la clase FileReader para abrir nuestro archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			
			//Necesitamos la clase BufferedReader para poder leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Leemos las lineas de nuestro archivo
			//Si queremos leer mas lineas,debemos poner esto dentro de un ciclo
			while ((linea = buffer.readLine()) != null) {
			
			//Y lo mandamos a imprimir en consola
			System.out.println(linea);
			}
		} catch (Exception e) { //si algo falla se atrapa aqui en uan excepcion
			// La excepcion se atrapa y ejecutamos lo que este aqui
			//dentro del bloque catch
			//Quiero recuperar o poder ver el msj que lanza la excepcion
			
			e.printStackTrace(); //Esta linea vuelve a mostrar la excepcion en  consola.
			
			System.out.println("No es posible encontrar el archivo");
		}
		
		

	}

}
