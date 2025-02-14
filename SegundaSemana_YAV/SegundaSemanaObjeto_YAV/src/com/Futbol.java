package com;

public class Futbol {
	
	private String jugadorFavorito;
	private String equipoFavorito;
	private String pocision;
	private int numeroFavorito;
	
	public Futbol(){
		
	}

	public Futbol(String jugadorFavorito, String equipoFavorito, String pocision, int numeroFavorito) {
		super();
		this.jugadorFavorito = jugadorFavorito;
		this.equipoFavorito = equipoFavorito;
		this.pocision = pocision;
		this.numeroFavorito = numeroFavorito;
	}

	public String getJugadorFavorito() {
		return jugadorFavorito;
	}

	public void setJugadorFavorito(String jugadorFavorito) {
		this.jugadorFavorito = jugadorFavorito;
	}

	public String getEquipoFavorito() {
		return equipoFavorito;
	}

	public void setEquipoFavorito(String equipoFavorito) {
		this.equipoFavorito = equipoFavorito;
	}

	public String getPocision() {
		return pocision;
	}

	public void setPocision(String pocision) {
		this.pocision = pocision;
	}

	public double getNumeroFavorito() {
		return numeroFavorito;
	}

	public void setNumeroFavorito(int numeroFavorito) {
		this.numeroFavorito = numeroFavorito;
	}

	@Override
	public String toString() {
		return "Futbol [jugadorFavorito=" + jugadorFavorito + ", equipoFavorito=" + equipoFavorito + ", pocision="
				+ pocision + ", numeroFavorito=" + numeroFavorito + "]";
	}
	
	
	
	
}

