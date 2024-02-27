package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class fluentWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		// Define FluentWait with customized settings
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);

		// Wait for the element to be visible and clickable
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='WebDriver']")));

		// Perform an action on the element
		System.out.println(element.getText());

		// Close the browser
		driver.quit();
	}
}
