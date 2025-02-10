package com;

public class MetodoString {

	public static void main(String[] args) {
		// Metodos de la clase string
		
		String fecha = "Hoy es 04 de Febrero de 2025";
		
		//.length() - nos devuelve el conteo de caracteres de nuestro Stingg
		System.out.println("Probando el metodo .length()");
		System.out.println(fecha.length());
		
		//ej. si tuviera la necesidad de guardar el conteo de caracteres para
		//su uso mas adelante lo podemos hacer de la siguiente manera
		
		int conteo=fecha.length(); //int conteo =28;
		
		//.charAt() - Nos devuelve el caracter que se encuentra en determinada 
		//pocision de nuestro String
		
		System.out.println("Probando el metodo .charAt()");
		
		System.out.println(fecha.charAt(4));
		
		//.substing - nos devuelve una subcadena a partir de la cadena original
		System.out.println("Probando el metodo .substring()");
		
		System.out.println(fecha.substring(4));//devuelve la cadena de texto
		//a partir del indice especificado
		
		System.out.println(fecha.substring(4, 10));
		
		//.toLowerCase() / toUppeCase - 
		//el primero convierte la cadena a minusculas y el segundo
		//la convierte a mayusculas
		System.out.println("Probando el metodo ,toLowerCase()");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase()");
		System.out.println(fecha.toUpperCase());
		
		//.equals() - compara dos objetos y verifica si son iguales 
		//en este caso compararemos 2 strings. Si son iguales, esto devuelve un valor true
		System.out.println("Probando el metodo .equals()");
        
		System.out.println(fecha.equals("Hoy es 04 de Febrero de 2025"));
		
	    //.equalsIgnoreCase() - devuelve un valor true si las cadenas son iguales en contenido
		//omitiendo el uso de mayus/minus
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("hoy es 04 de febrero de 2025"));
		
		//.contentEquals - devuelve true si hay una coincidencia de caracter o caracteres
		//en nuestro string en TODA la cadena
		System.out.println("Probando el metodo .contentEquals()");
		System.out.println(fecha.contentEquals("Hoy es 04 de Febrero de 2025"));
		
		//.contains - devuelve true si hay caracter o secuencia de ellos en el String
		System.out.println("Probando el metodo .contains()");
		System.out.println(fecha.contains("Feb"));
		
		//.replace() - remplaza una secuencia de caracteres o un caracter con otro
		System.out.println("Probando el metodo .replace()");
		System.out.println(fecha.replace("o","$"));
		System.out.println(fecha.replace("2025","2030"));
		
		//Guardo o intento guardar el caracter que esta en la posicion 10
		Character caracter=fecha.charAt(4);
		
		System.out.println(fecha.replace(caracter.toString(), "0"));

	}

}
