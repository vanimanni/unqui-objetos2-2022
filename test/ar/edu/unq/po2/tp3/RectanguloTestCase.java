package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectanguloTestCase {
	// crear un rectangulo que sea consistente

	@Test
	public void createRectangulo() {
		Point punto = new Point(1, 5);
		Rectangulo rectangulo = new Rectangulo(punto, 3, 2);

		// Assert de Esquina Inferior Izquierda
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getX(), 1, 0);
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getY(), 5, 0);

		// Assert de Esquina Superior Izuierda
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getX(), 1, 0);
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getY(), 7, 0);

		// Assert de Esquina Inferior Derecha
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getX(), 4, 0);
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getY(), 5, 0);

		// Assert de Esquina Superior Derecha
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getX(), 4, 0);
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getY(), 7, 0);

	}
	@Test
	public void areaRectangulo() {
		Point punto = new Point(1, 5);
		Rectangulo rectangulo = new Rectangulo(punto, 3, 2);
		assertEquals(rectangulo.getArea(), 6,0);			
	}
	@Test
	public void perimetroRectangulo() {
		Point punto = new Point(1, 5);
		Rectangulo rectangulo = new Rectangulo(punto, 3, 2);
		assertEquals(rectangulo.getPerimetro(), 10, 0);
	}
	@Test
	public void esHorizontalTest() {
		Point punto = new Point(1, 5);
		Rectangulo rectangulo = new Rectangulo(punto, 3, 2);
		assertTrue(rectangulo.esHorizontal());
	}
	@Test
	public void esVerticalTest() {
		Point punto = new Point(1, 5);
		Rectangulo rectangulo = new Rectangulo(punto, 3, 6);
		assertTrue(rectangulo.esVertical());
	}
}