package com.utn.modelo;

public interface IArea {

	public void circulo();

	public void cuadrado();

	public abstract void cuadrado(double lado);

	public void circulo(double diametro);
	
	public double triangulo();
	
	public boolean daResultado();
	
}
