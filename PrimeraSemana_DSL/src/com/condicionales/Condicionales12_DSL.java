package com.condicionales;

import java.util.Scanner;

public class Condicionales12_DSL {
public static void main(String[] args) {
//	//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//	[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC: 
//		Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
//		ser introducidos por teclado por el usuario. 

	
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Introduce el peso de la persona: ");
     double peso = scanner.nextDouble();
     System.out.println("Introduce la altura de la persona en ");
     double altura = scanner.nextDouble();
     
     double imc = (peso/altura);
     
      if (imc<16) {
    	 System.out.println("El diagnostico es: Criterio de ingreso al hospital.");
     } else if (16>=imc && imc<17){
    	 System.out.println("El diagnostico es: Infrapeso");
     } else if (17>=imc && imc<18){
    	 System.out.println("El diagnostico es: Bajo peso");
     } else if (18>=imc && imc<25) {
	     System.out.println("El diagnostico es: Peso normal (Saludable)");
     } else if (25>=imc && imc<30) {
    	 System.out.println("El diagnostico es: Sobrepeso (Obesidad grado 1)");
     } else if (30>=imc && imc<35) {
    	 System.out.println(" El diagnostico es: Sobrepeso Cronico(Obesidad grado 2)");
     } else if (35>=imc && imc<=40) {
    	 System.out.println("El diagnostico es: Obesidad Premorbida(Obesidad grado 3)");
     } else if (imc>40){
    	 System.out.println("El diagnostico es: Obesidad Morbida (Obesidad grado 4)");
     }
   }
 }

