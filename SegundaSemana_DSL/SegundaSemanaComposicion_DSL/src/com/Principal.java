package com;

public class Principal {

	public static void main(String[] args) {
		
		//En este ejemplo tenemos objetos que forman parte de otro
		//es decir son atributos en unos mas grande
		
		//Entonces necesitamos primero crear o instanciar los mas pequeños
		//para que formen parte del mas grande
		
//		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 1000);
//		
//		Procesador intel = new Procesador("Intel", "i5",3.2);
//		
//		Ram adata = new Ram("Adata","DDR4", 2666);
//		
//		//Ya podemos crear nuestra Laptop
//		
//		Laptop hp = new Laptop("Hp","440G7", "Plata",12000, kingston, intel, adata);
//		 
//		System.out.println(hp);

		
		//Asigno valores a los sub-objetos de mi clase Television
	
		AlmacenamientoT chip =  new AlmacenamientoT("Netflix,Disney,Max", "12gb", 4);
		
		So sistema = new So("WebOS", "Wi-fi,Ethernet", "120hz");
		
		Tecnologia oled = new Tecnologia("70 pulgadas", "4K", 5000);
		
		//Ya puedo crear mi television
	
		Television tel = new Television("LG", "negro", 15000, sistema, oled, chip);
		
		System.out.println(tel);
	}
}
