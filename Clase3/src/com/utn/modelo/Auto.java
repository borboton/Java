package com.utn.modelo;

public class Auto extends Vehiculo {

	private boolean luneta;
	
	public Auto(Motor motor) {
		super(motor);
	}

	public Auto(Motor motor, String marca, String modelo) {
		super(motor, marca, modelo);
	}

	
	public Auto(Motor motor, String marca, String modelo, boolean luneta) {
		super(motor, marca, modelo);
		this.luneta=luneta;
	}

	public boolean isLuneta() {
		return luneta;
	}

	public void setLuneta(boolean luneta) {
		this.luneta = luneta;
	}

	
	
}
