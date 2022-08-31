package ar.edu.unq.po2.tp3;

public class Point {

	private float x, y;

	public Point(float x, float y) { // constructor de la clase
		super();
		this.setXY(x, y);
	}

	public Point() {
		this(0, 0);
	}

	public Point sumar(Point puntoASumar) {
		return new Point(this.getX() + puntoASumar.getX(), this.getY() + puntoASumar.getY());
	}

	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point punto = (Point) obj;
		return this.getX() == punto.getX() && this.getY() == punto.getY();
	}

}
