
public class Point2D {
	private double x, y;
	
	Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if ((o != null) && (o instanceof Point2D)) {
			Point2D otherPoint = (Point2D) o;
			if ((otherPoint.x == this.x) && 
			(otherPoint.y == this.y)) result = true;
		}		
		return result;
	}
}
