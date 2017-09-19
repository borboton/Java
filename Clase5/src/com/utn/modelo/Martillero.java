package com.utn.modelo;

public class Martillero {
	private String nombre;
	private String apellido;
	private double comision;
	private Inmueble[] inmueblesVendidos;
	private int cantInmuebles;
	

	public Martillero(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Inmueble[] getInmueblesVendidos() {
		return inmueblesVendidos;
	}

	public void setInmueblesVendidos(Inmueble inmueblesVendidos) {
		try {
			this.inmueblesVendidos[cantInmuebles] = inmueblesVendidos;
			cantInmuebles++;
			
		} catch (Exception e) {
			System.out.println("señor no puede vender mas inmuebles ameo!");
		} 
	}

	public Martillero() {
		this.inmueblesVendidos= new Inmueble[5];
		this.cantInmuebles=0;
	}
	
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

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

	public Martillero(String nombre, String apellido, double comision, Inmueble[] inmueblesVendidos,
			int cantInmuebles) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.comision = comision;
		this.inmueblesVendidos = inmueblesVendidos;
		this.cantInmuebles = cantInmuebles;
	}

}
