package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTestCase {
	@Test
	public void createPoint() {
		Point punto = new Point(2,3);
		assertEquals(2, punto.getX(), 0); 
		assertEquals(3, punto.getY(), 0);
		
	}
	
	@Test
	public void createPointZero() {
		Point punto = new Point();
		assertEquals(0, punto.getX(), 0); 
		assertEquals(0, punto.getY(), 0);
		
	}
	@Test
	public void movePoint() {
		Point punto = new Point();  // primero se crea el punto en 0,0
		punto.setXY(3, 2);        // Muevo el punto a 3, 2
		assertEquals(3, punto.getX(), 0); 
		assertEquals(2, punto.getY(), 0);
		
	}
	
	@Test
	public void sumarPoints() {
		Point punto1 = new Point(1,5);
		Point punto2 = new Point(3,4);
		Point puntoSumados = punto1.sumar(punto2);
		
		
		assertEquals(4, puntoSumados.getX(), 0); 
		assertEquals(9, puntoSumados.getY(), 0);
		
		
		
	}
	
	
}
