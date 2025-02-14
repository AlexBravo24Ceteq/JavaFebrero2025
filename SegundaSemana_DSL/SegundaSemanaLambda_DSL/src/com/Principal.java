package com;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Son conocidas como funciones "anonimas"
		//que van a implementar un metodo declarado
		//de una interface funcional
		//El operado es ->
		//Y la sintaxis es la sig
		//(parametros) -> {cuerpo de lambda}
		
		//Ej. de escribir un metodo con el uso de expresiones Lambda
		IMetodo calcSumar = (x,y) -> System.out.println(x+y);

		//Una vez ya lo tenemos escrito nuestro metodo, podemos utilizarlo
		//a traves del objeto
		calcSumar.operacion(11, 8);
		
		//Ej. puedo crear otro objeto que me permita utilizar
		//este metodo pero para realizar multiplicaciones
		IMetodo calcMulti =(c,d) ->System.out.println(c*d);
		
		calcMulti.operacion(5, 6);
	}

}
