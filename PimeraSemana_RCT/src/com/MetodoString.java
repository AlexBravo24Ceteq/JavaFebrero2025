package com;

public class MetodoString {

	public static void main(String[] args) {
		// METODOS DE CLASE STRING
		
		String fecha = "Hoy es 04 de Febrero de 2025";
		
		//.length() - nos devuelve el conteo de caracteres  de nuestro String
		System.out.println("pobando el metodo .length()");
		System.out.println(fecha.length());
		
		//Ej. si tubiera la necesidad de guardar el conteo de caracteres para 
		//su uso mas adelante los podemos hacer de la sig manera
		int conteo = fecha.length(); //int conteo = 28;
		
		//.charAt() - nos devuelve el caracter que se encuentre en determinada
		//posicion de nuestro String
		
		
		System.out.println("pobando el metodo .charAt()");
		
		System.out.println(fecha.charAt(4));
		
		
		//.substring - nos devuelve una cadena a partir de la cadena original
		System.out.println("Probando el metodo .substring()");
		
		System.out.println(fecha.substring(4));  //Devuelve la cadena de texto
		//a partir del indice especificado
		
		System.out.println(fecha.substring(4, 10));
		
		//.toLowerCase() /toUpperCase - 
		//El primero convierte la cadena a minusculas y el segundo
		//la convierte a mayusculas
		
		System.out.println("Probando el metodo .toLoweCase()");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase()");
		System.out.println(fecha.toUpperCase());
		

		//METODO .equals() compara dos objetos y verifica si son iguales
		//En esta caso compararemos 2 strings. Si son iguales esto devuelve un valor true
		
		System.out.println("probando en metodo .equals()");
		
		System.out.println(fecha.equals("Hoy es 04 de Febrero de 2025"));
		
		//.equalsIgnoreCase() - Devuelve un valor true si las cadenas son iguales en contenido
		//omitiendo el uso de Mayusculas/Minusculas
		
		System.out.println("probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("hoy es 04 de febrero de 2025"));
		
		//.contentEquals -Devuelve true si hay una conincidencia de caracter o caracteres 
		//en nuestro String en toda la cadena
		
		System.out.println("Probando el metodo .contentEquals ()");
		
		System.out.println(fecha.contentEquals ("04"));
		
		//.contains - Devuelve true si hay un caracter o secuencia de ellos en el string
		System.out.println("Pobando el metodo .contains()");
		System.out.println(fecha.contains("4"));
		
		//.replace() - reemplaza una secuencia de caracteres o un caracter con otro
		System.out.println("Probando el metodo .replace()");
		System.out.println(fecha.replace("o","$"));
		System.out.println(fecha.replace("2025","2040"));
		
		//Guardo o intento guardar el caracter que esta en la pocision 10
		Character caracter = fecha.charAt(10);
		
		System.out.println(fecha.replace(caracter.toString(),"0"));
		
		
		
		
		
	}

}
