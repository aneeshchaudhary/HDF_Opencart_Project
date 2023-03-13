package testCases;

import org.testng.annotations.Test;

import pageObjects.CheckoutPage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC_007_CheckoutTest extends BaseClass{

	@Test
	public void testCheckout() throws InterruptedException
	{
		SearchPage sp = new SearchPage(driver);
		if(sp.isProductExist("iMac"))
		{
			sp.addToCart("iMac");
			sp.checkConfMsg();
		}
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.gotoCart();
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.gotoCheckoutpage();
		Thread.sleep(10000);
		cop.setCheckoutOptions();
		cop.setBillingDetails(randomeString(), randomeString(), randomeString()+"@gmail.com", randomeNumber(), randomeString(), randomeString(), randomeString(), randomeString(), randomeNumber());
		cop.deliveryDetails();
		cop.deliveryMethod();
		cop.paymentMethod();
		cop.confirmOrder();
		Thread.sleep(10000);
		cop.switchToAlert();
		cop.confirmOrder();
		
		
	}
}
