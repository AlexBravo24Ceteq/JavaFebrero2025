package com;

public class Motos {

	private String Modelo;
	private String Color;
	private double Precio;
	
	public Motos() {
		}

	public Motos(String modelo, String color, double precio) {
		super();
		Modelo = modelo;
		Color = color;
		Precio = precio;
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
		return "Motos [Modelo=" + Modelo + ", Color=" + Color + ", Precio=" + Precio + "]";
	}
}
