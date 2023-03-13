package testCases;

import org.testng.annotations.Test;

import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_Search extends BaseClass{

	@Test
	public void testSearch() throws InterruptedException
	{
		logger.info(" Starting TC_004_SearchTest ");

			
//			HomePage hp = new HomePage(driver);
//			hp.enterProductName("iPhone");        //Not working for now
//			hp.clickSearch();
			
			SearchPage sp=new SearchPage(driver);
			
			//For adding multiple products to the cart
			
			String[] listOfProduct = {"iMac", "MacBook"};
			
			for(int i=0; i<listOfProduct.length; i++)
			{
				if(sp.isProductExist(listOfProduct[i]))
				{		
					sp.addToCart(listOfProduct[i]);
					sp.checkConfMsg();
				}
			}
				
			//for Adding single product to Cart
			
//			if(sp.isProductExist("iMac"))
//			{
//				sp.addToCart("iMac");
//				sp.checkConfMsg();
//			}
		

		logger.info(" Finished TC_004_SearchTest ");

	}
}
