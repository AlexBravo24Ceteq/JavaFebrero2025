package com;


public class CiclosAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int hora =0; hora<24; hora++) {
			for(int min = 0; min<60 ; min ++) {
				for(int seg = 0; seg<60; seg++) {
					
					System.out.println(hora +" : "+ min +" : "+ seg);
				}
			}
		}
	}

}
