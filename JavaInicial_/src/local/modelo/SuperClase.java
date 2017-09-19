package local.modelo;

public class SuperClase {

	private int varInstancia;

	// Es necesario proporcionar el constructor por defecto,que
	// es aquel que no tiene parametros de llamada

	public SuperClase(){
		
		// Constructor vacio
	}

	// Este es el constructor parametrizado de la superclase
	// sobrecargado 

	public SuperClase( int pDato ) {
	
		System.out.println( "Dentro del constructor de la SuperClase" ); 
		varInstancia = pDato; 
	
	}

	public void verVarInstancia() {
		
		System.out.println( "El Objeto contiene " + varInstancia );
	
	}


}
