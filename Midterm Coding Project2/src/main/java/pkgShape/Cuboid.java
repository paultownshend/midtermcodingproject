package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int iDepth;

	public Cuboid(int a, int b, int c) {
		super(a, b);
		iDepth = c;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		return this.getiLength() * this.getiWidth() * this.iDepth;
	}

	@Override
	public double area() {
		return super.area() * 6;
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Unsupported operation.");
	}

	public int compareTo(Cuboid c) {
		return (int) (this.volume() - c.volume());
	}

	class SortByArea implements Comparator<Cuboid> {

		public SortByArea() {

		}

		public int compare(Cuboid a, Cuboid b) {
			if (a.area() > b.area())
				return 1;
			else if (a.area() < b.area())
				return -1;
			else
				return 0;
		}
	}

	class SortByVolume implements Comparator<Cuboid> {

		public SortByVolume() {

		}

		public int compare(Cuboid a, Cuboid b) {
			if (a.volume() > b.volume())
				return 1;
			else if (a.volume() < b.volume())
				return -1;
			else
				return 0;
		}
	}
}
