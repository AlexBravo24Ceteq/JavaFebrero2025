package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private int precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, int precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	
	public abstract void sumar();
	
	public abstract void restar();
	
	public abstract void multiplicar();
	
	public abstract void dividir();



	

}
