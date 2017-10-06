package com.utn.modelo.venta;

public abstract class Cliente {
	private String nombre;
	private int numCliente;
	private double dinero;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public Cliente(String nombre, int numCliente, double dinero) {
		super();
		this.nombre = nombre;
		this.numCliente = numCliente;
		this.dinero = dinero;
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
}
