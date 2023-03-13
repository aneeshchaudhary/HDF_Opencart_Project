package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement btnCart;
	
	@FindBy(xpath = "//strong[normalize-space()='View Cart']")
	WebElement btnViewCart;
	
	@FindBy(xpath = "//input[@name='quantity[35]']")
	WebElement txtupdateQuantity;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnUpdateQuantity;
	
	//CouponCode
	@FindBy(xpath = "//a[normalize-space()='Use Coupon Code']")
	WebElement btnUseCouponCode;
	
	@FindBy(xpath = "//input[@id='input-coupon']")
	WebElement txtCouponCode;
	
	@FindBy(xpath = "//input[@id='button-coupon']")
	WebElement btnApplyCoupon;
	
	//Estimate Shipping & Taxes  //Todo
	@FindBy(xpath = "")
	WebElement btnEstimate_Shipping_and_Taxes;
	
	@FindBy(xpath = "")
	WebElement selectCountry; //Dropdown  //Todo
	
	@FindBy(xpath = "")
	WebElement selectRegion; //Dropdown   //Todo
	
	@FindBy(xpath = "")
	WebElement txtPostCode; //Todo
	
	//Use Gift Certificate   //Todo
	@FindBy(xpath = "")
	WebElement btnUseGiftCard;
	
	@FindBy(xpath = "")
	WebElement txtGiftCardCode;
	
	@FindBy(xpath = "")
	WebElement btnApplyGiftCard;
	
	//CheckOut
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnCheckout;
	
	//Continue Shopping
	@FindBy(xpath = "//a[normalize-space()='Continue Shopping']")
	WebElement btnContinueShopping;
	
	
	
	//Actions
	public void gotoCart()
	{
		System.out.println("Check 1");
		btnCart.click();
	}
	
	public void viewCart()
	{
		System.out.println("Check 2");
		btnViewCart.click();
	}
	
	public void resetQuantity(String newQuantity)
	{
		System.out.println("Check 3");
		txtupdateQuantity.clear();
		txtupdateQuantity.sendKeys(newQuantity);
	}
	
	public void updateQuantity()
	{
		System.out.println("Check 4");
		btnUpdateQuantity.click();
	}
	
	public void checkout()
	{
		System.out.println("Check 5");
		btnCheckout.click();
	}
	
	public void continueShopping()
	{
		btnContinueShopping.click();
	}
}
