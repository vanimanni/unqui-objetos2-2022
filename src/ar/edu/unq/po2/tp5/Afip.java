package ar.edu.unq.po2.tp5;

public class Afip implements Agencia {

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Se registro en AFIP el pago de: " + factura.getPrecioFinal());

	}

}
