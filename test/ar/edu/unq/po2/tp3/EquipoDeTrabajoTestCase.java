package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTestCase {
	private Persona Micky;
	private Persona Facu;
	private Persona Nico;
	private Persona lali;
	private Persona vicky;
	private List<Persona> integrantes;

	@BeforeEach
	public void setUp() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha = "06/10/1999";
		Date fecha = sdf.parse(stringFecha);

		stringFecha = "15/05/2002";
		Date fecha1 = sdf.parse(stringFecha);
		stringFecha = "10/07/1991";
		Date fecha2 = sdf.parse(stringFecha);
		stringFecha = "10/10/1991";
		Date fecha3 = sdf.parse(stringFecha);
		stringFecha = "26/05/2000";
		Date fecha4 = sdf.parse(stringFecha);

		Micky = new Persona("Micky", fecha);
		Facu = new Persona("Facu", fecha1);
		Nico = new Persona("Nico", fecha2);
		lali = new Persona("Lali", fecha3);
		vicky = new Persona("Vicky", fecha4);
		integrantes = new ArrayList<>();
		integrantes.add(Micky);
		integrantes.add(Facu);
		integrantes.add(Nico);
		integrantes.add(lali);
		integrantes.add(vicky);
	}

	@Test
	public void equipoDeTrabajoTieneNombreYConjuntoDeIntegrantes() {
		EquipoDeTrabajo equipoTrabajo = new EquipoDeTrabajo();
		equipoTrabajo.setNombre("TeamManni");
		equipoTrabajo.setIntegrantes(integrantes);
		assertEquals("TeamManni", equipoTrabajo.getNombre());
		assertEquals(5, equipoTrabajo.getIntegrantes().size());
	}

	@Test
	public void equipoDeTrabajoConoceSuNombreYPromedioDeEdadDeSusIntegrantes() {
		EquipoDeTrabajo equipoTrabajo = new EquipoDeTrabajo();
		equipoTrabajo.setNombre("TeamManni");
		equipoTrabajo.setIntegrantes(integrantes);
		assertEquals("TeamManni", equipoTrabajo.getNombre());
		assertEquals(24, equipoTrabajo.getPromedioEdades());
		System.out.println("El promedio de edades del Equipo : " + equipoTrabajo.getNombre() + " es "
				+ equipoTrabajo.getPromedioEdades());

	}
}
