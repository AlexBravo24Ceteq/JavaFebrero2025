package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		
		System.out.println("Probando estructura if/else");
		
		if(x<10) {
			
			System.out.println("Cierto");
			
			
		}else {
			System.out.println("Falso");
			

			
		}
		
		
		System.out.println("Probando operador AND &&");

		
		if(x<11&&x>1){
			System.out.println("Cierto");

		}else {
			System.out.println("Falso");

		}
		
		
		System.out.println("Probando operador OR ||");

		
		if(x<11||x>1){
			System.out.println("Cierto");

		}else {
			System.out.println("Falso");

		}
		
		
System.out.println("Probando operador NOT !");

		
		if(!(x<11)){
			System.out.println("Cierto");

		}else {
			System.out.println("Falso");

		}
		
		
		
System.out.println("Probando operador igualdad ==");

		
		if(x==10){
			System.out.println("Cierto");

		}else {
			System.out.println("Falso");

		}
		
System.out.println("Probando operador diferencial !=");

		
		if(x!=10){
			System.out.println("Cierto");

		}else {
			System.out.println("Falso");

		}
		
		//Estructura IF ELSE anidado
		System.out.println("Probando estructura if else");

		
		int opcion =1;
		
		if (opcion==2) {
			System.out.println("piedra");
		}
		else if(opcion==3) {
			System.out.println("papel");
		}
		else if(opcion==1) {
			System.out.println("tijera");
		}else {
			System.out.println("opcion no validadi");
			
			
		}
		
		//Estructura case 
		System.out.println("Probando estructura case");

				
		
		
		int op2=1;
		
		switch(op2) {
		case 1:
			System.out.println("piedra");
			break;
		case 2:
			System.out.println("papel");
			break;
		case 3:
			System.out.println("tijera");
			break;
		default:
			System.out.println("opcion no validadi");
				
		}
		
	}

}
