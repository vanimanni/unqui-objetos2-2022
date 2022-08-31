package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Afip;
import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Facturable;
import ar.edu.unq.po2.tp5.Impuesto;
import ar.edu.unq.po2.tp5.Municipio;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.Servicio;

public class CajaTestCase {
	private List<Facturable> listaDeProductos = new ArrayList<Facturable>();

	@Test
	public void compraRealizada() {
		Caja cajaDeCobro = new Caja();

		Producto leche = new Producto(110d, 4);
		ProductoCooperativa azucar = new ProductoCooperativa(90, 10);
		listaDeProductos.add(leche);
		listaDeProductos.add(azucar);

		assertEquals(233, cajaDeCobro.registrarCompra(listaDeProductos));
		assertEquals(3, leche.getStock());
		assertEquals(9, azucar.getStock());

	}

	@Test
	public void pagarTodo() {
		Afip afip = new Afip();
		Municipio municipio = new Municipio();
		Caja cajaDeCobro = new Caja();
		Servicio luz = new Servicio(afip, 200, 100);
		Impuesto municipal = new Impuesto(municipio);

		Producto leche = new Producto(110d, 4);
		ProductoCooperativa azucar = new ProductoCooperativa(90, 10);
		listaDeProductos.add(leche);
		listaDeProductos.add(azucar);
		listaDeProductos.add(municipal);
		listaDeProductos.add(luz);

		assertEquals(20333, cajaDeCobro.registrarCompra(listaDeProductos));
		assertEquals(3, leche.getStock());
		assertEquals(9, azucar.getStock());

	}
}
