import org.junit.Test;
import static org.junit.Assert.*;

public class TestSuit {
	
	public static final double DELTA = 0.1;
	
	@Test
	public void testPoint2DEqual() {
		Point2D pointA = new Point2D(3,0);
		Point2D pointB = new Point2D(0,0);
		Point2D pointC = new Point2D(3,0);
		assertEquals(false, pointA.equals(pointB));
		assertEquals(true, pointA.equals(pointC));
	}
	
	@Test
	public void testLine2Dlength1() {
		Line2D lineA = new Line2D(new Point2D(3,0), new Point2D(0,4));
		assertEquals(5, lineA.getLength(), DELTA); //normal case
	}
	
	@Test
	public void testLine2Dlength2() {
		Line2D lineA = new Line2D(new Point2D(3,0), new Point2D(6,0));
		assertEquals(3, lineA.getLength(), DELTA); //parallel case
	}
	
	@Test
	public void testLine2Dlength3() {
		Line2D lineA = new Line2D(new Point2D(3,3), new Point2D(3,3));
		assertEquals(0, lineA.getLength(), DELTA); //zero case
	}
	
	@Test
	public void testLine2DConnected() {
		Line2D lineA = new Line2D(new Point2D(3,0), new Point2D(0,4));
		Line2D lineB = new Line2D(new Point2D(3,3), new Point2D(3,3));
		Line2D lineC = new Line2D(new Point2D(3,0), new Point2D(6,0));
		assertEquals(false, lineA.isConnected(lineB));
		assertEquals(true, lineA.isConnected(lineC));
	}
	
	@Test
	public void testRectangleCircumference() {
		Line2D lineA = new Line2D(new Point2D(0,0), new Point2D(3,0));
		Line2D lineB = new Line2D(new Point2D(0,0), new Point2D(0,3));
		Rectangle recA = new Rectangle(lineA, lineB);
		assertEquals(12, recA.circumference(), DELTA);
	}
	
	@Test
	public void testRectangleArea() {
		Line2D lineA = new Line2D(new Point2D(0,0), new Point2D(3,0));
		Line2D lineB = new Line2D(new Point2D(0,0), new Point2D(0,3));
		Rectangle recA = new Rectangle(lineA, lineB);
		assertEquals(9, recA.area(), DELTA);
	}
	
	@Test
	public void testTriangleValidity() {
		Line2D lineA = new Line2D(new Point2D(0,0), new Point2D(3,0));
		Line2D lineB = new Line2D(new Point2D(0,0), new Point2D(0,3));
		Line2D lineC = new Line2D(new Point2D(0,3), new Point2D(3,0));
		Triangle tria =  new Triangle(lineA, lineB, lineC);
		assertEquals(true, tria.isValid());
	}
	
	@Test
	public void testTriangleCircumference() {
		Line2D lineA = new Line2D(new Point2D(0,0), new Point2D(4,0));
		Line2D lineB = new Line2D(new Point2D(0,0), new Point2D(0,3));
		Line2D lineC = new Line2D(new Point2D(0,3), new Point2D(4,0));
		Triangle tria =  new Triangle(lineA, lineB, lineC);
		assertEquals(12, tria.circumference(), DELTA);;
	}
	
	@Test
	public void testTriangleArea() {
		Line2D lineA = new Line2D(new Point2D(0,0), new Point2D(3,0));
		Line2D lineB = new Line2D(new Point2D(0,0), new Point2D(0,3));
		Line2D lineC = new Line2D(new Point2D(0,3), new Point2D(3,0));
		Triangle tria =  new Triangle(lineA, lineB, lineC);
		assertEquals(3.9, tria.area(), DELTA);
	}
}
