package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		
		//API Stream - Funcionalidad a partir de java 8 que nos va a permitir gestionar de una forma mas
		//rapida e imperativa la informacion que tengamos en nuestras colecciones de datos
		//Las colecciones se vuelven un flujo de datos a partir
		//del cual podemos solicitar la informacion que necesitemos
		
		//Ejemplo de el uso de Stream
		Stream<String> nombres = Stream.of("Carlos","Frida","Alex","Alberto")
				.filter(item-> item.contains("i"));
		
		//Una vez filtramos la informacion la llevo a una lista
        List<String> names = nombres.collect(Collectors.toList());
        
        //Mostrar los resultados en consola
        //System.out.println(names);
        
        
        
        //Declaramos una  lista para guardar nuestros objetos persona
        List<Persona> original = new ArrayList<Persona>();
        
        //Crear una lista para recolectar la informacion filtrada
        List<Persona> filtrada = new ArrayList<Persona>();
        
        //Añadir elemento a mi lista original
        original.add(new Persona("Jorge", "MASCULINO", 37));
        original.add(new Persona("Alicia", "FEMENINO", 30));
        original.add(new Persona("Manuel", "MASCULINO", 27));
        original.add(new Persona("Lupe", "FEMENINO", 40));
        original.add(new Persona("Jesus", "MASCULINO", 40));
        original.add(new Persona("Jose", "MASCULINO", 60));
        original.add(new Persona("Rafael", "MASCULINO", 50));
        original.add(new Persona("Rocio", "FEMENINO", 28));
        original.add(new Persona("Joel", "MASCULINO", 34));
        original.add(new Persona("Jane", "FEMENINO", 29));
        
        //imprimir la lista original en consola
        //System.out.println(original);
        
        //Recorrer nuestra lista para ver cada elemento con un ciclo for
//        for (int i = 0; i < original.size(); i++) {
//        	System.out.println(original.get(i));
//			}
        //Recuperar todos los elementos con el ciclo forEach
//        	for (Persona i:original) {
//				System.out.println(i);
//			}
        
        //forEach pero ahora atraves de nuestra lista
       // original.forEach(a->System.out.println(a));
        
        //Si filtraramos a los elemntos del genero masculino con un ciclo convencional
//        for ( Persona i:original) {
//        	if(i.getGenero().equals("MASCULINO")) {
//        		filtrada.add(i);
//        		System.out.println(i);
//        	}
//        }
     
        //Filtrar con el Api Stream a las personas del genero femenino
//        filtrada = original.stream()
//        		.filter(item -> item.getGenero().equals("FEMENINO"))//Se filtran primero
//        		.collect(Collectors.toList());//Se vuelven a coleccionar a la lista filtrada
//        
//        filtrada.forEach(a-> System.out.println(a));//Se manda a imprimir mediante Lambda la lista filtrada
//        filtrada.forEach(System.out::println);// Se filtra uno a uno
//        
        //Ordenar a las personas por edad ascendente
//        filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//        		.collect(Collectors.toList());
//        		
//        filtrada.forEach(System.out::println);
//        
        //Contar el numero de elementos de mi lista
//        System.out.println(original.stream().count());
//        
//        long conteo = original.stream().count();
//       System.out.println(conteo);//elemento de tipo long
       
       //Solicitar una varible booleana si algun elemento o todos los elemntos cumplen alguna condicion
       
//       boolean alguno = original.stream().anyMatch(a-> a.getEdad()<30);
//       
//       System.out.println(alguno);
        
        //Retornar un valor a una clase Optional
        //Optional es una clase que nos permite manejar valores nuleos,
        //en caso de que no se encuentren
        
        Optional<Persona> menorEdad = original.stream()
        		.min(Comparator.comparing(Persona::getEdad));
        System.out.println(menorEdad);
		}
	}

