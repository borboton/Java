package com.utn.modelo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Inmueble {
	private int cantAmbientes;
	private double metrosCuadrados;
	private String[] servicios;
	private Zona zona;
	private double valor;

	public Inmueble(int cantAmbientes, double metrosCuadrados, String[] servicios, double valor) {
		super();
		this.cantAmbientes = cantAmbientes;
		this.metrosCuadrados = metrosCuadrados;
		this.servicios = servicios;
		this.valor = valor;
	}

	public Inmueble() {
		this.servicios = new String[3];
		this.valor = 20000;
	}

	public void calculoValorAlquiler(Zona zona) {
		switch (zona) {
		case CAPITAL_FEDERAL:
			valor = (valor * metrosCuadrados) * 1.50;
			break;
		case ZONA_NORTE:
			valor = (valor * metrosCuadrados) * 1.50;
			break;
		case ZONA_OESTE:
			valor = (valor * metrosCuadrados) * 1.50;
			break;
		case ZONA_SUR:
			valor = (valor * metrosCuadrados) * 1.50;
			break;
		}
	}

	public void calculoValorVenta(Zona zona) {
		switch (zona) {
		case CAPITAL_FEDERAL:
			valor = (valor * metrosCuadrados) * 1.50;
			break;
		case ZONA_NORTE:
			valor = (valor * metrosCuadrados) * 1.60;
			break;
		case ZONA_OESTE:
			valor = (valor * metrosCuadrados) * 1.30;
			break;
		case ZONA_SUR:
			valor = (valor * metrosCuadrados) * 1.09;
			break;
		default:
			System.out.println("no conozco la zona ameo");
			break;
		}

	}

	public int getCantAmbientes() {
		return cantAmbientes;
	}

	public void setCantAmbientes(int cantAmbientes) {
		this.cantAmbientes = cantAmbientes;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String[] getServicios() {
		return servicios;
	}

	// setServicio("luz","gas","telefono","agua");
	public void setServicios(String... servicios) {
		try {
			this.servicios = servicios;
		} catch (Exception e) {
			System.out.println("se paso de rango no se pudo agregar mas servicios");
		}
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor += valor;
	}

}
