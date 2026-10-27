package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDishIsPresent {

	public static void main(String[] args) throws InterruptedException {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the dish name");
		String text = s1.next();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vedant/OneDrive/Desktop/Selenium/mtr.html");
		Thread.sleep(4000);
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> alloption = s.getOptions();
		int count = 0;
		for(int i=0;i<alloption.size();i++) {
			String text1 = alloption.get(i).getText();
			if(text.equalsIgnoreCase(text1)) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Dish is present");
		}
		else {
			System.out.println("Dish is not present");
		}
		driver.quit();
	}

}
