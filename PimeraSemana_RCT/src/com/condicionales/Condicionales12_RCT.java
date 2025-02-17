package com.condicionales;

import java.util.Scanner;

public class Condicionales12_RCT {

	public static void main(String[] args) {
		//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
		//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC: 
		//Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
		//ser introducidos por teclado por el usuario. 
		System.out.println("Problema 12");
		System.out.println("CALCULO IMC\n");
		Scanner dato = new Scanner(System.in);
		
		double IMC;
        int peso;
        double altura;
      
      
        System.out.println("Ponga su peso:");
        peso=dato.nextInt();
      
        System.out.println("Ponga su altura:");  
        altura=dato.nextDouble();
      
    IMC=peso/(altura*altura);
   
    System.out.println(IMC);
   
    if(IMC<16)
    {
        System.out.println("Ingreso hospital");
    }else if(IMC>=16 && IMC<=17)
    {
        System.out.println("Infrapeso");
    }
    else if(IMC>=17 && IMC<=18)
    {
        System.out.println("Bajo peso");
    }
    else if(IMC>=18 && IMC<=25)
    {
        System.out.println("peso normal");
    }
    else if(IMC>=25 && IMC<=30)
    {
        System.out.println("sobrepeso (obesidad grado 1)");
    }
    else if(IMC>=30 && IMC<=35)
    {
        System.out.println("sobrepeso crónico(obesidad grado 2)");
    }
    else if(IMC>=35 && IMC<=40)
    {
        System.out.println("obesidad premórbida(obesidad grado 3)");
    }
    else if(IMC>40)
    {
        System.out.println("obesidad mórbida (obesidad grado 4)");
    }
   

	}

}
