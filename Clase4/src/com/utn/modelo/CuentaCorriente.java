package com.utn.modelo;

import com.utn.modelo.exception.MiException;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int numero, double saldo, double descubierto, Cliente cliente) {
		super(numero, saldo, descubierto, cliente);
	}

	public void retiroDescubierto(double dinero)throws MiException {
		System.out.println("-->"+ super.getDescubierto());
		if(super.getDescubierto() > -1000) {
			super.setDescubierto(super.getDescubierto() - dinero);
			System.out.println(" retiro " + dinero);
		}else {
			throw new MiException("Señor no puedo regalarle mas dinero");
		}
		//lo que sigue no se ejecute
		System.out.println("Fin del metodo retiro descubierto");
	}
	
	
}
