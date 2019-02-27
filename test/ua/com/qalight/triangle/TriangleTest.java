package ua.com.qalight.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testGetAreaWithZero() {
		Triangle triangle = new Triangle();
		assertNotNull (triangle.getArea());
		assertEquals(0, triangle.getArea());
	}	
	@Test
	void testGetAreaWithOne() {
		Triangle triangle = new Triangle();
		assertNotNull (triangle.getArea());
		assertEquals (1, triangle.getArea());
		
	}
	@Test
	void testGetAreaWithTen() {
		Triangle triangle = new Triangle();
		assertNotNull (triangle.getArea());
		assertEquals (100, triangle.getArea());
	}

}
