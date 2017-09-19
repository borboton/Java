package com.utn.contenedor;

import javax.swing.DebugGraphics;

import com.utn.modelo.Casa;
import com.utn.modelo.Cliente;
import com.utn.modelo.Departamento;
import com.utn.modelo.Inmueble;
import com.utn.modelo.Lote;
import com.utn.modelo.Martillero;
import com.utn.modelo.PH;
import com.utn.modelo.TipoInmueble;

public class Contexto {

	// IoC Inversion de controles ( patron de diseño estructural)

	public static Cliente creoCliente(String nombre, String apellido, double dinero, boolean trabaja) {

		return new Cliente(nombre, apellido, dinero, trabaja);
	}

	public static Inmueble creoInmueble(TipoInmueble imueble) {

		switch (imueble) {
		case CASA:
			return new Casa();
		case DEPARTAMENTO:
			return new Departamento();
		case PH:
			return new PH();
		case LOTE:
			return new Lote();
		}
		return null;
	}
	
	public static Martillero creoMartillero(String nombre, String apellido) {
		return new Martillero(nombre, apellido);
	}

}
