package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vedant/OneDrive/Desktop/Selenium/mtr.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s=new Select(list);
		List<WebElement> options = s.getOptions();
		for (WebElement element : options) {
		System.out.println(element.getText());
		}
		driver.close();
	}

}
