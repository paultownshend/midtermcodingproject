package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgShape.Cuboid;

public class CuboidTest {

	@Test
	public void cuboidTest() {
		Cuboid c = new Cuboid(3,3,3);
		assertTrue(c.getiDepth()==3);
		assertTrue(c.getiLength()==3);
		assertTrue(c.getiWidth()==3);
	}
	@Test (expected = AssertionError.class)
	public void cuboidTest2() {
		Cuboid c = new Cuboid(3,3,3);
		assertTrue(c.getiDepth()!=3);
	}
	@Test
	public void setDpethTest() {
		Cuboid c = new Cuboid(4,3,2);
		int testDepth = 2;
		c.setiDepth(testDepth);
		assertEquals(c.getiDepth(),testDepth);
	}
	@Test
	public void volumeTest() {
		Cuboid c = new Cuboid(2,3,4);
		assertTrue(c.volume()==24);
	}	
	@Test
	public void surfaceAreaTest() {
		Cuboid c = new Cuboid(2,3,4);
		double testSurfaceArea = c.area();
		assertTrue(testSurfaceArea==36);
	}
	@Test(expected = UnsupportedOperationException.class)
	public void perimeterTest() {
		Cuboid c = new Cuboid(4,3,1);
		c.perimeter();
	}
	@Test
	public void compareToTest() {
		Cuboid c = new Cuboid(3,2,1);
		Cuboid c1 = new Cuboid(2,2,1);
		assertEquals(c.compareTo(c1),2);
	}
}
