package com.utn.controlador;

import com.utn.modelo.Buzo;
import com.utn.modelo.Pantalon;
import com.utn.modelo.Prenda;
import com.utn.modelo.Remera;
import com.utn.modelo.transaciones.Pedido;
import com.utn.modelo.venta.Cliente;
import com.utn.modelo.venta.Minorista;

public class PedidoControlador {

	public void armoPedido() {
		Cliente cliente1 = new Minorista("Ariel", 1234, 43000.0);
		Pedido p1 = new Pedido(cliente1);
		p1.agregoPrenda(new Remera("M", "Rojo", 1234, 500));
		p1.agregoPrenda(new Pantalon("XL", "Azul", 00123, 800));
		p1.agregoPrenda(new Buzo("L", "Lila Pastel", 123124, 1200));
		double total = totalAPagar(p1);
		System.out.println("Total a pagar : " + total);

		cobrar(cliente1, total);

	}

	private double totalAPagar(Pedido pedido) {
		double total = 0;

		for (Prenda item : pedido.devuelvoLista()) {
			total += item.getPrecio();
		}

		return total;
	}

	private void cobrar(Cliente c, double totalAPagar) {
		if (c.getDinero() >= totalAPagar) {
			double resultado = c.getDinero() - totalAPagar;
			System.out.println("La persona paga: " + totalAPagar + " su dinero es de " + c.getDinero() + " ha pagado: "
					+ resultado);
			c.setDinero(resultado);
			System.out.println("Ahora el cliente tiene: " + c.getDinero() + " $");
		} else {
			System.out.println("Disculpe no tenes plata raton!");
		}
	}

}
