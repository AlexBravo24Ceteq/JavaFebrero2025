package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciando la clase hija Cientifica
        Cientifica calc = new Cientifica("Casio", "264E", "Azul", 500);
        System.out.println(calc);
        //Pido numeros para poder hacer las operaciones simples y las adicionales
        Scanner scanner = new Scanner(System.in);

        // Probando los métodos simples
        System.out.println("EJECUTANDO OPERACIONES BASICAS");
        System.out.println("Ingresa dos numeros para sumar");
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        calc.sumar(d, e);
         
        System.out.println("Ingresa dos numeros para la resta");
        d = scanner.nextInt();
        e = scanner.nextInt();
        calc.restar(d, e);
         
        System.out.println("Ingresa dos numeros para la multiplicacion");
        d = scanner.nextInt();
        e = scanner.nextInt();
        calc.multiplicar(d, e);
         
        System.out.println("Ingresa dos numeros para la division");
        d = scanner.nextInt();
        e = scanner.nextInt();
        calc.dividir(d, e);
        
        // Probando los métodos adicionales con más argumentos
        System.out.print("Ingrese tres números para sumar: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        calc.sumaradi(a, b, c);

        System.out.print("Ingrese tres números para restar: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        calc.restaradi(a, b, c);

        System.out.print("Ingrese tres números para multiplicar: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        calc.multiplicaradi(a, b, c);

        System.out.print("Ingrese tres números para dividir: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        calc.dividiradi(a, b, c);

        scanner.close();
        
        calc.tomarTemp();
        
        //Los objetos pueden tomar comportamientos de 3 lugares
        //Metodos propios de sus clases
        //Metodos heredados, incluyendo clases abstractas
        //metodos de interfaces
    }
}

