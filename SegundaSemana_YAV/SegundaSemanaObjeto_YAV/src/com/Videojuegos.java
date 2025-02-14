package com;

public class Videojuegos {
	
	private String consola;
	private String tipoDeJuego;
	private double horasParaJugar;
	
	public Videojuegos() {
		
	}

	public Videojuegos(String consola, String tipoDeJuego, double horasParaJugar) {
		super();
		this.consola = consola;
		this.tipoDeJuego = tipoDeJuego;
		this.horasParaJugar = horasParaJugar;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public String getTipoDeJuego() {
		return tipoDeJuego;
	}

	public void setTipoDeJuego(String tipoDeJuego) {
		this.tipoDeJuego = tipoDeJuego;
	}

	public double getHorasParaJugar() {
		return horasParaJugar;
	}

	public void setHorasParaJugar(double horasParaJugar) {
		this.horasParaJugar = horasParaJugar;
	}

	@Override
	public String toString() {
		return "Videojuegos [consola=" + consola + ", tipoDeJuego=" + tipoDeJuego + ", horasParaJugar=" + horasParaJugar
				+ "]";
	}
	
	

}
