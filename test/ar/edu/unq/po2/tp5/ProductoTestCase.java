package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Producto;

public class ProductoTestCase {

	@Test
	public void creacionDeProducto() {
		Producto leche = new Producto(110d, 4);
		assertEquals(4, leche.getStock());
		assertEquals(110d, leche.getPrecioBase());
		assertEquals(21f, leche.getIva());
		assertEquals(133.1d, leche.getPrecioFinal());

	

		
	}
}
