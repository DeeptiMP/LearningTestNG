package learningTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void setUp()
	{
		System.out.println("Setting Up Everything");
	}

	@AfterSuite
	public void tearDown()
	{
		System.out.println("Quitting everything");
	}
}
