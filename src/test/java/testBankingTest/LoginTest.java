package testBankingTest;

import org.testng.annotations.Test;

import baseBankingTest.BaseTest;
import pagesBankingTest.LoginPageTest;
import pagesBankingTest.OpenAccountPageTest;

public class LoginTest extends BaseTest {

	

	@Test
	public void logintoportal() throws InterruptedException
	{
		LoginPageTest login = new LoginPageTest(driver);
		login.enter_UsernamePassword("Admin", "Admin");
		login.clickonlogin();
		Thread.sleep(3000);
		System.out.println("Login Successful !!");
		
		
		
		OpenAccountPageTest openaccount = new OpenAccountPageTest(driver);
		openaccount.NewAccount();
		Thread.sleep(2000);
		openaccount.submitbtn();
		System.out.println("New account is created Successfully !!!");
	}
	
	
}
