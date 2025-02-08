package com; //nombre del paquete

public class TiposDeDatos {//nombre de la clase

public static void main(String[] args) {
	
			
			// Comentarios de una sola linea
			
			/*
			 * Comentarios
			 * de
			 * multiples
			 * lineas
			 */
			
			//CTRL + S atajo para guardar cambios en la clase/código
			
			//TIPOS DE DATOS EN JAVA
			//TIPOS DE DATOS PRIMITIVOS
			//NUMÉRICOS ENTEROS
			
			//Ej. de declarar una variable sin asignarle un valor
			
			byte numero;
			
			//Posteriormente yo puedo guardar un número en esa variable
			numero = 120; //asignamos el numero 120 a la variable "numero"
			
			//Ej. declarar variables con su valor asignado desde un inicio
			
			byte b = -128; //1 byte de espacio en memoria (-128 a 127)
			short sh = 32767; // 2 bytes de memoria (-32768 a 32767)
			int i1 = 2147483647; //4 bytes de memoria (int es el dato más utilizado
			//para guardar valores numéricos enteros)
			long largo = 2147483649L; //8 BYTES y necesita el sufijo L para almacenar
			//datos o numeros más alla de los int
			
			//TIPOS DE DATOS PRIMITIVOS
			//NUMÉRICOS EN COMA FLOTANTE - DECIMALES
			
			float pulgadas = 2.54F; //4 bytes y necesita el sufijo de la letra F
			//para guardar el valor
			double pi = 3.1416; //8 bytes de tamaño en memoria y es el tipo de dato
			//más utilizado para trabar con decimales o numeros de coma flotante
			
			//TIPOS DE DATOS PRIMITIVOS
			//BOOLEANOS - admiten valores verdadero y falso
			//Caracter - guardan un caracter a la vez de valor ASCII
			
			boolean evalua = true; //son utiles cuando necesitemos evaluar expresiones
			//o condiciones
			
			char caracter = '#'; //Solo admiten un caracter a la vez. Utilizan 2 bytes
			
			//TIPOS DE DATO REFERENCIADOS
			//TIPOS DE DATO NO PRIMITIVOS
			//TIPOS DE DATO OBJETO
			
			//Estos tipos de dato son más complejos ya que se componen de 
			//comportamientos y/o incluso un conjunto de datos
			
			//Cadenas de texto, como la clase String
			
			String nombre = "Jorge Alejandro";
			
			//Arrays - conjunto de datos de un mismo tipo
			
			int [] conjunto;
			
			//Wrapper - Envoltorio. Que nos permiten darles comportamientos
			//a los tipos de dato primitivos
			
			Byte b1 = 127;
			Short sh1 = 1000;
			Integer i2 = 200000000;
			Long largo2 = 2000000000000L;
			Boolean evalua2 = true;
			Character letra = 'A';
			Float decimal = 1.2F;
			Double decimal2 = 10.1;
			
			//Con los tipos de dato primitivos solo podemos guardar o reasignar valores
			// estos no tienen comportamientos
			numero = 111;
			
			//Con los tipos de dato Wrapper podemos acceder a diversos métodos
			//o comportamientos
			b1.toString(); //ej. este método convierte el valor numéricos guardado
			//a cadena de texto
			
			
			//Salida a nuestros datos en consola
			//Ej. imprimir en consola nuestro primer Hola Mundo
			System.out.println("Hola mundo");
			
			//Podemos mandar a imprimir el contenido de nuestras variables
			//Ej. mandar a imprimir lo que se guardo en la variable "nombre"
			//Una forma de escribir más rápido esta linea es con los atajos sig:
			//syso + ctrl + espacio
			//sout + ctrl + espacio
			
			System.out.println(nombre);
			
			//Directamente, aunque no se recomienda, puedo realizar operaciones
			//en las impresiones de consola
			
			System.out.println(100+300);
			
			//O podemos tener esos numeros guardados en otras variables
			//y mandar a imprimir el resultado
			int x = 100;
			int y = 300;
			
			System.out.println(x+y);
			
			//Si queremos mostrar cadenas de texto más operaciones
			//Entramos en algo que se llama concatenacion, es decir, solo une
			//todo como cadena de texto
			
			System.out.println("El resultado es: " + (x + y));
			
			
			
			
			
			
			
		} //cierre del método main

	} //cierre de la clase

	
