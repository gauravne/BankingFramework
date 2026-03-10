package pagesBankingTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {

	private WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button']")
	WebElement loginbtn;
	
	public LoginPageTest (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void enter_UsernamePassword(String username1, String password1)
	{
		username.sendKeys(username1);
		password.sendKeys(password1);
	}
	public void clickonlogin()
	{
		loginbtn.click();
	}
	
}
