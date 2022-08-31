package ar.edu.unq.po2.tp3;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class CuadradoTestCase {
	
	
	@Test
	public void createCuadrado() {
		Point punto = new Point(1, 5);
		Cuadrado cuadrado = new Cuadrado(punto, 3);

		// Assert de Esquina Inferior Izquierda
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getX(), 1, 0);
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getY(), 5, 0);

		// Assert de Esquina Superior Izuierda
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getX(), 1, 0);
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getY(), 8, 0);

		// Assert de Esquina Inferior Derecha
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getX(), 4, 0);
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getY(), 5, 0);

		// Assert de Esquina Superior Derecha
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getX(), 4, 0);
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getY(), 8, 0);

	}
	@Test
	public void areaCuadrado() {
		Point punto = new Point(1, 5);
		Cuadrado cuadrado = new Cuadrado(punto, 3);
		assertEquals(cuadrado.getArea(), 9,0);			
	}
	@Test
	public void perimetroCuadrado() {
		Point punto = new Point(1, 5);
		Cuadrado cuadrado = new Cuadrado(punto, 3);
		assertEquals(cuadrado.getPerimetro(), 12, 0);
	}

}
