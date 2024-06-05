package SF_Pages;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import SF_base.Basepage;

 
public class AccountsPage extends Basepage {
	
	public AccountsPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//div[@title=\"New\"]")
	WebElement NewTab;
	
	@FindBy(xpath = "//input[@name='Name']")
	WebElement AccountName;
	
	@FindBy(xpath="//button[@aria-label=\"Type - Current Selection: --None--\"]")
	WebElement AccountType;
	
	//@FindBy(xpath="//label[text()='Type']parent::div" +"//child::button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")
	//WebElement AccountType;
	
	@FindBy(xpath="//span[@title=\"Technology Partner\"]")
	WebElement TechnologyPartner;
	
	@FindBy(xpath="//button[@aria-label=\"Ownership - Current Selection: --None--\"]")
	WebElement Ownership;
	
	@FindBy(xpath="//span[@title=\"Public\"]")
	WebElement Public;
	
	@FindBy(xpath="//button[@class=\"slds-button slds-button_brand\"]")
	WebElement Save;
	
	@FindBy(xpath="//div[@class='actionBody']")
	WebElement Scroll;
	
	@FindBy(xpath="//div[@class='center oneCenterStage lafSinglePaneWindowManager']")
	WebElement AssertName;
	
	
	
	
	
	public void NewTab() {
		waitforElement(30, NewTab);
		Actions actions = new Actions(driver);
		actions.moveToElement(NewTab).click().perform();
		//NewTab.click();
	}
	
	
	public void AccountName() {
		
		waitforElement(20,AccountName);
		
		waitforElement(20, AccountName); // Assuming waitforElement is a method to wait for the element to be visible

	    // Generating a random number
	    Random random = new Random();
	    int randomNumber = random.nextInt(1000); // Generates a random number between 0 (inclusive) and 1000 (exclusive)

	    // Creating the account name by appending the random number
	    String accountNameValue = "Tekarch" + randomNumber;

	    // Setting the account name value in the input field
	    AccountName.sendKeys(accountNameValue);
		 		
		//AccountName.click();
	    //AccountName.sendKeys("Tekarch");
	}
	
	public void AccountType(){
		waitforElement(20,AccountType);
		Actions action = new Actions(driver);
		action.moveToElement(Scroll).click().build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", AccountType);
		AccountType.click();
		
		waitforElement(20,AccountType);
		TechnologyPartner.click();
		//AccountType.click();
		
	}
	
	public void Ownership() {
		waitforElement(20,Ownership);
		Ownership.click();
		Public.click();
	}
	
	public void Save() {
		Save.click();
	}
	
	public void AssertName() {
	
    // Get the text of the validation message
    String validationMessage = AssertName.getText();

    // Perform validation checks on the validation message text
    if (validationMessage.contains("valid")) {
        System.out.println("Tekarch");
    } else {
        System.out.println("Invalid account name: " + validationMessage);
    }

	}
}
