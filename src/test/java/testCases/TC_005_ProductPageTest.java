package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_005_ProductPageTest extends BaseClass{

	@Test
	public void testProductPage()
	{
		HomePage hp = new HomePage(driver);
//		hp.writeInSearchBox();
//		hp.clickSearchBtn();
		
		SearchPage sp =new SearchPage(driver);
		
		//Select product and go to product page
		if(sp.isProductExist("iMac"))
			{
				sp.selectProduct("iMac");
			}
		else {
			System.out.println("Product not found !!!!!!!!");
			}
		
		ProductPage pp = new ProductPage(driver);
		System.out.println("Check 6");
		pp.addToWishList();
		pp.setQuantity("5");
		pp.addToCart();
	}
}
