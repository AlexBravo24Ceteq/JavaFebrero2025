package com.condicionales;

import java.util.Scanner;

public class Condicionales12_YAV {

	public static void main(String[] args) {
		// 12.Construir un programa que calcule el índice de masa 
		//corporal de una persona (IMC = peso [kg] / altura2 [m]) 
		//e indique el estado en el que se encuentra esa persona en función del valor de IMC
        //Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
		//Nota 2: Los operandos (peso y altura) deben 
		//ser introducidos por teclado por el usuario.
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 12==");
		System.out.println("============================");
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce tu peso(kg): ");
		double peso;
		peso=input.nextDouble();
		System.out.print("Introduce tu altura(m): ");
		double altura;
		altura=input.nextDouble();
		double imc;
		imc=peso/(altura*altura);
		System.out.println("Tu indice de masa corporal es: "+imc);
		if (imc>40) {
			System.out.println("obesidad morbida (obesidad de grado IV)");
		}else if(imc>35) {
			System.out.println("obesidad premorbida (obesidad de grado III)");
		}else if(imc>30) {
			System.out.println("sobrepeso cronico (obesidad de grado II)");
		}else if(imc>25) {
			System.out.println("sobrepeso (obesidad de grado I)");
		}else if(imc>18) {
			System.out.println("peso normal (saludable)");
		}else if(imc>17) {
			System.out.println("bajo peso");
		}else if(imc>16) {
			System.out.println("infrapeso");
		}else if(imc<16) {
			System.out.println("Critrerio de ingreso en hospital");
		}
		
	}

}
