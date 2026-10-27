package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vedant/OneDrive/Desktop/Selenium/mtr.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s=new Select(list);
		List<WebElement> options = s.getOptions();
		ArrayList a=new ArrayList();
		a.add(options);
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			boolean flag = false;
			for(int j=i+1;j<a.size();j++)
			{
				if(options.get(i).getText()==options.get(j).getText())
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(options.get(i).getText());
			}
			driver.close();
		}
	}
}
