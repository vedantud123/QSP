package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("./Data.docx/commondata.property");
		Properties p=new Properties();
		p.load(fin);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		/*WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.partialLinkText("Login")).click();
	*/}
}
