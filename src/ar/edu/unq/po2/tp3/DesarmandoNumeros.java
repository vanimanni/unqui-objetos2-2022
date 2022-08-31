package ar.edu.unq.po2.tp3;

public class DesarmandoNumeros {
	public static int mayorNumeroConDigitoPar(int[] numbers) {
		int numeroMax = numbers[0];
		Counter counter = new Counter();
		desarmarNumero(numbers[0], counter);
		int cantidadMaxPares = counter.getEvenOcurrences();
		
		for (int i = 1; i < numbers.length; i++) {
			counter = new Counter();
			desarmarNumero(numbers[i], counter);
				
			int cantidad = counter.getEvenOcurrences();
			if (cantidad > cantidadMaxPares) {
				cantidadMaxPares = cantidad;
				numeroMax = numbers[i];
			}

		}
		return numeroMax;
	}

	public static void desarmarNumero(int number, Counter counter) {
		int nroADesarmar = number;
		while (nroADesarmar > 0) {
			counter.addNumber(nroADesarmar % 10);
			nroADesarmar = nroADesarmar / 10;
		}
	}

}
