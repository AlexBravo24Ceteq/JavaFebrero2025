package com;

public class Principal {

	public static void main(String[] args) {
		//Probando a crear una Persona
		
		//Persona juan = new Persona("Juan", "Masculino", 20);  una vez una clase es abstracta
		//ya no podemos instanciarla
		
		//Podemos aplicar polimorfismo de asigancion para poder crear nuevamente a juan
		//pero como empleado
		//Persona juan = new Empleado();//podemos asignar a juan como new empleado de esta manera
		
		Empleado juan = new Empleado();
		
		//Probando ahora crear un Empleado
		
		Empleado chambas = new Empleado("Daniel", "Masculino", 25, "DANI25HC", 25000, "Matutino");
		
		System.out.println(juan);
		System.out.println(chambas);
		
		//Crear un empleado vacio y asignar posteriormente valores con setters
		
		Empleado flojo = new Empleado();
		flojo.setNombre("Victor");
		flojo.setSalario(25000);
		
		System.out.println(flojo);
		
		//Vamos a probar nuestro metodo comer 
		//A traves de una persona
		juan.comer();
		
		//Probamos el metodo sumar, que nos pedira argumentos
		juan.sumar(100, 5);
		
		//Nuestros empleados gracias a la herencia tambien pueden acceder a los
		//metodos o acciones de su clase padre
		
		chambas.comer();
		
		//Probando un metodo con retorno. miNombreEs
		juan.miNombreEs();
		//Si yo quiero verlo impreso puedo hacerlo de varias formas
		//Guardando en un String primero
		String nombreDeJuan=juan.miNombreEs();
		System.out.println(nombreDeJuan);
		//o puedo mandarlo a imprimir directo
		System.out.println(juan.miNombreEs());
		
		//Probamos el metodo saludar
		System.out.println(juan.saludar());//Esto equivalete si yo hiciera uan impresion
		//System.out.println("Hola Mundo");
		
		//Probando el metodo sumar para ver el POLIMORFISMO que tiene este metodo
		chambas.sumar(100, 10, 19, 18);
		
		//Probar el metodo abstracto que ya definido mi clase Empleado
		juan.checarEntrada();

	}

}
