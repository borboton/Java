package com.utn.modelo;

public abstract class Vehiculo {

	/*
	 * Tiene como minimo un metodo abstracto Tambien puede tener atributos y metodos
	 * no abstractos
	 */

	// Atributos para encapsulamiento
	private String marca;
	private String modelo;
	private String color;

	
	public Vehiculo() {
	
	}

	public Vehiculo(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public abstract void apagar(String tipo);
	
	// para la sobre-carga tambien aplicar en los metodos abstractos
	public abstract void encender();
	
	public abstract void encender(Motor motor);
	
	public void tocarBocina() {
		System.out.println("pi-pi");
	}

	public void tocarBocina(String claxton) {
		System.out.println(claxton);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
