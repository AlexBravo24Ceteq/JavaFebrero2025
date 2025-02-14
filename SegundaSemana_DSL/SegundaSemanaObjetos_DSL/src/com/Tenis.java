package com;

public class Tenis {
	

	private String tipo;
	private String modelo;
	private double precio;
	
	public Tenis() {
				
}

	public Tenis(String tipo, String modelo, double precio) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tenis [tipo=" + tipo + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
}
