
public class Triangle implements iForm{
	
	private Line2D a,b,c;
	
	Triangle (Line2D a, Line2D b, Line2D c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isValid() {
		boolean result = false;		
		return result;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double circumference() {
		return a.getLength()+b.getLength()+c.getLength();
	}
	
	

}
