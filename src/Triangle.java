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
		double upperLine = 0.5*Math.pow(a.getLength(), 2) 
				- 0.5*Math.pow(b.getLength(), 2) 
				+ 0.5*Math.pow(c.getLength(), 2);
		double alpha = Math.acos(upperLine/(b.getLength()*c.getLength()));
		double beta = Math.acos(upperLine/(a.getLength()*c.getLength()));
		double gamma = -beta-alpha+Math.PI;
		double h = b.getLength()*Math.sin(gamma);
		return (0.5 * c.getLength() * h);
	}

	@Override
	public double circumference() {
		return a.getLength()+b.getLength()+c.getLength();
	}
	
	

}
