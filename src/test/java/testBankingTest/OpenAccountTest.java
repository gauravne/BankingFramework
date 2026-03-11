package testBankingTest;
import org.testng.annotations.Test;

import baseBankingTest.BaseTest;
import pagesBankingTest.OpenAccountPageTest;
public class OpenAccountTest extends LoginTest{
	
	
	@Test
	public void openAccount() throws InterruptedException
	{
		//login
		logintoportal();
		
		//Open New Account
		OpenAccountPageTest openaccount = new OpenAccountPageTest(driver);
		openaccount.NewAccount();
		System.out.println("New account is created Successfully !!!");
		
	}

}
