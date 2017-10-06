package com.utn.modelo;

public abstract class Prenda {

	private String talle;
	private String color;
	private int codigo;
	private double precio;

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Prenda() {
		// TODO Auto-generated constructor stub
	}

	public Prenda(String talle, String color, int codigo, double precio) {
		super();
		this.talle = talle;
		this.color = color;
		this.codigo = codigo;
		this.precio = precio;
	}

}
