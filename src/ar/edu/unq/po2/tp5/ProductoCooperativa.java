package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(double precioBase, int stock) {
		super(precioBase, stock);
		this.setIva(11f);
	}

}
