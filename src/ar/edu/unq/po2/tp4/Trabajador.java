package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<IngresoPercibido> ingresosPercibidos = new ArrayList<IngresoPercibido>();

	public Integer getTotalPercibido() {
		return this.getIngresosPercibidos().stream().map(x -> x.getMonto()).reduce(0, Integer::sum);
	}

	public void agregarIngresoPercibido(IngresoPercibido ingreso) {
		this.getIngresosPercibidos().add(ingreso);
	}

	private List<IngresoPercibido> getIngresosPercibidos() {
		return ingresosPercibidos;
	}
	public int getMontoImponible(){
		return this.getIngresosPercibidos().stream().map(x -> x.getMontoImponible()).reduce(0, Integer::sum);
	}
	public double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02;
		
	}
}
