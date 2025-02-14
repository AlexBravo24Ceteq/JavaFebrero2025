package com;

public abstract class  Calculadora {
    //Se declaran variables
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	
	//Constructor vacio
	public Calculadora() {}

	//Constructor
	public Calculadora(String marca, String modelo, String color, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
				+ ", toString()=" + super.toString() + "]";
	}
	//Se declaran los 4 metodos abstractos
	public abstract void sumar(int d, int e);

	public abstract void restar(int d, int e);
	
	public abstract void multiplicar(int d, int e);
	
	public abstract void dividir(int d, int e);
		
}
