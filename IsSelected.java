package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean selected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(selected==true)
			System.out.println("Checkbox is selected and pass");
		else
			System.out.println("Checkbox is not selected and fail");
		driver.close();
	}

}
