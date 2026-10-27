package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSizeFont {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String size = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String font = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		System.out.println(size);
		System.out.println(font);
		driver.quit();
	}
}
