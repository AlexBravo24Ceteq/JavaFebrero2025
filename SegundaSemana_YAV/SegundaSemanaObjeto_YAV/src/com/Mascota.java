package com;

public class Mascota {
	
	private String tipoMascota;
	private String nombreMascota;
	private double edadMascotaA�os;
	
	public Mascota() {
		
	}

	public Mascota(String tipoMascota, String nombreMascota, double edadMascotaA�os) {
		super();
		this.tipoMascota = tipoMascota;
		this.nombreMascota = nombreMascota;
		this.edadMascotaA�os = edadMascotaA�os;
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

	public double getEdadMascotaA�os() {
		return edadMascotaA�os;
	}

	public void setEdadMascotaA�os(double edadMascotaA�os) {
		this.edadMascotaA�os = edadMascotaA�os;
	}

	@Override
	public String toString() {
		return "Mascota [tipoMascota=" + tipoMascota + ", nombreMascota=" + nombreMascota + ", edadMascotaA�os="
				+ edadMascotaA�os + "]";
	}
	
	

}
