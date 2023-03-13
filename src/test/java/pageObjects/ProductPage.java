package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath = "//button[@type='button']//i[@class='fa fa-heart']")
	WebElement addTowishList;
	
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement txtquantity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement btnaddToCart;
	
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
	WebElement cnfMsg;
	
	//Write Review
	//Todo
	
	//Actions
	public void addToWishList()
	{
		System.out.println("Check 3");
		addTowishList.click();
	}
	
	public void setQuantity(String quantity)
	{
		System.out.println("Check 4");
		txtquantity.clear();
		txtquantity.sendKeys(quantity);
	}
	
	public void addToCart()
	{
		System.out.println("check 5");
		btnaddToCart.click();
	}
	
	public boolean checkConfirmMessage()
	{
		return cnfMsg.isDisplayed();
	}

	
	public void writeReview()
	{
		//Todo
	}
}
