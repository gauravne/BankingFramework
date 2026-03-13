package baseBankingTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public Properties p = new Properties();
	public FileReader fr;
	@BeforeTest
	public void setUp() throws IOException
	{
		
		if(driver==null)
		{
			
			FileReader fr = new FileReader("C:\\Drive G\\Framework\\BankingFramework\\BankingFramework\\src\\test\\resources\\config\\config.properties");
			p.load(fr);
		}
		
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		driver.manage().window().maximize();
		}
		if(p.getProperty("browser").equalsIgnoreCase("edge"))
		{
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
			driver.manage().window().maximize();
		}
			
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		
	}
	
	
}
