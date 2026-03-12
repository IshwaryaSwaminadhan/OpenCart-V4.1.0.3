package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void Verifylogin() {
		
		logger.info("*** Started TC002_LoginTest ***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.SetEmail(propertiesobj.getProperty("email"));
		lp.SetPassword(propertiesobj.getProperty("password"));
		Thread.sleep(3000);
		lp.LgnBtn();
		logger.info("*** Logged to My account ***");
		
		Thread.sleep(5000);
		MyAccountPage maccp= new MyAccountPage(driver);
		boolean targetpage = maccp.ismypageisExists();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e){
			Assert.fail();
		}
		
		logger.info("**** Finished TC002_LoginTest  **** ");
	}

}
