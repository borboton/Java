package edu.utn.view;

import edu.utn.model.Club;
import edu.utn.model.Jugador;

public class Test {

	public static void main(String[] args) {
	
		Club club1 = new Club("Argentinos Jrs");
		
		club1.addJugador(new Jugador("Nombre1","Apellido1", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre2","Apellido2", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre3","Apellido3", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre4","Apellido4", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre5","Apellido5", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre6","Apellido6", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre7","Apellido7", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre8","Apellido8", true, "Posicion1"));
		club1.addJugador(new Jugador("Nombre9","Apellido9", true, "Posicion1"));
		
		for (Jugador jugador : club1.getListaJugadores()) {
			System.out.println(jugador);
		}
		
		System.out.println("--------------------");
		
		Club club2 = new Club("River Plate");
		
		club2.addJugador(new Jugador("NombreRiver1","Apellido1", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver12","Apellido2", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver13","Apellido3", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver14","Apellido4", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver15","Apellido5", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver16","Apellido6", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver17","Apellido7", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver18","Apellido8", true, "Posicion1"));
		club2.addJugador(new Jugador("NombreRiver19","Apellido9", true, "Posicion1"));
	
		for (Jugador jugador : club2.getListaJugadores()) {
			System.out.println(jugador);
		}
		
	}
	
	

}
