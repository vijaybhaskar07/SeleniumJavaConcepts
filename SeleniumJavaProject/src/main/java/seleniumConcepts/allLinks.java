package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinks {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));		
		
		for (int i=0; i<links.size(); i++) {
			
			System.out.println(links.get(i).getText());
		}

	}

}
