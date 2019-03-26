package pkgShape;

public class Rectangle extends Shape {
	
	private int iWidth;
	private int iLength;
	protected int a;
	
	public Rectangle(int a, int b) throws IllegalArgumentException {
		super();
		if ((a <= 0) || (b <= 0)) {
			throw new IllegalArgumentException("Can not be negative.");
		}
		else
			iWidth = a;
			iLength = b;
	}

	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return iWidth*iLength;
	}
	
	public double perimeter() {
		return (2*iWidth)+(2*iLength);
	}
	
	public int compareTo(Rectangle r) {
		return (int) (this.area() - r.area());
	}
}
