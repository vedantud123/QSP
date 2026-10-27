package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement target = driver.findElement(By.partialLinkText("Login"));
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}

}
