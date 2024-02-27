package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertWindow {

	@Test
	public void alertWindowHandle() throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		// Alert alert = driver.switchTo().alert();
		String actualMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message is " + actualMessage);
		driver.switchTo().alert().accept();
		String expectedMessage = "I am a JS Alert";
		Assert.assertEquals(actualMessage, expectedMessage);
		driver.quit();

	}
    
	@Test
	public void alertWindowConfirm() throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		// Alert alert = driver.switchTo().alert();
		String actualMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message is " + actualMessage);
		driver.switchTo().alert().dismiss();
		String expectedMessage = "I am a JS Confirm";
		Assert.assertEquals(actualMessage, expectedMessage);
		driver.quit();
		
	}
	
	@Test
	public void alertWindowPrompt() throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		// Alert alert = driver.switchTo().alert();
		String actualMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message is " + actualMessage);
		driver.switchTo().alert().sendKeys("Vijay");
		driver.switchTo().alert().accept();
		String expectedMessage = "I am a JS prompt";
		Assert.assertEquals(actualMessage, expectedMessage);
		driver.quit();
		
	}

}
