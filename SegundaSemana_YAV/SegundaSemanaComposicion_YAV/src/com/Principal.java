package com;

public class Principal {

	public static void main(String[] args) {
		//En este ejemplo tenemos objetos que forman parte de otro
		//es decir son atributos en unos mas grande
		
		//Entonces necesitamos crear o instanciar los mas pequeños
		//para que formen parte del mas grande
		
		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 1000);
		
		Procesador intel = new Procesador("Intel", "i5", 3.2);
		
		Ram adata = new Ram("Adata", "DDR4", 2666);
		
		//Ya podemos crear nuestra laptop
		Laptop hp = new Laptop("HP", "440G7", "Plata", 12000, kingston, intel, adata);
		
		System.out.println(hp);

	}

}
