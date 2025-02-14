package com;

public class Principal {

	public static void main(String[] args) {
		
		//Probando crear una Persona
		//Persona juan = new Persona("Juan", "Masculino", 20);Una vez una clase es abstracta
		//ya no podemos instaciarla.
		
		//Podemos aplicar poloformismo de asigancion para poder crear nuevamente a juan
		//pero como un empleado
		//Persona juan = new Empleado();//podemos asignar
		
		Empleado juan = new Empleado();//o mejor crearlo directo de la clase que si se puede instanciar
		
		//Probando crear un Empleado
		Empleado chambas = new Empleado("Daniel", "Masculino", 25, "DANI25HC", 250000, "Matutino");
		
		System.out.println(juan);
		
		System.out.println(chambas);
		
		//Crear un empleado vacio y asignarle posteriormente
		
		Empleado flojo = new Empleado();
		
		flojo.setNombre("Victor");
		flojo.setSalario(25000);
		
		System.out.println(flojo);
		
		juan.comer();
		
		//probamos el metodo sumar,que nos pediria argumentos
		juan.sumar(109, 10);
		
		//Nuestros empleados gracias a la herencia tambien pueden acceder a los 
		//metodos o acciones de su clase padre
		chambas.comer();
		
		//Probando un metodo con retorno. mi NombreEs
		juan.miNombreEs();
		//Si yo quiero verlo impreso puedo hacerlo de varias formas
		//Guardandolo en un String primero
		String nombreDeJuan = juan.miNombreEs();
		System.out.println(nombreDeJuan);
		// O puedo mandarlo a imprimir directo
		System.out.println(juan.miNombreEs());
		
		//Probando el metodo saludar
		System.out.println(juan.saludar());//Esto es equivalente si yo hiciera una impresion
		//System.out.println
		
		//Probando el metodo sumar para ver el polimorfismo
		
		chambas.sumar(100, 10, 19, 18);
		
		//Probar el metodo abstracto queya definio mi clase Empleado
		juan.checarEntrada();
		
	}
}
