package seleniumConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownValuesSort {

	@Test
	public static void ddValuesSort() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());

		WebElement selectDD = driver.findElement(By.xpath("//select[@id='searchLanguage']"));

		Select langValues = new Select(selectDD);
		List actualList = new ArrayList();
		List<WebElement> langValuesCount = langValues.getOptions();
		int count = langValuesCount.size();
		System.out.println(count);
		for (WebElement e : langValuesCount) {
			String langNames = e.getText();
			System.out.println("Langauage names are: " + langNames);
			actualList.add(langNames);
		}

		Collections.sort(actualList);

		List temp = new ArrayList();
		temp.addAll(actualList);

		Assert.assertTrue(actualList.equals(temp));
		System.out.println(actualList);

	}
}