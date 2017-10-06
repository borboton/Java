package com.utn.modelo.transaciones;

import java.util.ArrayList;
import java.util.Date;

import com.utn.modelo.Prenda;
import com.utn.modelo.venta.Cliente;

public class Pedido {

	private ArrayList<Prenda> listaPrendas;
	private Cliente cliente;
	private Date fechaPedido;
	private int numPedido;
	
	public Pedido(Cliente cliente) {
		this.listaPrendas = new ArrayList<Prenda>();
		this.cliente=cliente;
		this.fechaPedido=new Date();
				
	}

	public long getFechaPedido() {
		return fechaPedido.getTime();
	}


	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	
	public void agregoPrenda(Prenda prenda) {
		this.listaPrendas.add(prenda);
	}

	public ArrayList<Prenda> devuelvoLista(){
		return this.listaPrendas;
	}

	public Prenda devuelvoPrendaXIndice(int indice) {
		return this.listaPrendas.get(indice);
	}
	
	public void quitoPrendaLista(int indice)
	{
		this.listaPrendas.remove(indice);
	}

	//ejemplo si le paso el bodoque directamente
//	public void setListaPrendas(ArrayList<Prenda> listaPrendas) {
//		this.listaPrendas = listaPrendas;
//	}
	
	
}
