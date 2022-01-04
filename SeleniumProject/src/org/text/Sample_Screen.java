package org.text;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Screen {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Selenium\\SeleniumProject\\lib\\Screenshot");
		FileUtils.copyFile(src, dest);
		

}
}