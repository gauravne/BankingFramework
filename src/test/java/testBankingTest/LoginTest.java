package testBankingTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseBankingTest.BaseTest;
import pagesBankingTest.LoginPageTest;
import pagesBankingTest.OpenAccountPageTest;
import utilsBankingTest.ScreenshotTest;
import utilsBankingTest.WaitTest;

public class LoginTest extends BaseTest {

	

	@Test
	public void logintoportal() throws InterruptedException, IOException
	{
		// login to application
	
		LoginPageTest login = new LoginPageTest(driver);
		ScreenshotTest st = new ScreenshotTest();
		st.capturescreenshot(driver);
		login.enter_UsernamePassword("Admin123", "Admin123");
		st.capturescreenshot(driver);
		login.clickonlogin();
		System.out.println("Login Successful !!");
		st.capturescreenshot(driver);
		
		WaitTest wait = new WaitTest();
		WebElement ele = driver.findElement(By.linkText("Open New Account"));
		wait.waitforElementtobeVisible(ele, driver);
		//Open account
		OpenAccountPageTest openaccount = new OpenAccountPageTest(driver);
		openaccount.NewAccount();
		openaccount.submitbtn();
		st.capturescreenshot(driver);
		System.out.println("New account is created Successfully !!!");
		
		
		
	}
	
	
}
