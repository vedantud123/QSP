package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vedant/OneDrive/Desktop/Selenium/mtr.html");
		WebElement slv = driver.findElement(By.id("slv"));
		Select s=new Select(slv);
		List<WebElement> alloption = s.getAllSelectedOptions();
		for (WebElement option : alloption) {
			System.out.println(option.getText());
		}	 driver.close();	
	}
}
