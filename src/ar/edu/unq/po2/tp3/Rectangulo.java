package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point esquinaSuperiorIzquierda;
	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorIzquierda;
	private Point esquinaInferiorDerecha;

	public Rectangulo(Point punto, int ancho, int alto) {
		super();
		this.setEsquinaInferiorIzquierda(punto);
		this.setEsquinaSuperiorIzquierda(new Point(punto.getX(), punto.getY() + alto));
		this.setEsquinaInferiorDerecha(new Point(punto.getX() + ancho, punto.getY()));
		this.setEsquinaSuperiorDerecha(new Point(punto.getX() + ancho, punto.getY() + alto));
	}
	
	

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	private void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	private void setEsquinaSuperiorDerecha(Point esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}

	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	private void setEsquinaInferiorIzquierda(Point esquinaInferiorIzquierda) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	private void setEsquinaInferiorDerecha(Point esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	public float getArea() {
		return  this.getBase() * this.getAltura();
	}
	private float getBase() {
		return (this.esquinaSuperiorDerecha.getX() - this.esquinaInferiorIzquierda.getX());
	}
	private float getAltura() {
		return this.esquinaSuperiorIzquierda.getY() - this.esquinaInferiorIzquierda.getY();
	}

	public float getPerimetro() {
	
		return (this.getAltura() * 2) + (this.getBase() * 2);
	}

	public boolean esHorizontal() {
		
		return this.getBase() > this.getAltura();
	}

	public boolean esVertical() {
		return this.getBase() < this.getAltura();

	}
	
	
	
}
