package modelo;

import modelo.Animal;

public class VeterinariaControlador {



	
	public Animal atiendoAnimal(AnimalTipo animal) {
		
		switch (animal) {
		case PERRO:
			
			new Animal("Brujo", AnimalTipo.PERRO);
			System.out.println("Creo objeto Animal Perro");
			break;

		case GATO: 
			new Animal("Milo", AnimalTipo.GATO);
		break;
		
		case CONEJO:
			new Animal("Conejo", AnimalTipo.CONEJO);
		default:
			break;
		}
		return null;
		
	}
	
	

	
	
}
