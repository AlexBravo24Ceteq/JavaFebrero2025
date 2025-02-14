package com;

public class MedotosString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String fecha = "hoy estamos a febrer 4 del 2025";
		
		System.out.println("probando metodo leng");
		System.out.println(fecha.length());
		int conteo = fecha.length();
		System.out.println(fecha.charAt(0));
		System.out.println(fecha.substring(4));
		System.out.println(fecha.substring(4,10));
		System.out.println(fecha.toUpperCase());
		
		
		System.out.println("probando metodo .equals()");

		System.out.println(fecha.equals("hoy estamos a febrer 4 del 2025"));
		System.out.println(fecha.equalsIgnoreCase("Hoy estamos a febrer 4 del 2025"));

		System.out.println(fecha.contains("4"));
		System.out.println(fecha.replace("1", "0"));
	}

}
