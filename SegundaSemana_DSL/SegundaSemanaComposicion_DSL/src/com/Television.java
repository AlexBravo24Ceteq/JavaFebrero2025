package com;

public class Television {

	private String marca;
	private String color;
	private double precio;
	
	//Los objetos que conforman la television
	
	private So sistema;
	private Tecnologia tec;
	private AlmacenamientoT ssd;
	
	public Television() {}

	public Television(String marca, String color, double precio, So sistema, Tecnologia tec, AlmacenamientoT ssd) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.sistema = sistema;
		this.tec = tec;
		this.ssd = ssd;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public So getSistema() {
		return sistema;
	}

	public void setSistema(So sistema) {
		this.sistema = sistema;
	}

	public Tecnologia getTec() {
		return tec;
	}

	public void setTec(Tecnologia tec) {
		this.tec = tec;
	}

	public AlmacenamientoT getSsd() {
		return ssd;
	}

	public void setSsd(AlmacenamientoT ssd) {
		this.ssd = ssd;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", color=" + color + ", precio=" + precio + ", sistema=" + sistema
				+ ", tec=" + tec + ", ssd=" + ssd + "]";
	}
	
	
}

