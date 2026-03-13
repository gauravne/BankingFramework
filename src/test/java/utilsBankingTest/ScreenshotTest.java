package utilsBankingTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import baseBankingTest.BaseTest;

public class ScreenshotTest extends BaseTest  {
	
	public void capturescreenshot(WebDriver driver) throws IOException
	{
		
		Date currentdate = new Date();
		
		String screenshotfile = currentdate.toString().replace(":", "").replace("", "");
		System.out.println(screenshotfile);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File((System.getProperty("user.dir"))+"\\src\\test\\resources\\screenshot\\"+screenshotfile+".png");
		FileHandler.copy(source, destination);
	}

}
