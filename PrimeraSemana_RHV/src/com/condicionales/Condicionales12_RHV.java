package com.condicionales;

import java.util.Scanner;

public class Condicionales12_RHV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
//				[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
//					
//					<16 criterio de ingreso al hospital
//					de 16 a 17 infrapeso
//					de 17 18 bajo peso
//					de 19 a 25 peso normal (saludable)
//					de 25 a 30 sobrepeso (obecidad de grado I)
//					de 30 a 35 sobrepeso cronico(obecidad de grado II)
//					de 35 a 40 sobrepeso premorbida (obecidad de grado III)
//					>40 obecidad morbida (obecidad de grado (IV)
//							
//							
//							
//				Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben
//				ser introducidos por teclado por el usuario
//		
//		
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;
        
        System.out.print("Ingrese su peso en kg: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("ERROR: Entrada no válida. Debe ingresar un número.");
            scanner.next();
        }
        peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("ERROR: Entrada no válida. Debe ingresar un número.");
            scanner.next();
        }
        altura = scanner.nextDouble();
        
        // Calcular el IMC
        imc = peso / (altura * altura);
        
                String estado;
        if (imc < 16) {
            estado = "Criterio de ingreso al hospital";
        } else if (imc >= 16 && imc < 17) {
            estado = "Infrapeso";
        } else if (imc >= 17 && imc < 18) {
            estado = "Bajo peso";
        } else if (imc >= 18 && imc < 25) {
            estado = "Peso normal (saludable)";
        } else if (imc >= 25 && imc < 30) {
            estado = "Sobrepeso (obesidad de grado I)";
        } else if (imc >= 30 && imc < 35) {
            estado = "Sobrepeso crónico (obesidad de grado II)";
        } else if (imc >= 35 && imc < 40) {
            estado = "Sobrepeso premórbida (obesidad de grado III)";
        } else {
            estado = "Obesidad mórbida (obesidad de grado IV)";
        }
        
        System.out.printf("Su IMC es: %.2f - Estado: %s%n", imc, estado);
        
        scanner.close();
		

	}

}
