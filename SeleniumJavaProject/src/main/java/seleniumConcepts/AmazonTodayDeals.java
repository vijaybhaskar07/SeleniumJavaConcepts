package seleniumConcepts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTodayDeals {

	@Test
	public void getTodaysDeals() {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
//		WebElement ele1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(ele1).perform();
//		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("vijaybhaskar07@gmail.com");
				
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
		driver.findElement(By.xpath("//a[@data-id='95385C000FD7E4E2D8F69FA5B305F118']")).click();
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']"));
		int count = products.size();
		System.out.println(count);
		for(WebElement ele:products) {
			System.out.println(ele.getText());
		}
		

	}

}
