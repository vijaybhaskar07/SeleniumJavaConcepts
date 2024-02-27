package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdownValues {
	
	@Test(enabled=false)
	public void verifyDropdownValues() throws InterruptedException 	
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		System.out.println(driver.getTitle());
		WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='state']"));
		Select stateddvalue = new Select(stateDropdown);
		stateddvalue.selectByIndex(4);
		Thread.sleep(2000);
		stateddvalue.selectByValue("Goa");
		Thread.sleep(2000);
		stateddvalue.selectByVisibleText("Karnataka");
		System.out.println(stateddvalue.getFirstSelectedOption().getText());		
	}
	
	@Test
	public void verifyDDValuesCount() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		System.out.println(driver.getTitle());
		WebElement stateDDCount = driver.findElement(By.xpath("//select[@id='state']"));
		Select valuesCount = new Select(stateDDCount);
		List<WebElement> ddvCount = valuesCount.getOptions();
		int stateCount = ddvCount.size();
		Assert.assertEquals(stateCount, 37);
		System.out.println(stateCount);
		
		for(WebElement ele: ddvCount) 
		{
			String stateNames = ele.getText();
			System.out.println("State Name are: "+stateNames);
		}
		
		
	}

}
