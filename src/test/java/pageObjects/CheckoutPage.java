package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath = "//strong[normalize-space()='Checkout']")
	WebElement btnCheckout;
	
	@FindBy(xpath = "//input[@value='guest']")
	WebElement rbtnGuestCheckout;
	
	@FindBy(xpath = "//input[@id='button-account']")
	WebElement btnContinue1;
	
	//Billing Details
//	@FindBy(xpath = "//a[normalize-space()='Step 2: Billing Details']")
//	WebElement dropdownBillingDetails;
	
	@FindBy(xpath = "//input[@id='input-payment-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='input-payment-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='input-payment-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-payment-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@id='input-payment-company']")
	WebElement  txtCompany;
	
	@FindBy(xpath = "//input[@id='input-payment-address-1']")
	WebElement  txtAddress1;
	
	@FindBy(xpath = "//input[@id='input-payment-address-2']")
	WebElement  txtAddress2;
	
	@FindBy(xpath = "//input[@id='input-payment-city']")
	WebElement  txtCity;
	
	@FindBy(xpath = "//input[@id='input-payment-postcode']")
	WebElement  txtPostCode;
	
	@FindBy(xpath = "//select[@id='input-payment-country']")
	WebElement ddCountry;
	
	@FindBy(xpath = "//select[@id='input-payment-zone']")
	WebElement ddState;
	
	@FindBy(xpath = "//input[@id='button-guest']")
	WebElement btnContinue2;
	
	// Delivery Details
	@FindBy(xpath = "//input[@id='button-guest']")
	WebElement  btnContinue3;
	
	//Delivery Method
	@FindBy(xpath = "//input[@id='button-shipping-method']")
	WebElement  btnContinue4;
	
	//Payment Method
	@FindBy(xpath = "//input[@id='button-payment-method']")
	WebElement  btnContinue5;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement  checkBoxTerms_Conditions;
	
	//Confirm Order
	@FindBy(xpath = "//input[@id='button-confirm']")
	WebElement  btnConfirmOrder;
	
	
	//Actions
	public void gotoCheckoutpage()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnCheckout);
		//btnCheckout.click();
	}
	
	public void setCheckoutOptions()
	{
		rbtnGuestCheckout.click();
		btnContinue1.click();
	}
	
	public void setBillingDetails(String firstName, String lastName, String email, String telephone, String company, String add1, String add2, String city,String pin)
	{
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		txtEmail.sendKeys(email);
		txtTelephone.sendKeys(telephone);
		txtCompany.sendKeys(company);
		txtAddress1.sendKeys(add1);
		txtAddress2.sendKeys(add2);
		txtCity.sendKeys(city);
		txtPostCode.sendKeys(pin);
		
		Select selectCountry = new Select(ddCountry);
		selectCountry.selectByValue("99"); //Hard Coded for now
		
		Select selectState = new Select(ddState);
		selectState.selectByValue("1505");
		
		btnContinue2.click();
	}
	
	public void deliveryDetails()
	{
		btnContinue3.click();
	}
	
	public void deliveryMethod()
	{
		btnContinue4.click();
	}
	
	public void paymentMethod()
	{
		checkBoxTerms_Conditions.click();
		btnContinue5.click();
	}

	public void confirmOrder()
	{
		btnConfirmOrder.click();
	}
	
	public void switchToAlert() 
	{
		driver.switchTo().alert().accept();
		
	}
}
