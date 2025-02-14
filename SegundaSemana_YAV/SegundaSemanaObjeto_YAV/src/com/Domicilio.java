package com;

public class Domicilio {
	
	private String calle;
	//private final double numero= 5;
		//Tambien podemos tener otras palabras clave
		//que pueden actuar sobre los metodos o tributos
		//Y estos son final y static
	
	//Palabra clave final se utiliza para metodos o atributos que no queremos cambiar
	//private final double numero= 5;
	
	//static
	//Es utilizada para atributos y metodos que serian de la clase en si 
	//es decir, si creamos un objeto con un atributo static, todos tendran
	//el mismo valor pero aun es modificable
	private static double numero= 50;
	private String colonia;
	
	public Domicilio() {
		
	}

	public Domicilio(String calle,  String colonia) {
		super();
		this.calle = calle;
		//this.numero = numero;
		this.colonia = colonia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public double getNumero() {
		return numero;
	}

	
	//Ahora este metodoo set tambien es 
	public static void setNumero(double numero) {
		Domicilio.numero = numero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + "]";
	}
	
	

}
