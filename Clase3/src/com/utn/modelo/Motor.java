package com.utn.modelo;

public class Motor {

	public String getNumSerie() {
		return numSerie;
	}

	private long cc;
	private String combustible;
	private String numSerie;

	public long getCc() {
		return cc;
	}

	public void setCc(long cc) {
		this.cc = cc;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public Motor(long cc, String combustible) {
		this.cc = cc;
		this.combustible = combustible;
	}

	// sobrecarga de constructores
	// el mismo contrato pero distinta firma
	public Motor(String combustible, long cc) {
		this.cc = cc;
		this.combustible = combustible;
	}

	// sobre carga con 2 string
	public Motor(String numMotor, String combustible) {
		this.numSerie = numMotor;
		this.combustible = combustible;
	}

	// sobre carga de constructor vacio
	public Motor() {
		// TODO Auto-generated constructor stub
	}
}
