package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyEnabled {
	
	@Test
	public void verifyButtonEnabled() 
	
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		
		//Method1: isEnabled
		WebElement radioButton = driver.findElement(By.xpath("//div[@id=\"radio-btn-example\"]/fieldset/label[1]/input"));
		
		if(radioButton.isEnabled()) 
		{
			System.out.println("Radio button is enabled. Return: "+radioButton.isEnabled());
		}
		else 
		{
			System.out.println("Radio button is not enabled. Return: "+radioButton.isEnabled());
		}
		
		radioButton.click();
		//driver.quit();
		
		//Method2: isDisplayed		
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		if(checkBox.isDisplayed()) 
		{
			System.out.println("Check box is displayed Return: "+checkBox.isDisplayed());
		}
		else 
		{
			System.out.println("Check box is not displayed Return: "+checkBox.isDisplayed());
		}
		checkBox.click();
		
		if(checkBox.isSelected()) 
		{
			
			System.out.println("Check box is selected Return: "+checkBox.isSelected());
		}
		else 
		{
			System.out.println("Check box is not selected Return: "+checkBox.isSelected());
		}
		
		driver.quit();
	}

}
