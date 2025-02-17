package com.ciclos;

import java.util.Scanner;

public class Ciclos7_RCT {

	public static void main(String[] args) {
		//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		//dinero? 
		
		System.out.println("Ciclos Problema 7");
		System.out.println("MOSTRAR ¿En cuántos meses tendrá más de $1500,");
		System.out.println("si reinvierte cada mes todo su dinero? su inversion inicial es de $700.");
		
		double inversion = 700.00;

        double intereses;

        int meses = 0;

        while (inversion <= 1500.00) {

            meses++;

            intereses = inversion * 0.02;

            System.out.println("meses: " + meses + "\n"

                    + "inversión al mes: " + String.format("%.2f", (inversion + intereses)) + "\n");

            inversion += intereses;


		
		
        }

	}

}
