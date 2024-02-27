package seleniumConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
      boolean submiButton =  driver.findElement(By.xpath("//button[text()=' Login ']")).isEnabled();
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        String homePageName = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        System.out.println(homePageName);
        System.out.println(driver.getCurrentUrl());       
        driver.quit();
	}

}
