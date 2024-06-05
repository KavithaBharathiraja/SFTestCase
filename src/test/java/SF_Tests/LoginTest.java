package SF_Tests;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import SF_Pages.Loginpage;
import SF_base.Basetest;
 
public class LoginTest extends Basetest{
	WebDriver driver;
	Loginpage loginpage;
	
	
	@BeforeMethod
	public void BeforeMethod() {
		
		driver= getDriver();
		
		driver.get("https://login.salesforce.com/");
		loginpage=new Loginpage(driver);
	}

	



	@Test(priority=1)
	public void LoginintoApplication() {
		loginpage.EnterUserName_Email();
		loginpage.EnterPassword();
		loginpage.ClickOnLogin();
	}
 
	@AfterMethod
	public void AfterMethod() {
		driver.close();
	}
}
