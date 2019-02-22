package ua.com.qalight.circle;

import ua.com.qalight.abstraction.AbstractShape;

public class Circle extends AbstractShape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(int radius) {

		this.radius = radius;
	}

	public Circle() {

	}

	@Override
	public int getArea() {

		return (int) (radius * radius * Math.PI);
	}
}
