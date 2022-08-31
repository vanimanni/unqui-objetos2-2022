package ar.edu.unq.po2.tp5;

public class Municipio implements Agencia {

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Se registro en MUNICIPIO el pago de: " + factura.getPrecioFinal());

	}

}
