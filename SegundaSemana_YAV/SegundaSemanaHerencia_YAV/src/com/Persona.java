package com;

//Al tener un metedo abtracto, la clase tambien debe volverse abstracta
//
public abstract class Persona {
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//METODOS PROPIOS
	//Son comportamientos o funciones que van a poder realizar nuestros objetos
	
	//Metodos sin retorno
	//Metodos con retorno
	
	//Metodos sin retorno de tipo de dato. Llevan la palabra clave "void"
	//y su trabajo es ejecutar un bloque de codigo pero no estan obligados a devolver
	//un tipo de dato
	
	//Ej. una accion que toda persona realiza en su dia a dia
	
	public void comer () {
		//Aqui va lo que queremos que este metodo ejecute
		System.out.println("Estoy comiendo...");
	}
	
	//Ej2. crear un metodo sumar, pero pide parametros
	
	public void sumar(int a, int b) {
		System.out.println(a+b);
	}
	
	//METODO CON RETORNO
	//Son metodos que ejecutan algo, o pueden ejecutar alguna accion, pero
	//su principal es devolver el tipo de dato que declaran
	
	public String miNombreEs() {
		//Tambien puedo mandar a imprimir el nombre, sin embargo lo principal
		//de estos metodos es retornar el tipo de dato
		System.out.println("Hola mi nombre es: " + nombre);
		return nombre;//este metodo devuelve un String con el nombre de nuestra Persona
	}
	
	//Ej2. de metodo con retorno
	public String saludar() {
		String saludo = "Hola Mundo";
		return saludo;
	}
	
	//POLIMORFISMO
	//Habilidad de un objeto, metodo o variable de poseer varias formas.
	//Esto nos permite en este caso que un metodo tenga el mismo nombre, pero pueda 
	//ejecutarse de diversas formas
	
	//vamos a crear otro metodo sumar, pero que pida 3 numeros
	
	public void sumar(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	//Ej. ahora otro metodo sumar que pida 4 numeros
	public void sumar(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	//Para que una clase se vuelva abstracta, debe poseer por lo menos un metodo abstracto
	//Un metodo abstracto es aquel que no posee cuerpo. Nos dice que debe hacerse, pero no como hacerse
	
	public abstract void checarEntrada();
	

}
