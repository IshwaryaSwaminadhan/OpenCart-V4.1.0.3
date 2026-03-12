package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement policy;
	

	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement contbtn;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstname(String fname ) {
		
		firstname.sendKeys(fname);
		
	}
	
	public void setLastname(String lname ) {
		
		lastname.sendKeys(lname);
		
	}
	
	public void setEmail(String emails ) {
		
		email.sendKeys(emails);	
	}
	
	public void setpassword(String pwds ) {
		
		pwd.sendKeys(pwds);	
	}

	public void policy() {
		
		policy.click();	
	}
	
	
	public void btncontin() {
		
		 //sol1
		contbtn.click();
		
		 //sol2
	    //contbtn.submit();

	    //sol3
	    //Actions act = new Actions(driver);
	    //act.moveToElement(contbtn).click().perform();

	    //sol4
	    //JavascriptExecutor js = (JavascriptExecutor)driver;
	    //js.executeScript("arguments[0].click();", contbtn);

	    //Sol 5
	    //contbtn.sendKeys(Keys.RETURN)	;

	    //Sol6
	    //WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    //mywait.until(ExpectedConditions.elementToBeClickable(contbtn)).click();
	}
	
	public  String msgConfirmation() {
		try {
			return (msgConfirmation.getText());
		}
		catch(Exception e){
			return (e.getMessage());
		}
	
		
			
	}
}
