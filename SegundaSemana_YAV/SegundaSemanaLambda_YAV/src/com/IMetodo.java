package com;

//Esta es una anotacion que me permite identificar una interface
//funcional y a su vez, de esta manera la obliga a tener solo
//UN METODO DECLARADO
@FunctionalInterface
public interface IMetodo {
	
	//Vamos a crear una inteface funcional
	//Una interface funcional es aquella que solo
	//tiene un metodo declarado
	//De esta manera esta inteface puede ser utilizada para
	//expresionesLambda
	
	public void operacion (int a, int b);
	

}
