package testCases;

import org.testng.annotations.Test;

import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC_006_AddToCartTest extends BaseClass{

	@Test
	public void testShoppingcart() throws InterruptedException
	{
		SearchPage sp = new SearchPage(driver);
		
		if(sp.isProductExist("iMac"))
			{
				sp.addToCart("iMac");
				sp.checkConfMsg();
			}
		
		ShoppingCartPage sc = new ShoppingCartPage(driver);
		sc.gotoCart();
		Thread.sleep(1000);
		sc.viewCart();
		//sc.resetQuantity("3"); //Todo
		sc.updateQuantity();
		Thread.sleep(1000);
		sc.checkout();
		//sc.continueShopping();
	}
}
