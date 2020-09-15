package learningTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 extends BaseClass{

	@Test(groups="bvt")
	public void validateTitles()
	{
		String exp_title = "Yahoo.com"; //Excel
		String act_title = "Gmail.com";  //Selenium
		
//		if(act_title.equals(exp_title))
//		{
//			System.out.println("Test Passed");	}
//		else
//		{
//			System.out.println("testFailed");
//		}
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Validating Title");
		softAssert.assertEquals(act_title, exp_title);
		
		System.out.println("Validating Image");
		softAssert.assertEquals(true, false, "Image validation Failed");
		
		System.out.println("Validating textbox presence");
		softAssert.assertEquals(true, true, "Textbox not present");

		softAssert.assertAll();
	}
}
