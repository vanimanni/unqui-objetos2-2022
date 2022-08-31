package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class ProductoCooperativaTestCase {
	@Test
	public void creacionDeProducto() {
		ProductoCooperativa azucar = new ProductoCooperativa(90, 10);
		assertEquals(10, azucar.getStock());
		assertEquals(90d, azucar.getPrecioBase());
		assertEquals(11f, azucar.getIva());
		assertEquals(99.9d, azucar.getPrecioFinal());
	}

}
