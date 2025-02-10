package com; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
	
	//Metodo main - punto de entrada para ejecutar una clase
	//o un bloque de codigo
	public static void main (String[] args) {
		
		//comentarios de una sola linea
		
		/*
		 *comentarios
		 *de
		 *multiples
		 *lineas
		 */
		
		//Tipos de datos en java
		//TIPOS DE DATOS PRIMITIVOS
		//NUMERICOS ENTEROS
		
		//Ej. de declarar una variable sin asignarle un valor
		
		byte numero;
		
		//posteriormente yo puedo guardar un numero en esa variable
		numero=120; //asignamos el numero 120 a la variable "numero"
		
		//Ej. declarar variables con su valor asignado desde un inicio
		byte b=-128; //1 byte de espacio en memoria (-128 a 127)
		short sh=32767; // 2 bytes de memoria (-32768 a 32767)
		int i1=2147483647; // 4 bytes de memoria (int es el dato mas utilizado)
		//para guardar valores numericos enteros
		long largo=2147483649L; // 8 bytes y necesita el sufijo L para almacenar 
		//datos o numeros mas alla de los int
		
		//TIPOS DE DATOS PRIMITIVOS
		//NUMERICOS EN COMA FLOTANTE - DECIMALES
		
		float pulgadas=2.54F; //4 bytes y necesita el sufijo de la letra F
		//Para guardar el valor
		double pi=3.1416; //8 bytes de tamaño en memoria y es el tipo de dato
		//mas utilizado para trabajar con decimales o numeros de coma flotante
		
		//TIPOS DE DATOS PRIMITIVOS
		//BOOLEANOS - admiten valores verdadero y falso
		//Caracter - guardan un caracter a la vez de valor ASCII
		
		boolean evalua=true; //son utiles cuando necesitemos evaluar expresiones 
		//o condiciones
		
		char caracter= '%'; //Solo admiten un caracter a la vez. Utilizan 2 byte de memoria
	
		
		//Tipos de dato referenciados
		//tipos de dato no primitivos
		//tipos de dato objeto
		
		//estos tipos de datos son mas complejos ya que se componen de
		// comportamientos y/o incluso un coonjunto de datos
		
		//cadenas de texto como la clase string 
		
		String nombre= "Yonatan Aguilar";
		
		//Arrays - conjunto de datos de un mismo tipo
		
		int[] conjunto;
		
		//Wrapper - Envoltorio. Que nos permiten darles comportamientos
		//a los tipos de datos primitivos
		
		Byte b1=127;
		Short sh1=1000;
		Integer i2=200000000;
		Long largo2= 2000000000000L;
		Boolean evalua2= true;
		Character letra= 'A';
		Float decimal= 1.2F;
		Double decimal2= 10.1;
		
		//con los tipos de dato primitivo solo podemos guardar o reasignar valores
		//estos no tienen comportamientos 
		numero=111;
		
		//con los tipos de dato Wrapper podemos acceder a diversos metodos
		//o comportamientos
		b1.toString();//ej. este metodo convierte el valor numericos guardado
		//a cadena de texto
		
		//Salida a nuestros datos en consola
		//Ej. imprimir en consola nuestro primer Hola Mundo
		System.out.println("Hola Mundo");
		
		//Podemos mandar a imprimir el contenido de nuestras variables
		//Ej. mandar a imprimir lo que se guardo en la variable "nombre"
		//una forma de escribir mas rapido esta linea es con los atajos sig:
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		
		System.out.println(nombre);
		
		//Directamente, aunque no se recomienda, puedo realizar operaciones
		//en las impresiones de consola
		System.out.println(100+300);
		
		//O podemos tener esos numeros guardados en otras variables
		//y mandar a imprimir el resultado
		int x=100;
		int y=300;
		System.out.println(x+y);
		
		//Si queremos mostrar cadenas de texto mas operaciones
		//entramos en algo que se llama concatenacion, es decir, solo une
		//todo como cadena de texto
		System.out.println("El resultado es: " +(x+y));

		
		
	}//cierre del metodo main

}//cierre de la clase
