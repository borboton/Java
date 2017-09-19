package local.modelo;

public class SubClase extends SuperClase {

	// Este es el constructor parametrizado de la subclase

	public SubClase( int bDato ) {    
	
	// La siguiente sentencia println no compila, la llamada
	// a super() debe estar al principio de un metodo en caso de
	// que aparezca
	// System.out.println( "En el constructor de la SubClase" ); 

	// Llamamos al constructor de la superclase
	
	super( bDato );
	
		System.out.println( "Dentro del constructor de la SubClase" );
	
	}

}
