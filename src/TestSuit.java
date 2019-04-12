import org.junit.Test;
import static org.junit.Assert.*;

public class TestSuit {
	
	public static final double DELTA = 0.0001;
	
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

}
