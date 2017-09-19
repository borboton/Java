package com.utn.controlador;

import com.utn.modelo.Persona;

//IoC (dsps del break)
public class Contenedor {
	
	
	private Persona persona;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public void muestroObjetoPersona() {
		System.out.println(persona.getNombre());
		
		System.out.println("modifico el nombre");
//		persona.setNombre("No tiene segundo nombre");
		System.out.println(persona.getNombre());
	}
	
	
}
