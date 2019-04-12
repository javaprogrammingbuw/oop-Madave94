
public class Rectangle implements iForm{
	private Line2D a,b;
	
	Rectangle (Line2D a, Line2D b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double area() {
		return a.getLength()*b.getLength();
	}

	@Override
	public double circumference() {
		return 2*(a.getLength()+b.getLength());
	}
}
