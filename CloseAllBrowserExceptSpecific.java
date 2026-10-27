package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserExceptSpecific {

	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the browser which you don't want to close");
		String z = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
			Thread.sleep(5000);
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(!(title.equals(z))) {
				driver.close();
			}
		}
		
	}
}
