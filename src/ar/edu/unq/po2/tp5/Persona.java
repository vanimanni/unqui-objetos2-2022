package ar.edu.unq.po2.tp5;

import java.util.Date;

public class Persona extends SerVivo {

	private Date fechaDeNacimiento;

	public Persona(String nombre, Date fechaDeNacimiento) {
		super(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
