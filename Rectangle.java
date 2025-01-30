package br.pe.tlrcampos.entities;

public class Rectangle {

	private Double width;
	private Double height;

	public Rectangle() {
	}

	public Rectangle(Double width, Double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Double area() {
		return width * height;
	}

	public Double perimeter() {
		return 2 * width + 2 * height;
	}

	public Double diagonal() {
		Double a = Math.pow(width, 2);
		Double b = Math.pow(height, 2);
		return Math.sqrt(a + b);
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle: width=" + String.format("%.2f", width) + ", height=" + String.format("%.2f", height)
				+ ", area= " + String.format("%.2f", this.area()) + ", perimeter="
				+ String.format("%.2f", this.perimeter()) + ", diagonal=" + String.format("%.2f", this.diagonal());
	}

}
