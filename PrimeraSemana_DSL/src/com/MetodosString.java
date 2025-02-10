package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// MÉTODOS DE LA CLASE STRING
		
				String fecha = "Hoy es 04 de Febrero de 2025";
				
				//.length() - nos devuelve el conteo de caracteres de nuestro String
				System.out.println("Probando el método .length()");
				System.out.println(fecha.length());
				
				//Ej. si tuviera la necesidad de guardar el conteo de caracteres para
				//su uso más adelante lo podemos hacer de la sig. manera
				int conteo = fecha.length(); // int conteo = 28;
				
				//.charAt() - Nos devuelve el caracter que se encuentre en determinada
				//posicion de nuestro String
				System.out.println("Probando el método .charAt()");
				
				System.out.println(fecha.charAt(4));
				
				//.substring - nos devuelve una subcadena a partir de la cadena original
				System.out.println("Probando el método .substring()");
				
				System.out.println(fecha.substring(4)); //devuelve la cadena de texto
				//a partir del indice especificado
				
				System.out.println(fecha.substring(4, 10));
				
				//.toLowerCase() / toUpperCase - 
				//El primero convierte la cadena a minusculas y el segundo
				//la convierte a mayúsculas
				System.out.println("Probando el método .toLowerCase()");
				System.out.println(fecha.toLowerCase());
				
				System.out.println("Probando el método .toUpperCase()");
				System.out.println(fecha.toUpperCase());
				
				//.equals() - compara dos objetos y verifica si son iguales
				//En este caso compararemos 2 Strings. Si son iguales, esto devuelve un valor true
				
				System.out.println("Probando el método .equals()");
				
				System.out.println(fecha.equals("hoy es 04 de febrero de 2025"));
				
				//.equalsIgnoreCase() - devuelve un valor true si las cadenas son iguales en contenido
				//omitiendo el uso de mayus/minus
				System.out.println("Probando el método .equalsIgnoreCase()");
				System.out.println(fecha.equalsIgnoreCase("hoy es 04 de febrero de 2025"));
				
				//.contentEquals - devuelve true si hay una coincidencia de caracter o caracteres
				//en nuestro String en TODA la cadena
				System.out.println("Probando el método .contentEquals()");
				System.out.println(fecha.contentEquals("04"));
				
				//.contains - devuelve true si hay un caracter o secuencia de ellos en el String
				System.out.println("Probando el método .contains()");
				System.out.println(fecha.contains("4"));
				
				//.replace() - reemplaza una secuencia de caracteres o un caracter con otro
				System.out.println("Probando el método .replace()");
				System.out.println(fecha.replace("o", "$"));
				System.out.println(fecha.replace("2025", "2030"));
				
				//Guardo o intento guardar el caracter que esta en la posicion 10
				Character caracter = fecha.charAt(10);
				
				System.out.println(fecha.replace(caracter.toString(), "0"));

			}

		}