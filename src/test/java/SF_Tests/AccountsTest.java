package SF_Tests;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SF_Pages.AccountsPage;
import SF_Pages.HomePage;
import SF_Pages.Loginpage;
import SF_base.Basetest;


public class AccountsTest extends Basetest{

	WebDriver driver;
	Loginpage loginpage;
	HomePage homepage;
	AccountsPage accountpage;
	@BeforeMethod
	public void BeforeMethod() {
		
		driver=getDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		loginpage=new Loginpage(driver);
		homepage=new HomePage(driver);
		accountpage=new AccountsPage(driver);
	}
	@Test
	public void AccountCreation() throws InterruptedException {
		loginpage.EnterUserName_Email();
		loginpage.EnterPassword();
		loginpage.ClickOnLogin();
			try {
			homepage.ClickOnSwitchtoLighteningMode();
		}catch (Exception e) {
			System.out.println("Already Lightening mode on");
		}
			
		homepage.AppLauncher();
		
		homepage.Service();
		
		homepage.ClickOnAccount();
		try {
			
	        driver.switchTo().alert().accept();
	        
	    } catch (NoAlertPresentException e) {
	        // Alert not present, continue with the test
	    }
		
		accountpage.NewTab();
		accountpage.AccountName();
		accountpage.AccountType();
		accountpage.Ownership();
		accountpage.Save();
		accountpage.AssertName();
	}
	
	
}
