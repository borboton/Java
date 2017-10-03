package modelo;

public class Causas {
	
	private String causa;
	private String medicacion;

	public Causas(String causa, String medicacion){	
		this.setCausa(causa); 
		this.setMedicacion(medicacion);
	}

	public String getMedicacion() {
		return medicacion;
	}

	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

}
