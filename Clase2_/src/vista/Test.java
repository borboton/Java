package vista;

import modelo.Jugador;
import modelo.Entrenador;
import controlador.ClubController;



public class Test {

	public static void main(String[] args) {

		Jugador j1 = new Jugador("Marce1", "Arena1","Delantero1",false);
		Jugador j2 = new Jugador("Marce2", "Arena2","Delantero2",false);
		Jugador j3 = new Jugador("Marce3", "Arena3","Delantero3",false);
		Jugador j4 = new Jugador("Marce4", "Arena4","Delantero4",false);

		ClubController c = new ClubController();

		c.setNombre("Cebollitas");
		c.setEntrenador("Roberto");
		c.addJugador(j1);	
		c.addJugador(j2);
		c.addJugador(j3);
		c.addJugador(j4);
		
		System.out.println("Jugadores del Club: " + c.getNombre());
		System.out.println("DT: " + c.getEntrenador());
		c.Listar(); 

	}

}
