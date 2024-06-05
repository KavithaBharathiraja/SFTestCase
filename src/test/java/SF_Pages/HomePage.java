package SF_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import SF_base.Basepage;

 
public class HomePage extends Basepage {
 
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="userNavButton")
	WebElement UserMenu;
	
	@FindBy(xpath="//div[@class=\"appLauncher slds-context-bar__icon-action\"]")
	WebElement AppLauncher;
	
	@FindBy(xpath="//a[@title='Switch to Lightning Experience']")
	WebElement SwitchtoLighteningTab;
	
	@FindBy(xpath="//span[@class='slds-truncate'][normalize-space()='Accounts']")
	WebElement Account;
	
	@FindBy(xpath="//button[@class=\"slds-button slds-button_inverse\"]")
	WebElement AlertDismiss;
	
	@FindBy(xpath="//p[normalize-space()='Service']")
	WebElement Service;

	public void ClickOnSwitchtoLighteningMode() {
		//waitforElement(50,SwitchtoLighteningTab);
		SwitchtoLighteningTab.click();
	}
	public void AppLauncher() {
		waitforElement(10,AppLauncher);
		AppLauncher.click();
	}
	
	public void Service() {
		waitforElement(10,Service);
		Service.click();
	}
	
	/*public void UserMenu() {
		waitforElement(50,UserMenu);
		UserMenu.click();
	}*/
	
	public void AlertDismiss() {
		waitforElement(10,AlertDismiss);
		AlertDismiss.click();
	}
	
	public void ClickOnAccount() {
		waitforElement(20,Account);
		Actions actions = new Actions(driver);
		actions.moveToElement(Account).click().perform();
	    
	}

 
}

