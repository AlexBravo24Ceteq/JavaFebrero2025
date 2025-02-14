package com;

public class So {

	private String sistema;
	private String conexion;
	private String actualizacion;
	
	public So() {
	}

	public So(String sistema, String conexion, String actualizacion) {
		super();
		this.sistema = sistema;
		this.conexion = conexion;
		this.actualizacion = actualizacion;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

	public String getActualizacion() {
		return actualizacion;
	}

	public void setActualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
	}

	@Override
	public String toString() {
		return "So [sistema=" + sistema + ", conexion=" + conexion + ", actualizacion=" + actualizacion + "]";
	}

}