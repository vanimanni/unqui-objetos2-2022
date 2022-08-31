package ar.edu.unq.po2.tp3;

//Realice una función que reciba dos valores X e Y, y devuelva el número más alto entre 0 y 1000, que sea
//múltiplo simultáneamente de X e Y. Si no existe, devolver -1. Por ejemplo si se ingresa 3 y 9, la función debe
//devolver 999.
public class Multiplos {
	public int valorMasAltoMultiplo(int x, int y) {
		int multiploMax = -1;
		for (int i = 1; i <= 1000; i++) {
			if (esMultiplo(i,x,y)) {
				multiploMax = i;
			}
		}
		
		return multiploMax;

	}

	private boolean esMultiplo(int i, int x, int y) {
		
		return i % x == 0 && i % y == 0;
	}
}