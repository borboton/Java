package com.utn.modelo;

public class Vehiculo {

	private Motor motor;
	private String marca;
	private String modelo;

	public Vehiculo(Motor motor) {
		this.motor = motor;
	}

	public Vehiculo(Motor motor, String marca, String modelo) {
		this.motor = motor;
		this.marca = marca;
		this.modelo = modelo;
	}

	public boolean encender(boolean llave) {
		
		return llave;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
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

	public void acelerar() {
		System.out.println("Estoy acelerando");
	}

	public void frenar() {
		System.out.println("estoy frenando");
	}
}
