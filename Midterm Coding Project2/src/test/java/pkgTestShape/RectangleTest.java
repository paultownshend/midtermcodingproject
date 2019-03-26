package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgShape.Rectangle;
import pkgShape.Shape;

public class RectangleTest {

	@Test
	public void rectangleTest() {
		Rectangle r = new Rectangle(2, 4);
		assertTrue(r.getiWidth() == 2);
		assertTrue(r.getiLength() == 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void rectangleTest2() {
		Rectangle r = new Rectangle(0, 5);
	}

	@Test
	public void setWidthTest() {
		int testWidth = 4;
		Rectangle r = new Rectangle(4, 3);
		r.setiWidth(testWidth);
		assertEquals(r.getiWidth(), testWidth);
	}

	@Test
	public void setLengthTest() {
		Rectangle r = new Rectangle(5, 1);
		int testLength = 1;
		r.setiLength(testLength);
		assertEquals(r.getiLength(), testLength);
	}

	@Test(expected = IllegalArgumentException.class)
	public void rectangleTest_IllegalArgumentException() {
		Rectangle r = new Rectangle(1, -3);
		double area = r.area();
	}

	@Test
	public void areaTest() {
		Rectangle r = new Rectangle(4, 6);
		assertTrue(r.area() == 24);
	}

	@Test(expected = AssertionError.class)
	public void areaTest2() {
		Rectangle r = new Rectangle(4, 6);
		assertTrue(r.area() == 20);
	}

	@Test
	public void perimeterTest() {
		Rectangle r = new Rectangle(3, 3);
		assertTrue(r.perimeter() == 12);
	}

	@Test
	public void compareToTest() {
		Rectangle r = new Rectangle(5, 3);
		Rectangle r1 = new Rectangle(5, 4);
		assertEquals(r1.compareTo(r), 5);
	}
}
