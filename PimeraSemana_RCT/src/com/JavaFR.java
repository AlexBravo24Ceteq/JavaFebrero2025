package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// intentar realizar la lectura de nuestro archivo de prueba con 
		//las clases file, filereader y bufferreadder
		String linea;
		
		//en caso de que pudiera ocurrir alguna excepcion
		//es necesario utilizar una estructura llamada try & catch
		
		try { //se va intentar ejecutar el sig bloque de codigo
			//necesitamos a la clase file para guardar la ruta de nuestro archivo
			File archivo = new File("C:\\Users\\rence\\Desktop\\archivo.txt");
			//necesitamos a la clase filereader para abrir nuestro archivo en modo lect
			FileReader fr = new FileReader(archivo);
			//Necesitamos la clase buffer para poder ver el contenido
			BufferedReader buffer = new BufferedReader(fr);
			
			//leemos las lineas de nuestro archivo
			//si queremos leer mas lineas debemos poner esto dentro de un ciclo
			
			while ((linea = buffer.readLine()) !=null) {
				
			//Y mandamos a imprimir en consola lo que se guardo en linea
			System.out.println(linea);
			}
			
	} catch (Exception e) { //si algo falla se atrapa aqui en una excepcion
		//la excepcion se atrapa y ejecutamos lo que este aqui
		//dentro del bloque catch
		System.out.println("No es posible localizar el Documento");
	}

	}
}

