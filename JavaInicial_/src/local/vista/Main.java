package local.vista;

import local.modelo.SubClase;

public class Main {

	public static void main(String[] args) {

		System.out.println("Lanzando la aplicacion");

	// Instanciamos un objeto de este tipo llamando al
	// constructor de defecto 

		Main m = new Main();

	// Llamamos a la funcion pasandole un constructor de la
	// subclase parametrizado como parametro

		m.miFuncion( new SubClase( 100 ) );
	}

	// Esta funcion recibe un objeto y llama a uno de sus metodos
	// para presentar en pantalla el dato que contiene el objeto,
	// en este caso el metodo es heredado de la SuperClase


	public void miFuncion( SubClase objeto ) {

		objeto.verVarInstancia();

	}
}

