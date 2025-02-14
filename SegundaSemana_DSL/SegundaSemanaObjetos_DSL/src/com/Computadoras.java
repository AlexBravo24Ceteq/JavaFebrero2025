package com;

public class Computadoras {

	private String Modelo;
	private String Almacenamiento;
	private String Ram;
	private double Precio;
	
	public Computadoras() {
	}

	public Computadoras(String modelo, String almacenamiento, String ram, double precio) {
		super();
		Modelo = modelo;
		Almacenamiento = almacenamiento;
		Ram = ram;
		Precio = precio;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getAlmacenamiento() {
		return Almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		Almacenamiento = almacenamiento;
	}

	public String getRam() {
		return Ram;
	}

	public void setRam(String ram) {
		Ram = ram;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Computadoras [Modelo=" + Modelo + ", Almacenamiento=" + Almacenamiento + ", Ram=" + Ram + ", Precio="
				+ Precio + "]";
	}	
}
