package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

/*

Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass

*/

public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven") // getting data provider from different folder
	public void Verify_loginDDT(String email ,String pwd,String exp) {
		
		logger.info("*** Started TC002_LoginTest ***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.SetEmail(email);
		lp.SetPassword(pwd);
		Thread.sleep(3000);
		lp.LgnBtn();
		
		
		MyAccountPage maccp= new MyAccountPage(driver);
		boolean targetpage = maccp.ismypageisExists();
		
		 // Valid credentials
        if(exp.equalsIgnoreCase("Valid"))
        {
            if(targetpage == true)
            {
            	maccp.clicklogout();
                Assert.assertTrue(true);
            }
            else
            {
                Assert.assertTrue(false);
            }
        }

        // Invalid credentials
        if(exp.equalsIgnoreCase("Invalid"))
        {
            if(targetpage == true)
            {
            	maccp.clicklogout();
                Assert.assertTrue(false);
            }
            else
            {
                Assert.assertTrue(true);
            }
        }

		}
		catch(Exception e){
			Assert.fail();
		}
		
		logger.info("**** Finished TC002_LoginTest  **** ");
	}
}
