package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyTitle {
	
	@Test
	public void verifyApplicationTitle()
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		String actualTitle = driver.getTitle();		
		System.out.println(actualTitle);		
		//String expectedTitle = "OrangeHRM";		
		//Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(actualTitle.contains("Orange"));
		System.out.println("Page Title Verified");
		
		
		
	}

}
