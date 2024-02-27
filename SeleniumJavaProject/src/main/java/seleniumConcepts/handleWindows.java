package seleniumConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleWindows {

	@Test
	public void handleMultipleWindows() throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		System.out.println(driver.getTitle());
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID: " + parent);
		driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
		// driver.findElement(By.xpath("//a[@href='//www.facebook.com']")).click();
		// driver.findElement(By.xpath("//a[@href='//www.yahoo.com']")).click();
		Set<String> allWindows = driver.getWindowHandles();
//		int count = allWindows.size();
//		System.out.println("Total Windows: "+count);
//		
//		for(String child:allWindows) {
//			
//			if(!parent.equalsIgnoreCase(child)) {
//				
//				driver.switchTo().window(child);
//				System.out.println("Child window title is: "+driver.getTitle());
//				Thread.sleep(2000);
//				driver.close();
//			}
//		}

		// driver.switchTo().window(parent);
		// System.out.println("Parent window title is: "+driver.getTitle());

		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		int totalTabs = tabs.size();
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("SeleniumWebdriver");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("Parent window ID: " + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[2][contains(@href, 'www.facebook.com')]")).click();
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vijaybhaskar");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("Parent window ID: " + driver.getTitle());
		driver.quit();

	}

}
