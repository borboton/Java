package com.utn.modelo;

public class Cuenta {
	
	private int numero;
	private double saldo;
	private double descubierto;
	private Cliente cliente;

	public Cuenta(int numero, double saldo, double descubierto, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.descubierto = descubierto;
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	
	
}
