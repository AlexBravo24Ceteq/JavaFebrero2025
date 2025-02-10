package com.ciclos;

import java.util.Scanner;

public class Ciclos3_YAV {
	
	public static void main(String[] args) {
		//3. Realiza un programa para determinar si un String es pal�ndromo.
		System.out.println("============================");
		System.out.println("==PROBLEMA 3==");
		System.out.println("============================");
		System.out.println();
		
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce la frase: ");
	 
		String frase=input.nextLine();
		
		if (espalindromo(frase)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}   public static boolean espalindromo(String frase) { //funcion para devolver una valor de verdadero o falso 
		frase=frase.toLowerCase();//convertimos la frase a minisculas
		frase=frase.replace(" ","");//quitamos los espacios
		frase=frase.replace("�","a");//y tambien quitamos los acentos
		frase=frase.replace("�","e");
		frase=frase.replace("�","i");
		frase=frase.replace("�","o");
		frase=frase.replace("�","u");
		
		int a=0;//se empieza desde el primer caracter
		int b=frase.length()-1;//desde el ultimo caracter
		
		for(int i=0; i<frase.length();i++) {
			if (frase.charAt(a)==frase.charAt(b)) {
				a++;
				b--;
			}else
				return false;
		}
		return true;
	}


}
