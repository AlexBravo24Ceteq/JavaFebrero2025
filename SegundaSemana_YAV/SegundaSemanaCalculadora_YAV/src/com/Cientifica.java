package com;

import java.util.Scanner;

//Esta clase que esta herendando de calculadora puede ademas
//implementar una o mas interfaces
public class Cientifica extends Calculadora implements ITermometro{
	
	
	
	public Cientifica() {
		
	}
	
	
	
	public Cientifica(String string, String string2, int i) {
		System.out.println("Calculadora [marca=" + string + ", color=" + string2 + ", precio=" + i + "]");
	}



	@Override
	public void sumar() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion suma: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion suma: ");
		int y;
		y= input.nextInt();
		System.out.println("El total de la suma es: "+ (x+y));
		
	}



	@Override
	public void restar() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion resta: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion resta: ");
		int y;
		y= input.nextInt();
		System.out.println("El total de la resta es: "+ (x-y));
		
		
	}



	@Override
	public void multiplicar() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion multiplicacion: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion multiplicacion: ");
		int y;
		y= input.nextInt();
		System.out.println("El total de la multiplicacion es: "+ (x*y));
	}



	@Override
	public void dividir() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion division: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion division: ");
		int y;
		y= input.nextInt();
		System.out.println("El total de la division es: "+ (x/y));
	}
	
	public void sumar3() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion suma: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion suma: ");
		int y;
		y= input.nextInt();
		System.out.print("Introduce un tercer numero para la operacion suma: ");
		int z;
		z= input.nextInt();
		System.out.println("El total de la suma es: "+ (x+y+z));
		
	}
	
	public void restar3() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion resta: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion resta: ");
		int y;
		y= input.nextInt();
		System.out.print("Introduce un tercer numero para la operacion resta: ");
		int z;
		z= input.nextInt();
		System.out.println("El total de la resta es: "+ (x-y-z));
	}
	
	public void multiplicar3() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion multiplicacion: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion multiplicacion: ");
		int y;
		y= input.nextInt();
		System.out.print("Introduce un tercer numero para la operacion multiplicacion: ");
		int z;
		z= input.nextInt();
		System.out.println("El total de la multiplicacion es: "+ (x*y*z));
	}
	
	public void dividir3() {
		Scanner input = new Scanner (System.in);
        System.out.print("Introduce un primer numero para la operacion division: ");
		int x;
		x= input.nextInt();
        System.out.print("Introduce un segundo numero para la operacion division: ");
		int y;
		y= input.nextInt();
		System.out.print("Introduce un tercer numero para la operacion division: ");
		int z;
		z= input.nextInt();
		System.out.println("El total de la division es: "+ (x/y/z));
	}


    //Una vez implemetamos una interface debemos sobreescribir o definir
	//dicho metodo o metodos
	@Override
	public void tomarTemp() {
		System.out.println("Temperatura normal");
		
	}







}
