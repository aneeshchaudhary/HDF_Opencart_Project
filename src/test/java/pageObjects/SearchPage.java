package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='content']/div[3]//img")
	List<WebElement> searchProducts;
	
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
	WebElement cnfMsg;
	
	@FindBy(xpath = "//div[3]//div[4]")
	WebElement slidToProduct;
	
	public boolean isProductExist(String productName)
	{
		boolean flag=false;
		for(WebElement product:searchProducts)
		{				
			if(product.getAttribute("title").equals(productName))
			{
			flag=true;
			break;
			}
		}
		
		return flag;
	
	}
	
	public void selectProduct(String productName)
	{
		for(WebElement product:searchProducts)
		{				
			if(product.getAttribute("title").equals(productName))
			{
				product.click();
				break;
			}
		}
	}
	
	public void addToCart(String productName)
	{
		for(WebElement product:searchProducts)
		{				
			if(product.getAttribute("title").equals(productName))
			{
				//product.click();
				if(productName.equals("iMac"))
				{
					driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();
				}else if (productName.equals("MacBook")) {
					driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();
				}else if (productName.equals("MacBook Air")) {
					driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();
				}else if (productName.equals("MacBook Pro")) {
					driver.findElement(By.xpath("//div[4]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();
				}
				else
				{
					System.out.println("Product Not matched!!!!!!!");
				}
				break;
			}
		}
	}
	
	public boolean checkConfMsg()
	{
		try
		{
		return cnfMsg.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
}
