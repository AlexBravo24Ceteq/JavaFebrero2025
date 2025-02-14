package com;

public class Consolas {

	private String Marca;
	private String Modelo;
	private String Capacidad;
	private double Precio;
	
	public Consolas() {
}

	public Consolas(String marca, String modelo, String capacidad, double precio) {
		super();
		Marca = marca;
		Modelo = modelo;
		Capacidad = capacidad;
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

	public String getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(String capacidad) {
		Capacidad = capacidad;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Consolas [Marca=" + Marca + ", Modelo=" + Modelo + ", Capacidad=" + Capacidad + ", Precio=" + Precio
				+ "]";
	}	
}
