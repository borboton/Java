package modelo;

import modelo.Veterinario;
import modelo.Causas;

public class Consultas {

	private Veterinario veterinario;
	private Causas[] causas;
    private int consultas;
	
	public Consultas(Veterinario veterinario) {
		this.veterinario = veterinario;
		this.causas = new Causas[10];
	}
	
	public Consultas() {	
	}
	
	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	
	public void setCausas(Causas causas) {
		try {
			this.causas[consultas] = causas;
			consultas++;  
		} catch (Exception e) {
			System.out.println("Limite de consultas" );
		} 
	}

	public Causas[] getCausas() {
		return causas;
	}
	
}
