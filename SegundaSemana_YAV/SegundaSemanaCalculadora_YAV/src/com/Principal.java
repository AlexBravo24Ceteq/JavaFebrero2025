package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica op = new Cientifica("Casio", "Negro", 200);
		//Cientifica op = new Cientifica();
		
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
		op.sumar3();
		op.restar3();
		op.multiplicar3();
		op.dividir3();
		op.tomarTemp();
		
		//Los objetos pueden tomar comportamientos de 3 lugaress:
		//1.- de metodos propios de sus clases
		//2.- de metodos heredados, incluyendo clases abstractas
		//3.- de metodos de interfaces

	}

}
