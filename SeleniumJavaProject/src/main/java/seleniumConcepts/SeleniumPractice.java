package seleniumConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPractice {

	@Test
	public static void dropDownValues() {

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		
		WebElement languageSelect = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		List actualList = new ArrayList(); 
		Select langValue = new Select(languageSelect);
		List<WebElement> langValuesCount = langValue.getOptions();
	    int count =	langValuesCount.size();
	    System.out.println(count);
	   
		for (WebElement e: langValuesCount) {
			String langNames = e.getText();
			actualList.add(langNames);
			
		}
		Collections.sort(actualList);
		List temp = new ArrayList();
		temp.addAll(actualList);
		
		
		Assert.assertTrue(actualList.equals(temp));
		System.out.println(actualList);
		

		
	 }
		
	}


