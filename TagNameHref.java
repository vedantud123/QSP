package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameHref {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement tagname = driver.findElement(By.tagName("a"));
		WebElement href = driver.findElement(By.xpath("//a[@href='javascript: void(0)']"));
		System.out.println(href);
		System.out.println(tagname);
		driver.close();
		
	}

}
