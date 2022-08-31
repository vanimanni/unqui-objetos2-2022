package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrabajadorTestCase {

	@Test
	public void testTotalPercibido() {
		IngresoPercibido ingreso = new IngresoPercibido("Abril", "Honorarios", 30000);
		Trabajador trabajador = new Trabajador();
		assertEquals(0, trabajador.getTotalPercibido());
		trabajador.agregarIngresoPercibido(ingreso);
		assertEquals(30000, trabajador.getTotalPercibido());
		
	
	}
	@Test
	public void testGetMontoImponible() {
		IngresoPercibido ingreso = new IngresoPercibido("Abril", "Honorarios", 30000);
		Trabajador trabajador = new Trabajador();
		assertEquals(0, trabajador.getMontoImponible());
		trabajador.agregarIngresoPercibido(ingreso);
		assertEquals(30000, trabajador.getMontoImponible());
		IngresoPorHorasExtras horasExtras = new IngresoPorHorasExtras("enero", "horasExtras", 2000, 2);
		trabajador.agregarIngresoPercibido(horasExtras);
		assertEquals(30000, trabajador.getMontoImponible());
		
	}
	
	@Test
	public void testGetImpuestoAPagar() {
		IngresoPercibido ingreso = new IngresoPercibido("Abril", "Honorarios", 30000);
		Trabajador trabajador = new Trabajador();
		trabajador.agregarIngresoPercibido(ingreso);
		assertEquals(600d, trabajador.getImpuestoAPagar());
	
		
	}
	
}
