package com.condicionales;

import java.util.Scanner;

public class Condicionales9_DSL {

	public static void main(String[] args) {
		// .Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		//introducimos otro número nos da un error.
		
		Scanner scanner = new Scanner(System.in);
		
		 // Solicitar al usuario el número del dia
        System.out.print("Introduce el número del dia de la semana (1-7): ");
        int dia = scanner.nextInt();
        
        // Determinar el numero del dia de la semana y nos devulve un string del dia de la semana
        String resultado;
         switch (dia) {
            case 1: resultado = "Lunes"; 
            break;
            case 2: resultado = "Martes"; 
            break;
            case 3: resultado = "Miercoles"; 
            break;
            case 4: resultado = "Jueves"; 
            break;
            case 5: resultado = "Viernes";
            break;
            case 6: resultado = "Sabado";
            break;
            case 7: resultado = "Domingo"; 
            break;
            default: resultado = "ERROR: dia incorrecto"; 
            break;
        }

        // Mostrar el resultado
        System.out.println(resultado);  
	}
}

