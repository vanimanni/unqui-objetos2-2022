package ar.edu.unq.po2.tp4;

public class IngresoPercibido {

	private String mes;
	private String concepto;
	private int monto;

	public IngresoPercibido(String mes, String concepto, int monto) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;

	}

	public int getMonto() {
		return monto;
	}

	public int getMontoImponible() {
		return this.getMonto();
	}

}
