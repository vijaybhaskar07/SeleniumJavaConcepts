package seleniumConcepts;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.getTitle();
		WebElement searchField = driver.findElement(By.name("q"));		
		searchField.sendKeys("Nataraj Patil");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.click();
		Thread.sleep(3000);
		List<WebElement> searchResults = driver.findElements(By.tagName("a"));
		for(int i=0; i<searchResults.size(); i++) {
			System.out.println(searchResults.get(i).getText());			
		}
		Thread.sleep(3000);
		WebElement searchResultVerify = driver.findElement(By.xpath("//a[@href[1]='https://medium.com/@natarajpatil']/h3"));
		searchResultVerify.click();
		

	}

}
