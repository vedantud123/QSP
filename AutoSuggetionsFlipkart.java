package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionsFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
		int count = allsugg.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
			System.out.println(text); 
			
		}
		allsugg.get(0).click();
		driver.quit();
	}

}