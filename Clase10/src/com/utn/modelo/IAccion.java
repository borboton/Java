package com.utn.modelo;

public interface IAccion extends IMagia,IArea {

	//esto solo pasa a partir de la JDK 8
	public default void correr() {
		System.out.println("estoy corriendo");
	}
	public void saltar(Mamifero mami);
	
}
