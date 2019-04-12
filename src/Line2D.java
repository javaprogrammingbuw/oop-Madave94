
public class Line2D {
	private Point2D start, end;
	
	Line2D (Point2D start, Point2D end) {
		this.start = start;
		this.end = end;
	}
	
	public double getLength() {
		double xlength = start.getX()-end.getX();
		double ylength = start.getY()-end.getY();
		return java.lang.Math.sqrt(xlength*xlength+ylength*ylength);
	}
	
	public boolean isConnected(Line2D other) {
		boolean result = false;
		if (this.start.equals(other.start)) return true;
		if (this.start.equals(other.end)) return true;
		if (this.end.equals(other.start)) return true;
		if (this.end.equals(other.end)) return true;
		return result;
	}
}
