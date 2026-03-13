package testCases;
	
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;
	
	
	public class TC001_AccountRegistrationTest extends BaseClass {
	
	
		@Test(groups={"Regression","Master"})
	public	void verify_account_registration() throws InterruptedException {
					
			logger.info("******Starting TC001_AccountRegistrationTest ****");
			
			try {
			HomePage hp=new HomePage(driver);
			
			hp.clickMyAccount();
			
			
			logger.info("Clicked on my Account");
			
			hp.clickRegister();
			
			logger.info("Clicked on Register");
			
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
			logger.info("Providing Customer Details....");
			
			regpage.setFirstname(randomString().toUpperCase());	
			regpage.setLastname(randomString().toUpperCase());
			regpage.setEmail(randomString()+"@gmail.com");
			regpage.setpassword(randomAlphanumber());
			
			Thread.sleep(7000);
			regpage.policy();
		
			Thread.sleep(7000);
			regpage.btncontin();
			
			logger.info("Validating Expected Message.... ");
			String confmsg=regpage.msgConfirmation();
					Thread.sleep(5000);
			if(confmsg.equals("Your Account Has Been Created!")) {
				
				Assert.assertTrue(true);	
			}
			else {
				logger.error("Test Failed");
				logger.debug("debug logs...");
				Assert.assertTrue(false);		
			}
		}
		catch(Exception e) {
			
			Assert.fail();
		}
			
			logger.info("******Finished TC001_AccountRegistrationTest ****");
	}
	
			
}	
		

