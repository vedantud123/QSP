package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabHeading {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allwd = driver.getWindowHandles();
		for (String wd : allwd) {
			driver.switchTo().window(wd);
			String title = driver.getTitle();
			if(title.equals("actiTIME Online Terms of Service")) {
				List<WebElement> allheading = driver.findElements(By.xpath("//h2"));
				for(int i=0;i<allheading.size();i++) {
					String t1 = allheading.get(i).getText();
					System.out.println(t1);
				}
			}
			driver.close();
		}
	}
}