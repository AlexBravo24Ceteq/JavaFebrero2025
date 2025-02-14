package com;

//Esta clase que esta heredando de claculadora puede ademas
//implementar una o mas interfaces
public class Cientifica  extends Calculadora implements Termometro{
	
	//Implementamos Constructores de la superclase
	public Cientifica(String marca, String modelo, String color, double precio) {
		super(marca, modelo, color, precio);
	}

	//Implementamos metodos de la clase padre en la clase hijo
	@Override
	public void sumar(int d, int e) {
		int resultado = d+e;
		System.out.println("El resultado de la resta es: " + resultado);
		
	}

	@Override
	public void restar(int d, int e) {
		int resultado = d-e;
		System.out.println("El resultado de la resta es: " + resultado);
	}

	@Override
	public void multiplicar(int d, int e) {
		int resultado = d*e;
		System.out.println("El resultado de la multiplicacion de 2 numeros es: " + resultado);
		
	}

	@Override
	public void dividir(int d, int e) {
		if (d != 0 && e!= 0) {
            double resultado= (double) d/e;
            System.out.println("El resultado de la división de 2 numeros es: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
	}

	// Métodos adicionales con más argumentos
    public void sumaradi(int a, int b, int c) {
        int resultadoadi = a + b + c;
        System.out.println("Resultado de la suma de 3 numeros es: " + resultadoadi);
    }

    public void restaradi(int a, int b, int c) {
        int resultadoadi = a - b - c;
        System.out.println("Resultado de la resta de 3 numeros es: " + resultadoadi);
    }

    public void multiplicaradi(int a, int b, int c) {
        int resultadoadi = a * b * c;
        System.out.println("Resultado de la multiplicación de 3 numeros es: " + resultadoadi);
    }

    public void dividiradi(int a, int b, int c) {
        if (b != 0 && c != 0) {
            double resultadoadi = (double) a / b / c;
            System.out.println("Resultado de la división de 3 numeros: " + resultadoadi);
        } else {
            System.out.println("No se puede dividir entre cero.");
       }
    }
    // Una vez implementamos una interface debemos sobreescribir o definir
        //dicho metodo o metodos
     @Override
	public void tomarTemp() {
		System.out.println("La temperatura es 40°");
		
	}
}
