package edu.utn.model;

public class Jugador {

	private String nombre;
	private String apellido;
	private boolean titular;
	private String posicion;
		
	public Jugador(String nombre, String apellido, boolean titular, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.titular = titular;
		this.posicion = posicion;
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
	public boolean isTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + "]";
	}
	
}
