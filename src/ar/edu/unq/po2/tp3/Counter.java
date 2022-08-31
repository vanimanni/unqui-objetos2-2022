package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

	public void addNumber(int numero) {

		this.listaDeNumeros.add(numero);
	}

	public int getEvenOcurrences() {

		int cantidad = 0;

		for (Integer nro : listaDeNumeros) {
			if (nro % 2 == 0)
				cantidad++;
		}
		return cantidad;
	}

	public int getOddOcurrences() {

		int cantidad = 0;

		for (Integer nro : listaDeNumeros) {
			if (nro % 2 != 0)
				cantidad++;
		}
		return cantidad;
	}

	public int getMultiplesOf(int numeroDivisor) {
		int cantidad = 0;

		for (Integer nro : listaDeNumeros) {
			if (nro % numeroDivisor == 0)
				cantidad++;
		}
		return cantidad;
	}

}
