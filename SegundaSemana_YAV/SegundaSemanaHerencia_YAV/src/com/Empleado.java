package com;
//Herencia - Pilar POO
//En la que una clase hija (subclase) hereda atributos y comportamientos
//de ua clase padre (superclase)
//y se realiza con la palabra "extends"
public class Empleado extends Persona {
	
	//Con esto aqui solo debemos debemos declarar los atributos que serian
	//propios de un objeto
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {
		
	}
    //Para generar el constructor con todos los parametros debemos asegurarnos
	//de que al crearlo seleccionemos el constructor con todo 
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
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void checarEntrada() {
		// Las clases hijas se ven obligadas a implementar los metodos abstractos
		//que dejaron sus clases padre y aqui si hay que definirlos
		System.out.println("Checando entrada 8am");
		
	}
	
	
}
