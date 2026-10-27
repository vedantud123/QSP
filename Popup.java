package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s=new Select(year);
		s.selectByValue("2000");
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[24]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845698450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean display = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(display==true)
		{
			System.out.println("Please enter valid Policy No is display and pass");
		}
		else {
			System.out.println("Please enter valid Policy No is not display and fail");
		}
		driver.quit();	
	}
}
