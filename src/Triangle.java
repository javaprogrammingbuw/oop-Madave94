
public class Triangle implements iForm{
	
	private Line2D a,b,c;
	
	Triangle (Line2D a, Line2D b, Line2D c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isValid() {
		boolean result = false;	
		if (a.isConnected(b) && a.isConnected(c) && b.isConnected(c)) result = true;
		return result;
	}

	@Override
	public double area() {
		//TODO
		return 0;
	}

	@Override
	public double circumference() {
		return a.getLength()+b.getLength()+c.getLength();
	}
	
	

}
