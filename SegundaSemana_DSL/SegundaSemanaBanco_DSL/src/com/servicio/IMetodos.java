package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	//Listado de metodos abstractos que un clase encargada debe resolver
	
	//Consultarla informacion de la cuenta de banco
	public Cuenta consultar(int numeroCuenta);
	
	//Retirar recursos de nuestra cuenta
	
	public Ticket retirar(int numeroCuenta,double monto);
	
	//Depositar recursos en nuestra cuenta
	public Ticket depositar(int numeroCuenta,double monto);
	
	
}
