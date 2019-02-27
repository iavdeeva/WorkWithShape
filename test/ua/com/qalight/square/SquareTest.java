package ua.com.qalight.square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testGetAreaWithZero() {
		Square square = new Square(0);
		assertNotNull(square.getArea());
		assertEquals(0, square.getArea());
	}	
		@Test
		void testGetAreaWithOne() {
			Square square = new Square(1);
			assertNotNull(square.getArea());
			assertEquals(1, square.getArea());
		}
		
		@Test
		void testGetAreaWithTen() {
			Square square = new Square(10);
			assertNotNull(square.getArea());
			assertEquals(100, square.getArea());
	}

}
