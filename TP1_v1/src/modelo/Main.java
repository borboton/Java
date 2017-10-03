package modelo;

import modelo.Animal;
import modelo.Veterinario;

public class Main {

	public static void main(String[] args) {

		VeterinariaControlador vc = new VeterinariaControlador();
		
		vc.atiendoAnimal(AnimalTipo.PERRO);
		
		
		
		
		
	}
	
}


//
//Veterinario v1 = new Veterinario("Juan A");	
//
//v1.setAnimalAtendido(new Animal("Brujo", AnimalTipo.PERRO));
//v1.setAnimalAtendido(new Animal("Milo", AnimalTipo.GATO));
//v1.setAnimalAtendido(new Animal("Conejo", AnimalTipo.CONEJO));
//v1.setAnimalAtendido(new Animal("Chuletas", AnimalTipo.PERRO));
//
//Veterinario v2 = new Veterinario("Juan B");
//
//v2.setAnimalAtendido(new Animal("Chuletas", AnimalTipo.PERRO));
//
//Consultas consulta1 = new Consultas(v1);
//consulta1.setCausas(new Causas("Comida en mal estado", "Aspirina"));
//
//System.out.println("Vete: " + v1.getNombre() + " Mascotas atendidas: " + v1.getCant());
//System.out.println("Vete: " + v2.getNombre() + " Mascotas atendidas: " + v2.getCant());
