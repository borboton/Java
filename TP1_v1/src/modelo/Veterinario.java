package modelo;

public class Veterinario {
	private String nombre;
	private Animal[] animalAtendido;
	private int cant;

	public Veterinario(String nombre) { 
		this.nombre = nombre;
		this.animalAtendido = new Animal[5];
		this.cant=0;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAnimalAtendido(Animal animalAtendido) {
		try {
			this.animalAtendido[cant] = animalAtendido;
			cant++;  
		} catch (Exception e) {
			System.out.println("Supero el limite de animales atendidos por doctor" );
		} 
	}

	public Animal[] getAnimalAtendido() {
		return animalAtendido;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

}
