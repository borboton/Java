package modelo;

public class Animal {

	private String nombre;
	private AnimalTipo tipo;

	public Animal() {
	}	
	
	public Animal(String nombre, AnimalTipo tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public AnimalTipo getTipo() {
		return tipo;
	}
	
	public void setTipo(AnimalTipo tipo) {

		this.tipo = tipo;	
	}


}