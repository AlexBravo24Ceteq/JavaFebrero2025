package com;

public class Tecnologia {

	private String pulgadas;
	private String resolucion;
	private double brillo;
	
	public Tecnologia() {
	}

	public Tecnologia(String pulgadas, String resolucion, double brillo) {
		super();
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
		this.brillo = brillo;
	}

	public String getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(String pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public double getBrillo() {
		return brillo;
	}

	public void setBrillo(double brillo) {
		this.brillo = brillo;
	}

	@Override
	public String toString() {
		return "Tecnologia [pulgadas=" + pulgadas + ", resolucion=" + resolucion + ", brillo=" + brillo + "]";
	}
	
}