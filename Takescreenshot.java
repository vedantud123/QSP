
package qsp;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Takescreenshot {

    public static void main(String[] args) throws Exception {

        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\chromedriver.exe"
        );

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            Path folder = Paths.get("screenshots");
            Files.createDirectories(folder);

            Path destination = folder.resolve("google.png");

            Files.copy(source.toPath(), destination);

            System.out.println("Screenshot saved at: "
                    + destination.toAbsolutePath());

        } finally {
            driver.quit();
        }
    }
}
