package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplosTestCase {

	@Test
	public void testOK() {
		Multiplos multiplos = new Multiplos();
		assertEquals(multiplos.valorMasAltoMultiplo(3, 9), 999);

	}
	
	@Test
	public void testFail() {
		Multiplos multiplos = new Multiplos();
		assertEquals(multiplos.valorMasAltoMultiplo(34, 67), -1);

	}

}
