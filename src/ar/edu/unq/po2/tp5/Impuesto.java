package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {

	public Impuesto(Agencia recaudadora) {
		super(recaudadora);
	}

	private static double TASA_FIJA = 100f;

	@Override
	public double getPrecioFinal() {
		return TASA_FIJA;
	}

}
