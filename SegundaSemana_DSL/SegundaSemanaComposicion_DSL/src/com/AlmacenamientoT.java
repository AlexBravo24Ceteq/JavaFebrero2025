package com;

public class AlmacenamientoT {

	private String app;
	private String capacidad;
	private double ram;
	
	
	public AlmacenamientoT() {
	}


	public AlmacenamientoT(String app, String capacidad, double ram) {
		super();
		this.app = app;
		this.capacidad = capacidad;
		this.ram = ram;
	}


	public String getApp() {
		return app;
	}


	public void setApp(String app) {
		this.app = app;
	}


	public String getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}


	public double getRam() {
		return ram;
	}


	public void setRam(double ram) {
		this.ram = ram;
	}


	@Override
	public String toString() {
		return "AlmacenamientoT [app=" + app + ", capacidad=" + capacidad + ", ram=" + ram + "]";
	}


}