package com.utn.modelo;

public class Persona  {

	private String nombre ;
	private String apellido ;
	private int dni;
	private double peso;
	private boolean fuma;
	private boolean deporte;
	private int edad;

	//creo constructor
	//visibilidad nombre De la clase(parametros....) 
	public Persona(String nombre, String apellido, int dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}
	
	
	//metodo comun
	//visibilidad tipo nombre (parametros....)
	public void dormir(int cantHoras) {
		System.out.println("la persona durmio " + cantHoras);
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	

	public String getApellido() {
		return apellido;
	}


	public int getDni() {
		return dni;
	}


	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean getFuma() {
		return fuma;
	}

	public void setFuma(boolean fuma) {
		this.fuma = fuma;
	}

	public boolean getDeporte() {
		return deporte;
	}

	public void setDeporte(boolean deporte) {
		this.deporte = deporte;
	}

}
