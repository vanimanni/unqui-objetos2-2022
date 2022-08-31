package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {

	public int sumar(List<Integer> numeros) {
		int result = 0;
		for (Integer nro : numeros) {
			result += nro;
		}
		return result;
	}

	public int restar(List<Integer> numeros) {
		int result = 0;
		for (Integer nro : numeros) {
			result -= nro;
		}
		return result;
	}

	public int multiplicar(List<Integer> numeros) {
		int result = 1;
		for (Integer nro : numeros) {
			result *= nro;
		}
		return result;
	}

	public int restar2(List<Integer> numeros) {
		int result = 0;
		if (!numeros.isEmpty()) {
			result = numeros.get(0);
			for (int i = 1; i < numeros.size(); i++) {
				result -= numeros.get(i);
			}
		}
		return result;
	}

}
