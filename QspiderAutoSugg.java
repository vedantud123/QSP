package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderAutoSugg {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("qSpiders");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		Thread.sleep(7000);
		for(int i=0;i<allsugg.size();i++)
		{	
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(allsugg.size()-1).click();
		driver.quit();
		
		
	
}
}
