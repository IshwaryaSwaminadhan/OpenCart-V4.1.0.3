package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement lgbtn;
	
	public void SetEmail(String emails) {
		
		email.sendKeys(emails);
	}
	
	
	public void SetPassword(String pass) {
		
		pwd.sendKeys(pass);
	}
	

	public void LgnBtn() {
		lgbtn.click();
	}
	
}
