package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualsHeightWedth {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		int height1 = username.getSize().getHeight();
		int width1=username.getSize().getWidth();
		WebElement pwd = driver.findElement(By.name("pwd"));
		int height2 = pwd.getSize().getHeight();
		int width2 = pwd.getSize().getWidth();
		if(height1==height2 && width1==width2)
		{
			System.out.println("Height and Width of Username and Password is equal and pass");
		}
		else
			System.out.println("Height and Width of Username and Password is not equaland fail");
		driver.close();
		
	}

}
