package com;

public class Mascota {
	
	private String tipoMascota;
	private String nombreMascota;
	private double edadMascotaAños;
	
	public Mascota() {
		
	}

	public Mascota(String tipoMascota, String nombreMascota, double edadMascotaAños) {
		super();
		this.tipoMascota = tipoMascota;
		this.nombreMascota = nombreMascota;
		this.edadMascotaAños = edadMascotaAños;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public double getEdadMascotaAños() {
		return edadMascotaAños;
	}

	public void setEdadMascotaAños(double edadMascotaAños) {
		this.edadMascotaAños = edadMascotaAños;
	}

	@Override
	public String toString() {
		return "Mascota [tipoMascota=" + tipoMascota + ", nombreMascota=" + nombreMascota + ", edadMascotaAños="
				+ edadMascotaAños + "]";
	}
	
	

}
