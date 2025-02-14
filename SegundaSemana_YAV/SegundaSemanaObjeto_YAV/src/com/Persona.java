package com;

public class Persona {
	
	//Esta clase nos va a permitir crear objetos Perosna 
	//Las clases surven como plantilla para crear objetos
	
	//Aqui vamos a modelarlos iniciando por declarar sus caracteristicas
	//o tambien conocidos como atributos
	//ABSTRACCION - Idea de nuestro objeto
	
	//Encapsulamiento - Proteger la informacion de acuerdo a un nivel de acceso 
	//esto se logra gracias a los modificadores de acceso que son:
	//private, protected, public, default
	
	private String nombre;
	private String genero;
	private String tipoSangre;
	private double altura;
	private double peso;
	
	//Metodos Constructores
	//Son metodos que nos van a permitir iniciar o crear a nuestros objetos
	//Principalmente tenemos dos:
	
	//Metodo constructor vacio
	//Me permite crear a mi objeto sin necesidad de iniciar sus atributos
	public Persona() {
		
	}
	
    //Metodo contructor con todos los parametros
	//Me permite crear un objeto de mi clase con sus atributos iniciados
	public Persona(String nombre, String genero, String tipoSangre, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.tipoSangre = tipoSangre;
		this.altura = altura;
		this.peso = peso;
	}
	
    //Puedo tener mas constructores segun lo necesite, pero regularmente
	//con tener el vacio y el de todos los parametros es suficiente
	//Ej. Contructor con dos parametros
	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}
	
	//Metodos GETTERS & SETTERS
	//Metodos GET, devuelvan el tipo de dato del atributo
	//Metodos SET, nos permiten establecer un valor en un atributo privado

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

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	//Metodo toString()
	//Convierte a cadena de texto todos los atributos de nuestro objeto
	//para poder ver como se componM nuestro objeto como si de una "Radiografia"
	//se tratase
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", tipoSangre=" + tipoSangre + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	

}
