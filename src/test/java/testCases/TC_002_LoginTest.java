package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{

	@Test(groups = {"Sanity", "Master"})
	public void test_Login()
	{
		logger.info("***   Starting TC_002_LoginTest   ***");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin();
			
			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetValue = macc.isMyAccountPageExist();
			Assert.assertEquals(targetValue, true);
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("***   Finished TC_002_LoginTest   ***");
	}
	
	
}
