package com.utn.modelo.exception;

public class MiException extends Exception {

	private static final long serialVersionUID = 1L;
	private String mensaje;


	public MiException(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void muestroMensajeError() {
		System.out.println(this.mensaje);
	}

}
