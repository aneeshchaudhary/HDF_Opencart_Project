package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	
	
	//Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")
	WebElement lnkLogin;
	
	@FindBy(name = "search")
	WebElement searchBox;
	
	@FindBy(xpath = "//div[@id='search']//button[@type='button']")
	WebElement btnSearch;
	
	
	
	//Actions Methods	
	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	public void writeInSearchBox()
	{
		searchBox.sendKeys("mac");
	}
	
	public void clickSearchBtn()
	{
		btnSearch.click();
	}
}
