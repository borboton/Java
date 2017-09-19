package com.utn.modelo.exception;

public class MiExceptionNoControlada extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String mensaje;
	
	public MiExceptionNoControlada(String mensaje) {
		this.mensaje=mensaje;
	}
	
	public void muestroErrorNoControlador() {
		System.out.println("Error no controlado, mensaje: " + mensaje);
	}
}
