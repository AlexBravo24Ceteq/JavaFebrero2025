package com;

public class Principal {

	public static void main(String[] args) {
		
		//En la POO solo debe existir una clase con el metodo main
        //la cual se encargara de ejecuatr todo el proyecto
		
		//Con el metodo contructor vacio declarado
		//ya puedo crear objetos persona
		Persona persona1= new Persona();
		
		//Ej. de asiganr valores a nuestra persona 1
		//persona1.nombre="Juan";//Estamos guardando el nombre de "Juan" en el objeto 
		//persona1
		
		//Probar crear una persona con sus atributos iniciados con el cnstructor
		//con los parametros
		Persona persona2 = new Persona("Juan", "Masculino","O+", 1.75, 78.5);
		
		//Vamos a probar como funciona un metodo get
		//Recuerden que un metodo get nos devuelve el tipo de dato o valor
		//guardado en un objeto
		//Ej. recuperar el nombre de mi objeto
		
		System.out.println(persona2.getNombre());
		
		//O si quiero guardarlo en un String para su uso posterior lo puedo hacer
		String nombrePersona2 = persona2.getGenero();
		
		//Probando los metodos Set. Nos va a permitir establecer valores en
		//los atributos privados de un objeto
		persona1.setNombre("Jose");
		
		//Ahora puedo recuperar el nombre de persona1 con un get
		System.out.println(persona1.getNombre());
		
		//Vamos a ver que ocurre si quiero mandar a imprimir en consola a persona2
		System.out.println(persona2);
		
		System.out.println(persona1);
		
		Futbol op = new Futbol();
		Futbol op2 = new Futbol("Messi","Barcelona", "Delantero", 10);
		
		op.setEquipoFavorito("Real Madrid");
		
		System.out.println(op);
		System.out.println(op2);
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro("Nissa", "Versa", 347900, "Negro");
		
		carro1.setMarca("Volkswagen");
		
		System.out.println(carro1);
		System.out.println(carro2);
		
		Videojuegos juego1 = new Videojuegos("Xbox Series X", "Accion", 4);
		Videojuegos juego2 = new Videojuegos();
		
		juego2.setConsola("PlayStation 5");
		
		System.out.println(juego1);
		System.out.println(juego2);
		
		Domicilio do1 = new Domicilio();
		Domicilio do2 = new Domicilio("Congreso",  "Centro");
		//Si quiero actualizar el pr◙1cio de los celulares, lo puedo hacer, pero se actualizara 
		//para todos
		Domicilio.setNumero(80);
		Domicilio do3 = new Domicilio();
		
		do1.setCalle("5 de mayo");
		
		System.out.println(do1);
		System.out.println(do2);
		System.out.println(do3);
		
		Mascota m1 = new Mascota("Perro", "Lu", 2);
		Mascota m2 = new Mascota();
		
		m2.setTipoMascota("Gato");
		
		System.out.println(m1);
		System.out.println(m2);
		
		
		
		
	}

}
