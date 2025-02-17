package com;//Nombre del paquete

public class TiposDeDatos { //Nombre de la clase

	//De todo main ctrl+espacio
	public static void main(String[] args) {
		
		/*
		 * Cometarios
		 * De multiples
		 * Lineas
		 */
		//Control +S guardar cambios en Java
		//Tipos de datos de Java
		//TIPO DE DATOS PRIMITIVOS
		//NUMERICOS ESTEROS
		
		//Ejemplo de declarar una variable sin asignarle un valor
		
		byte numero;//creando espacio en memoria porteriormente puedo guardar un numero en esa variable
		numero = 120; //asignamos el numero 120 a variable "numero"
		
		// Declarar variable desde el inicio
		
		byte b = -128; //1 byte de espacio en memoria (-128 a 127)
		short sh = 32767; //2 byte de memoria (-32768 a 32767)
		int i1 = 2147483647; //4 byte de memoria (int es el dato mas utilizado 
		//(para guardar valores numericos enteros)
		long largo = 2147483649L; //8 byte y necesita sufijo L para almacenar
		//datos o numericos mas alla de los int
		
		//TIPOS DE DATOS PRIMITIVOS
		//NUMEROS EN COMA FLOTANTE - DECIMALES
		
		float pulgadas = 2.54F; // 4 bytes a igual que long nececita el sufijo de la letra F
		//para guardar el valor
		double pi = 3.1416; // 8 bytes de tamaño en memoria y es el tipo de dato
		//mas utilizado para trabajar  con decimales o numeros de coma flotante
		
		//TIPOS DE DATOS PRIMITIVOS
		//BOLEANOS - Admiten valores verdadero y falso
		//caracter - guardan un caracter a la vez de valor ASCII
		
		boolean evalua = true; //son utiles cuando necesitemos evaluar expresiones 
		//o condicionales
		
		char caracter = '#'; //solo admiten un caracter a la vez. utilizan 2 bytes
		
		//TIPOS DE DATOS REFERENCIADOS
		//TIPOS DE DATO NO PRIMITIVOS
		//TIPOS DE DATO OBJETO
		
		//Estos tipos de datos son mas complejos ya que se componen de
		//comportamientos y/o incluso un conjunto de datos
		
		//Cadenas de texto, como la clase string
		
		String nombre = "Rene Centeno";
		
		//Arrays - conjunto de datos de un mismo tipo
		
		int [] conjunto;
		
		//Wrapper - Envoltorio. que nos permiten darles comportamientos
		//a los tipos de datos primitivos
		
		Byte b1 =127;
		Integer i2 = 200000000;
		short sh1 = 1000;
		Long largo2 = 2000000000000L;
		Boolean evalua2 = true;
		Character letra = 'A';
		Float decimal = 1.2F;
		Double decimal2 = 10.1;
		
		//Con  los tipos de datos primitivos solo podaemos guardar o resignar valores
		//estos no tienen comportamientos
		
		numero = 111;
		
		//con los tipos de dato wrapper podemos acceder a diversos metodos
		//o comportamientos
		b1.toString(); //Eje. este metodo comvierte el valor numerico guardado
		//a cadena de texto
		
		
		//salida a nuestros datos en cosola
		//Eje.imprimir en consola nuestro primer hola mundo
		System.out.println("hola mundo");
		
		//podemos mandar a imprimir el contenido de nuestras variables
		//eje. mandar a imprimir lo que se guardo en la variable nombre
		//una forma de escribir mas rapido esta linea es con los atajos sig
		//syso + ctrl + espacio
		//o sout +ctrl +espacio
		
		System.out.println(nombre);
		
		//Directamente aunque no se recomienda, puedo realizar operaciones
		//en las impresiones de consola
		
		System.out.println(100+300);
		
		//O podemos tener esos numeros guardados en otras variables
		//y mandar a imnprimir el resultado
		int x = 100;
		int y = 300;
		
		System.out.println(x+y);
		
		//si queremos mostras cadenas de texto mas operaciones
		//entramos a algo que se llama concatenacion, es decir, solo une
		//todo como cadena de texto
		
		System.out.println("El resultado es:"  + (x + y) );
		
		
		
		
	
		
	}
}
