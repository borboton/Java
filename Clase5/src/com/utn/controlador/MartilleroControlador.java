package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.modelo.Inmueble;
import com.utn.modelo.Martillero;

public class MartilleroControlador {

	// IoC
	// Invertion of Control (( patron de diseño))
	private Martillero martillero;

	// la instancia viene cuando se inicializa la clase
	public MartilleroControlador(Martillero martillero) {
		this.martillero = martillero;
	}

	public void ventaInmueble(Inmueble inmueble, Cliente cliente) {
		try {
			if (inmueble.getValor() < cliente.getDinero()) {
				this.martillero.setInmueblesVendidos(inmueble);
				System.out.println("Felicidades señor " + cliente.getNombre() + " ha comprado un inmueble en "
						+ inmueble.getZona());
			} else {
				System.out.println("pobreton no te da la nasta");
			}

		} catch (Exception e) {
			System.out.println("Señor hubo un error " + e.getMessage());
		}

	}
}
