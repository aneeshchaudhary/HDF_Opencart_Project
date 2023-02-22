package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void loginDDT(String email, String pwd, String exp)
	{
		logger.info("***    Starting TC_003_LoginDataDrivenTest    ***");
		
		try {
			HomePage hp= new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLogin();
			
			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExist();
			
			if(exp.equals("Valid"))
			{
				if(targetPage == true)
				{
					macc.clickLogout();
					Assert.assertTrue(true);
				}else {
					Assert.assertTrue(false);
				}
				
				if(exp.equals("Invalid"))
				{
					if(targetPage == true)
					{
						MyAccountPage myaccpage = new MyAccountPage(driver);
						myaccpage.clickLogout();
						Assert.assertTrue(false);
					}else
					{
						Assert.assertTrue(true);
					}
				}
				
			}
			
		} catch (Exception e) {
			Assert.fail();
		}
		
		logger.info(" Finished TC_003_LoginDataDrivenTest");	
	}
	
}
