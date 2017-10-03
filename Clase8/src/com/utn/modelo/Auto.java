package com.utn.modelo;

public class Auto extends Vehiculo {

	public void doblar() {
		System.out.println("giro para ambos sentidos");
	}
	@Override                   
	public void encender(Motor motor) {
		System.out.println("voy a encender el auto con un motor de tipo "+ motor.getClass().getSimpleName());
	}

	@Override
	public void apagar(String tipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub

	}

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}
	
	

}
