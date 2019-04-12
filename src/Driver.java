import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Driver {

	public static void main(String[] args) {
		// Refer to the TestSuit
		// Run this class
		// or use the build.gradle
		Result result = JUnitCore.runClasses(TestSuit.class);

		for (Failure failure : result.getFailures()) {	         
			System.out.println(failure.toString());	      
		}
		
		System.out.println(result.wasSuccessful());
	}

}
