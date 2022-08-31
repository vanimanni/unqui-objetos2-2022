package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTestCase {
	private Persona persona1;
	private Persona persona2;
	
	@BeforeEach
	public  void setUp() throws ParseException {
		
		 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha = "06/10/1989";
		Date fecha = sdf.parse(stringFecha);
		
		stringFecha = "06/12/1988";
		Date fecha1 = sdf.parse(stringFecha);
		
		
		persona1 = new Persona("Vanina", fecha);
		persona2 = new Persona("Iacca", fecha1);
		 
		
	}
	
	@Test
	public void edadTest(){
		assertEquals(32, persona1.getEdad());
		
	}
//	1. Responder: Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u
//	obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto?	
//  NO, ningun otro objeto externo puede conocer la implementacion de edad, solo lo conoce la clase Persona. 
//	El mecanismo de abstraccion que permite esto se llama encapsulamiento.

@Test
public void esMenorQue() {
	assertTrue(persona1.menorQue(persona2));

	
}
}
