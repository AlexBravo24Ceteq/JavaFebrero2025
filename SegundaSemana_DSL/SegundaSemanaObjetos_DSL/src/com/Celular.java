package com;

public class Celular {
 
	private String marca;
	private String modelo;
	private String color;
	
	//Tambien podemos tener otras palabras clave que pueden actuar sobre los metodos o atributos
	//y estos son final y static
	//Palabra clave final se utiliza para metodos o atributos que no queremos cambiar
	//private final double precio = 3000;
	
	//Static
	//Es utilizada para atributos y metodos que serian de la clase en si es decir,creamos un objeto
	//con un atributo static todos tendran
	//els mismo valor pero aun es modificable desde la clas en si
	//Podemos utilizar static y final juntos para crear valores "inmutables"
	private static final double precio= 10000;
	
	public Celular() {}

	public Celular(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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

//	public static void setPrecio(double precio) {
//		Celular.precio = precio;
//	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + "]";
	}
	
	
}

