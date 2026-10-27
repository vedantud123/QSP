package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		boolean z = driver.findElement(By.id("demo")).isDisplayed();
		if(z==true)
		{
			System.out.println("you pressed cancel button is displayed and pass");
		}
		else
		{
			System.out.println("you pressed cancel button is not displayed and fail");
		}
		driver.quit();
	}

}
