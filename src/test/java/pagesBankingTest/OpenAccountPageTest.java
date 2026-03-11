package pagesBankingTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPageTest {
	
	private WebDriver driver;
	@FindBy(linkText = "Open New Account")
	WebElement openaccountURL;
	@FindBy(xpath="//select[@id='type']")
	WebElement accounttypedropdown;
	@FindBy(xpath="//*[@id=\'openAccountForm\']/form/div/input")
	WebElement opennewaccountbtn;
	
	public OpenAccountPageTest(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NewAccount()
	{
		openaccountURL.click();
		Select dropdown = new Select(accounttypedropdown);
		dropdown.selectByVisibleText("SAVINGS");
	}

	public void submitbtn()
	{
		opennewaccountbtn.click();
		
	}
}
