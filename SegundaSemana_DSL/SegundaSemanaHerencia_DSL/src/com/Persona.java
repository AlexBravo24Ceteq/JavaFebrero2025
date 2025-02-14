package com;

//Al tener un metodo abstracto,la clase tambien debe volverse abstracta
//Y al hacer esto, esta clase ya no vamos 
public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}

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
	
	//Ej.un accion que toda persona realiza en su dia a dia
	
	public void comer() {
		//aqui va lo que queremos que este metodo ejecute
		System.out.println("Estoy comiendo....");
	}
		public void sumar(int a, int b) {
			System.out.println(a+b);
		}
		//METODOS CON RETORNO
		//SOn metodos que ejecutan algo, o pueden ejecutar alguna accion pero 
		//su principal proposito es devolver el tipo de dato que declaran
		
		public String miNombreEs() {
			//Tambien puedo mandara imprimir el nombre sin embargo lo principal
			//de estos metodos es retornar el tipo de dato
			System.out.println("Hola minombre es: "+ nombre);
			return nombre;//Este metodo devuelve un String con el nombre de nuestra persona
		}
		
		//Ej. 2 de metodo con retorno
		public String saludar() {
			String saludo ="Hola mundo";
			return saludo;
			
		}
			//POLIMORFISMO
			//Habilidad de un objeto,metodo o variable de posser varias formas
		    //Esto nos permite en este caso que un metodo tenga el mismo nombre, pero pueda
		    //ejecutarse de diversas formas
		  
		//Vamos a crear otro metodo sumar, pero que pida 3 numeros
		
		public void sumar(int a, int b, int c) {
		System.out.println(a+b+c); 
		}
		
		//Ej. ahora otro metodo sumar que pida 4 numeros
		public void sumar(int a,int b, int c, int d) {
			System.out.println(a+b+c+d);
		}
		
		//Para que una clase se vuelva abstracta,debe poseer por lo menos un metodo abstracto
		//un metodo abstracto es aquel que no posee cuerpo.Nos dice que debe hacerse pero no como hacerse.
		
		public abstract void checarEntrada();
			
		}
	

