package learningTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest extends BaseClass {
	
	@Test
	public void skipTest()
	{
		throw new SkipException("Skip the test");
	}

}
