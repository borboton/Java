package com.utn.modelo;

import com.utn.modelo.exception.MiExceptionNoControlada;

public class CajaAhorro extends Cuenta{

	private double saldoCajaAhorro;
	
	public CajaAhorro(int numero, double saldo, double descubierto, Cliente cliente) {
		super(numero, saldo, descubierto, cliente);
		this.saldoCajaAhorro += saldo;
	}

	public void depositarDinero(double dinero) throws MiExceptionNoControlada{
		this.saldoCajaAhorro += dinero;
		
		throw new MiExceptionNoControlada("Se corta directamente la app");
	}

	
	public double devuelvoSaldoCajaAhorro() {
		return this.saldoCajaAhorro;
	}

}
