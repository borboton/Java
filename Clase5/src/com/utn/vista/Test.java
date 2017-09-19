package com.utn.vista;

import com.utn.contenedor.Contexto;
import com.utn.controlador.MartilleroControlador;
import com.utn.modelo.Inmueble;
import com.utn.modelo.TipoInmueble;
import com.utn.modelo.Zona;

public class Test {

	public static void main(String[] args) {

		 
		 MartilleroControlador mc = new MartilleroControlador(Contexto.creoMartillero("Axel", "Berlot"));
		 Inmueble casa = Contexto.creoInmueble(TipoInmueble.CASA);
		 casa.setZona(Zona.ZONA_NORTE);
		 casa.calculoValorVenta(Zona.ZONA_NORTE);
		 mc.ventaInmueble(casa, Contexto.creoCliente("Amilcar", "Arbolito", 30000, true));
	}

}
