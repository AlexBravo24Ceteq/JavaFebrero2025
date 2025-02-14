package com;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Son tambien conocidas como funciones "anonimas"
		//que van a implementar un metodo declarado
		//de una interface funcional
		//El operador es ->
		//Y la sintaxis es la sig.
		//(parametros) -> {cuerpo Lambda};
		
		//Ej. de escribir un metodo con el uso de las expresiones Lambda
		IMetodo calcSumar = (x,y) -> System.out.println(x+y);
		
		//Una vez ya lo tenemos escrito nuestro metodo, podemos utilizarlos
		//a traves del objeto
		calcSumar.operacion(11,8);
		
		//Ej. puedo crear otro objeto que me permita utilizar
		//este metodo para realizar multiplicaciones
		IMetodo calcMulti = (c,d) -> System.out.println(c*d);
		calcMulti.operacion(5, 6);

	}

}
