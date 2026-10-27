package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollToPerticularElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		int y = driver.findElement(By.xpath("//h2[@class='a-color-base as-title-block-left']")).getLocation().getY();
		Actions a=new Actions(driver);
		a.scrollByAmount(0, y).perform();
	}

}
