package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja  {

	public double registrarCompra(List<Facturable> productos) {
		double precioTotal = 0;
		for (Facturable producto : productos) {
			precioTotal += producto.getPrecioFinal();
			producto.procesarPago();
		}
		return precioTotal;
	} 
	



}
