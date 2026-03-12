package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h1[normalize-space()='My Account']")   // MyAccount Page heading
	WebElement headermsg;

	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Logout']")
	WebElement lgout;
	
	public boolean ismypageisExists() {
	
		try {
			return(headermsg.isDisplayed());
		}
		
		catch(Exception e) {
			
			return false;
		}		
	}
	
	public void clicklogout() {
		
		lgout.click();
	}

	
}
