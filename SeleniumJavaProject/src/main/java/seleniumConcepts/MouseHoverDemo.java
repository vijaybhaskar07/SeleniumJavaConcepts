package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		System.out.println(driver.getTitle());		
	    WebElement ele = driver.findElement(By.xpath("//button[text() ='Automation Tools']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
		List <WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int count = links.size();
		for(int i=0; i<count; i++) {
			
		WebElement ele1 = links.get(i);
		String text = ele1.getAttribute("innerHTML");
		System.out.println("Links name: " +text);
		if(text.equalsIgnoreCase("Appium")) {
			ele1.click();
			break;
		}
	
			
		}
		

	}

}
