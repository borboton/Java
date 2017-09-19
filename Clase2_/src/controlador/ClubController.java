package controlador;

import java.util.ArrayList;
import modelo.Jugador;
 

public class ClubController {

	private String nombreClub;
	private String entrenador;
	private ArrayList <Jugador> jugadoresList;
	
	public ClubController(){
		jugadoresList = new ArrayList <Jugador>();
	}
	
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public String getNombre() {
		return nombreClub;
	}
	public void setNombre(String nombreClub) {
		this.nombreClub = nombreClub;
	}
	public ArrayList<Jugador> getJugador() {
		return jugadoresList;
	}
	public void addJugador(Jugador j) {
		
		jugadoresList.add(j);
	}
	

	public void Listar() {
		
		for(Jugador tmp:jugadoresList) {
			
			System.out.println(tmp.toString());
		}
	}

	
}

/*	
private String nombre;  
private String apellido;
private String posicion;
private boolean titular;
*/
