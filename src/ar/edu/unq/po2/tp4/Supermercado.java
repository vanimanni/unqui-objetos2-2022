package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}

	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);

	}

	public Double getPrecioTotal() {
		return this.productos.stream().map(x -> x.getPrecio()).reduce(0d, Double::sum);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
