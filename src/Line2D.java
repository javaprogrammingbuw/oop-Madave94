
public class Line2D {
	private Point2D start, end;
	
	Line2D (Point2D start, Point2D end) {
		this.start = start;
		this.end = end;
	}
	
	double getLength() {
		double xlength = start.getX()-end.getX();
		double ylength = start.getY()-end.getY();
		return java.lang.Math.sqrt(xlength*xlength+ylength*ylength);
	}
}
