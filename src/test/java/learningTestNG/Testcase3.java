package learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3 extends BaseClass{
	
	@Test(priority=1, groups="bvt")
	public void userReg()
	{
		System.out.println("User registers with site");
		Assert.fail("Registration failed");
	}

	
	@Test(priority=2,dependsOnMethods="userReg")
	public void userLogin()
	{
		System.out.println("User login to site");
	}
	
	@Test(priority=3, groups={"bvt","smoke"})
	public void userLogout()
	{
		System.out.println("User logout from site");
	}
	
	@Test(priority=4, alwaysRun=true, groups="smoke")
	public void test3()
	{
		System.out.println("Running third test");
	}
	
}
