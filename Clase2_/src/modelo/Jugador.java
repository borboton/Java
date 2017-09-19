package modelo;

public class Jugador {

	private String nombre; 
	private String apellido;
	private String posicion;
	private boolean titular;
	
	public Jugador(String nombre, String apellido, String posicion, boolean titular) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.titular = titular;
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
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public boolean isTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", titular="
				+ titular + "]";
	} 
	
	
	/*
	public String toString() {
		return this.getNombre();
	}*/
	
	
	
}
