package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Mascota;
import ar.edu.unq.po2.tp5.Persona;
import ar.edu.unq.po2.tp5.SerVivo;

public class PersonasYMascotasTestCase {
	@Test
	public void coleccionarPersonaYMascota() {
		Persona persona1 = new Persona("Pepe", null);
		Persona persona2 = new Persona("Jose", null);
		Mascota masco1 = new Mascota("Nala", "Beagle");
		Mascota masco2 = new Mascota("Felipe", "Boxer");

		List<SerVivo> seresVivos = new ArrayList<>();

		seresVivos.add(persona1);
		seresVivos.add(persona2);
		seresVivos.add(masco1);
		seresVivos.add(masco2);
		for (SerVivo serVivo : seresVivos) {
			System.out.println(serVivo.getNombre());
		}

	}
}
