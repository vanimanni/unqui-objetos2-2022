package ar.edu.unq.po2.tp5;

public class Producto implements Facturable {
	private double precioBase;
	private double iva;
	private int stock;

	public Producto(double precioBase, int stock) {
		super();
		this.precioBase = precioBase;
		this.stock = stock;
		this.iva = 21;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public double getPrecioFinal() {
		return this.getPrecioBase() * (1 + this.getIva() / 100);
	}

	public void disminuirStock() {
		this.stock--;

	}

	@Override
	public void procesarPago() {
		this.disminuirStock();

	}

}
