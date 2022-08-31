package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {

	ArrayList<Integer> numeros;

	Multioperador multioperador;

	@BeforeEach
	public void setUp() {
		numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(4);
		numeros.add(3);
		multioperador = new Multioperador();
	}

	@Test
	public void sumarTest() {

		assertEquals(8, multioperador.sumar(numeros));
	}

	@Test
	public void restarTest() {

		assertEquals(-8, multioperador.restar(numeros));
	}

	@Test
	public void multiplicarTest() {

		assertEquals(12, multioperador.multiplicar(numeros));
	}
	
	@Test
	public void restar2Test() {

		assertEquals(-6, multioperador.restar2(numeros));
	}
	
}
