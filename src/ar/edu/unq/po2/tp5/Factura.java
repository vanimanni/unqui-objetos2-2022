package ar.edu.unq.po2.tp5;

public abstract class Factura implements Facturable {

	private Agencia agenciaRecaudadora;

	public Factura(Agencia agenciaRecaudadora) {
		super();
		this.setAgenciaRecaudadora(agenciaRecaudadora);
	}

	public Agencia getAgenciaRecaudadora() {
		return agenciaRecaudadora;
	}

	public void setAgenciaRecaudadora(Agencia agenciaRecaudadora) {
		this.agenciaRecaudadora = agenciaRecaudadora;
	}
	
	@Override
	public void procesarPago() {
		this.getAgenciaRecaudadora().registrarPago(this);
		
	}

}
