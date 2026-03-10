package testBankingTest;

import org.testng.annotations.Test;

import baseBankingTest.BaseTest;
import pagesBankingTest.LoginPageTest;

public class LoginTest extends BaseTest {

	

	@Test
	public void login() throws InterruptedException
	{
		LoginPageTest login = new LoginPageTest(driver);
		login.enter_UsernamePassword("Admin", "Admin");
		login.clickonlogin();
		Thread.sleep(3000);
		System.out.print("Login Successful !!");
	}
	
	
}
