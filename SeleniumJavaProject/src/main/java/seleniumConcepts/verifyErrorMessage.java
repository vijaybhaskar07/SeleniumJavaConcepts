package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyErrorMessage {

	@Test
	public void invalidLoginErrorMessage()

	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin1234");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		String actualError = driver.findElement(By.xpath("//p[text()='Invalid credentials']"))
				.getAttribute("innerHTML");
		String expectedError = "Invalid credentials";
		Assert.assertEquals(actualError, expectedError);
		System.out.println("Verified the error message");
		Assert.assertTrue(actualError.contains(expectedError));
		System.out.println("Verified the error message");

	}

}
