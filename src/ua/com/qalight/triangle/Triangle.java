package ua.com.qalight.triangle;

import ua.com.qalight.abstraction.Shape;

public class Triangle implements Shape {

	private int base;
	private int heigth;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public Triangle(int base, int heigth) {
		this.base = base;
		this.heigth = heigth;
	}

	public Triangle() {

	}

	@Override
	public int getArea() {

		return base * heigth / 2;
	}

}
