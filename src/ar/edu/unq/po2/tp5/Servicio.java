package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	private int costoPorUnidad;
	private int cantidadDeUnidadesConsumidas;

	public Servicio(Agencia recaudadora, int costoPorUnidad, int cantidadDeUnidadesConsumidas) {
		super(recaudadora);
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}

	public int getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(int costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public int getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}

	public void setCantidadDeUnidadesConsumidas(int cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}

	@Override
	public double getPrecioFinal() {
		// TODO Auto-generated method stub
		return this.costoPorUnidad * this.cantidadDeUnidadesConsumidas;
	}

}
