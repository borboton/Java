package edu.utn.model;

import java.util.ArrayList;

public class Club {
	private String nombre;
	private ArrayList<Jugador> listaJugadores;

	
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.listaJugadores = new ArrayList<Jugador>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	public void addJugador(Jugador jugador) {
		this.listaJugadores.add(jugador);
	}
	
	
}
