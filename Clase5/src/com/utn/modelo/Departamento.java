package com.utn.modelo;

public class Departamento extends Inmueble {

	private double expensas;

	public double getExpensas() {
		return expensas;
	}

	public void setExpensas(double expensas) {
		this.expensas = expensas;
	}

	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamento(int cantAmbientes, double metrosCuadrados, String[] servicios, double valor) {
		super(cantAmbientes, metrosCuadrados, servicios, valor);
		// TODO Auto-generated constructor stub
	}

}
