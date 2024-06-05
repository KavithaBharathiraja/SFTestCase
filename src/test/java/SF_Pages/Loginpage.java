package SF_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
import SF_base.Basepage;
public class Loginpage extends Basepage{
	
	public Loginpage(WebDriver driver) {
		super(driver);
	}
 
	@FindBy(id="username")
	WebElement Email;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(id="Login")
	WebElement LoginButoon;

	public void EnterUserName_Email() {
		Email.sendKeys("kavi@bharathiraja.com");
	}
	public void EnterPassword() {
		Password.sendKeys("password123");
	}
	public void ClickOnLogin() {
		LoginButoon.click();
	}
	
	
	

}
