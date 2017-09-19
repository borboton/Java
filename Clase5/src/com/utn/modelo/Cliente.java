package com.utn.modelo;

public class Cliente {

	public Cliente(String nombre, String apellido, double dinero, boolean trabaja) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dinero = dinero;
		this.trabaja = trabaja;
	}

	private String nombre;
	private String apellido;
	private double dinero;
	private boolean trabaja;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public boolean isTrabaja() {
		return trabaja;
	}

	public void setTrabaja(boolean trabaja) {
		this.trabaja = trabaja;
	}

}
