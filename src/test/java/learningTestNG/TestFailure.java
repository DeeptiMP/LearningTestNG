package learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure extends BaseClass{
	
@Test	
public void doLogin()
{
	System.out.println("Test will be failed");
	Assert.fail("Failing Login Test");
	}
}
