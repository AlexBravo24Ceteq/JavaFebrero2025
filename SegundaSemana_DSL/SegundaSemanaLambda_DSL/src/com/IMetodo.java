package com;

//Esta es una anotacion que me permite identificar una interface
//funcional y asu vez de esta manera la obliga a tener solo un
//Metodo declarado
@FunctionalInterface
public interface IMetodo {

	//Interface funcional
	//Vamos a crear una interface funcional es aquella que solo tiene un metodo declarado
	//De esta manera esta interface puede ser utilizada para expresiones Lambda
	
	public void operacion(int a,int b);
	
}
