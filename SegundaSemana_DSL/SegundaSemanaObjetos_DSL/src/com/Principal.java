package com;

public class Principal {

	public static void main(String[] args) {
		//En la POO solo debe existir una clase con el metodo main
		//la cual se encargara de ejecutar todo el proyecto

		
		//Con el metodo contructor vacio declarado
		//ya puedo crear objetos persona
		
		Persona persona1 = new Persona();
		
		//Ej. de asignar valores a nuestra persona1
		
		//persona1.nombre="Juan";//Estamos guardando el nombre de juan en el objeto persona1
        //Probar una persona con sus atributo iniciados con el constructor con todos los parametros
		
		Persona persona2 = new Persona("Juan","Masculino", "O+", 1.75,78.5);
		
		//Vamosa probar como funciona el metodo get
		//Recuerden que un metodo get nos devuelve el tipo de dato o valor
		//Guardado en un objeto
		//Ej.recuperar el nombre de mi objeto persona2
		
		System.out.println(persona2.getNombre());
		
		//O si quiero guardarlo en un String para su uso posterior lo puedo hacer
		//String nombrePersona2 =persona2.getNombre();
		
		//Probando los metodos SET nos van a permitir establecer valores en 
		//los atributos privados de un objeto
		persona1.setNombre("Jose");
		
		//Ahora puedo recuperar el nombre de persona1 con un get
		System.out.println(persona1.getNombre());
		
		//Vamos a ver que ocurre si quiero mandar a imprimir en consola a persona2
		System.out.println(persona2);
	
		//Clase tenis
	    Tenis tenis1 = new Tenis();
	    Tenis tenis2 = new Tenis("Deportivo", "Nike", 1500);
	
	    tenis1.setTipo("Correr");
	
	    System.out.println(tenis1);
        System.out.println(tenis2);
	
	    //Clase Carros
	    Carros carro1 = new Carros();
	    Carros carro2 = new Carros("Chevrolet", "Aveo", "Gris", 150000);
	
	    carro1.setMarca("Honda");
	    carro1.setPrecio(250000);
	
	    System.out.println(carro1);
	    System.out.println(carro2);
	
	    //Clase Motos
	    Motos moto1 = new Motos();
	    Motos moto2 = new Motos("Italika 225cc", "Verde", 35000);
	    
	    moto1.setModelo("Kawasaki");
	    moto1.setColor("Negro");
	    
	    System.out.println(moto1);
	    System.out.println(moto2);
	    
	    //Clase Computadoras
	    Computadoras compu1 = new Computadoras();
	    Computadoras compu2 = new Computadoras("Lenovo 510","500gb","12gb", 23000);
	    
	    compu1.setModelo("HP Pavilion 320"); 
	    compu1.setPrecio(25000);
	    
	    System.out.println(compu1);
	    System.out.println(compu2);
	    
	    //Clase Comsolas
	    Consolas consol1 = new Consolas();
	    Consolas consol2 = new Consolas("Xbox", "Series x", "1TB", 11000);
	    
	    consol1.setMarca("Sony");
	    consol1.setPrecio(15000);
	    
	    System.out.println(consol1);
	    System.out.println(consol2);
	    
	    Celular iPhone = new Celular();
	    Celular samsung = new Celular("Samsung", "s25 ultra", "Negro");
	    
	    iPhone.setModelo("iPhone 15");
	    
	    System.out.println(iPhone);
	    System.out.println(samsung);
	     
	    //Si quiero actualizar el precio de los celulares, lo puedo hacer,pero se actulizara
	    //para todos
	    //iPhone.setPrecio(19000);//Lo correcto es no llamarlo a traves del objeto
	    //Celular.setPrecio(19000);
	    
	    System.out.println(iPhone);
	    System.out.println(samsung);
	    
	}
}



