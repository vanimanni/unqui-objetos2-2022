package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends IngresoPercibido {
	private int cantidadDeHoras;
	
	public IngresoPorHorasExtras(String mes, String concepto, int monto, int cantidadDeHoras){
		super(mes, concepto, monto);
		this.setCantidadDeHoras(cantidadDeHoras);
	}

	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}

	public void setCantidadDeHoras(int cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	}
	
	@Override
	public int getMontoImponible() {
		return 0;
	}
	
}
