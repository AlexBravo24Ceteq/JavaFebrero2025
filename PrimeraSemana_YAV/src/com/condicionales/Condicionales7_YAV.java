package com.condicionales;

import java.util.Scanner;

public class Condicionales7_YAV {

	public static void main(String[] args) {
		// 7. El director de una escuela est� organizando
		//un viaje de estudios y requiere determinar cu�nto 
		//debe cobrar a cada alumno y cu�nto debe pagar a la compa��a
		//de viajes por el servicio. La forma de 
		//cobrar es la siguiente:
		//* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		//* De 50 a 99 alumnos, el costo es de 70 euros.
		//* De 30 a 49 alumnos, el costo es de 95 euros.
		//* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
		//alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
		//pagar cada alumno por el viaje.
		
		System.out.println("============================");
		System.out.println("==PROBLEMA 7==");
		System.out.println("============================");
		int totalapagar;
		int pagoporalumno;
		Scanner input= new Scanner(System.in);
		System.out.print("Introduce el numero de alumnos: ");
		int alumnos;
		alumnos=input.nextInt();
		
		
		if (alumnos>=100) {
			pagoporalumno=65;
			totalapagar=pagoporalumno*alumnos;
			System.out.println("El pago por alumno es: "+pagoporalumno);
			System.out.println("El total a pagar es: "+totalapagar);
		}else if(alumnos>=50){
			pagoporalumno=70;
			totalapagar=pagoporalumno*alumnos;
			System.out.println("El pago por alumno es: "+pagoporalumno);
			System.out.println("El total a pagar es: "+totalapagar);
		}else if(alumnos>=30){
			pagoporalumno=95;
			totalapagar=pagoporalumno*alumnos;
			System.out.println("El pago por alumno es: "+pagoporalumno);
			System.out.println("El total a pagar es: "+totalapagar);
		}else if(alumnos<=30) {
			totalapagar=4000;
			pagoporalumno=totalapagar/alumnos;
			System.out.println("El pago por alumno es: "+pagoporalumno);
			System.out.println("El total a pagar es: "+totalapagar);
		}else {
			System.out.println("Error");
		}
			
		

	}

}
