package com;
    //Herencia- pilar POO
	//En la que una clase hija(bubclase heredara atributos y comportamientos
	//de una clase padr(superclase)
	//y se realiza con la palabra reservada "extends"
public class Empleado extends Persona{

	//Con esto aqui solo debemos declarar los atributos que serian 
	//propios de un empleado
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {}

	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", getNombre()=" + getNombre()
				+ ", getGenero()=" + getGenero() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void checarEntrada() {
		// las clases hijas se ven obligadas a implementar los metodos abstractos que dejaron sus clases padres
		System.out.println("Checando entrada 8am");
		
	}
	
	
	}
