package ar.edu.unq.po2.tp5;

public class Mascota extends SerVivo {
	private String raza;

	public Mascota(String nombre, String raza) {
		super(nombre);
		this.setRaza(raza);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
