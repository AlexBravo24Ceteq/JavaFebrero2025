package com;

public class Carros {

	private String Marca;
	private String Modelo;
	private String Color;
	private double Precio;
	
	public Carros() {
		
	}

	public Carros(String marca, String modelo, String color, double precio) {
		super();
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Precio = precio;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Carros [Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Precio=" + Precio + "]";
	}
}
