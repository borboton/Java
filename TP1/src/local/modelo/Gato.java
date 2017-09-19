package local.modelo;

public class Gato extends Animal {

	public Gato() {
		
	}
	
	public Gato(String nombre, String tipo, String raza, int edad) {
		super(nombre, tipo, raza, edad);
		 
	}
	
	@Override
	public void roar() 
	{
		System.out.println("miau...");
	}

}
