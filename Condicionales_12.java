package com.condicionales;

import java.util.Scanner;

public class Condicionales_12 {
	
public static void main(String[] args) {
		
		System.out.println("---------------PROBLEMA 11-----------------");
	
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el peso en kg");
		double peso = input.nextDouble(); 
		
		System.out.println("Introduce la altura en m");
		double altura = input.nextDouble(); 
		
		double IMC= peso/(altura*altura); 
		System.out.println(IMC);

		
		if(IMC <16)
		{
			System.out.println("criterio de ingreso en el hospital "  );

		}
		else if(IMC >= 16 && IMC< 17)
			{
			System.out.println("infrapeso");
			}
				
			
		else if(IMC >= 17 && IMC< 18)
				{
			System.out.println("bajo peso");
			
				}
			
		else if(IMC >=18 && IMC< 25)
					{
				System.out.println("peso normal");
					}
			
						
		else if(IMC >= 25 && IMC< 30)
						{
				System.out.println("sobrepeso");
						}
			
		else if(IMC >=30 && IMC< 35)
							{ 
				System.out.println("sobrepreso cronico");
							
							}
								
		else if(IMC >= 35 && IMC< 40)
								{
			System.out.println("obesidad premorbida");
								
								}
									
		else{
				System.out.println("Obesidad morbida");
						}
								

}
}
