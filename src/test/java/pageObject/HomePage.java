package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
    WebElement lnkonmyacc;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement clkregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	public void clickMyAccount() {
		lnkonmyacc.click();		
	}
	
	public void clickRegister() {
		clkregister.click();
	}
	
	public void clicklogin() {
		login.click();
	}
	
	
}
