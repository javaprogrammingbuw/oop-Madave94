import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Refer to the TestSuit
		// Optional place to implement further methods
		// Junit 5 was used for the TestSuit
		Result result = JUnitCore.runClasses(TestSuit.class);

		for (Failure failure : result.getFailures()) {	         
			System.out.println(failure.toString());	      
		}
		
		System.out.println(result.wasSuccessful());
	}

}
