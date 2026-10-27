package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean enable = driver.findElement(By.name("login")).isEnabled();
		if(enable==true)
			System.out.println("Login button is enable and pass");
		else {
			System.out.println("Login Button is not enable and fail");
		}
		driver.close();
		
	}

}
