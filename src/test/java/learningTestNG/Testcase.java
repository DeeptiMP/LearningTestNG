package learningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase extends BaseClass{
	
	@BeforeTest
	public void createDB()
			{
				System.out.println("Creating DB Connection");
			}
	
	@AfterTest
	public void closeDB()
	{
		System.out.println("Close DB Connection");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@Test(priority=1, groups="functional")
	public void userReg()
	{
		System.out.println("User registers with site");
	}

	
	@Test(priority=2, groups="smoke")
	public void userLogin()
	{
		System.out.println("User login to site");
	}
	
	@Test(priority=3)
	public void userLogout()
	{
		System.out.println("User logout from site");
	}
	
}
