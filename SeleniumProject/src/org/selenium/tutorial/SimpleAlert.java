
package org.selenium.tutorial;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleAlert {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
WebDriver obj = new ChromeDriver();
obj.manage().window().maximize();
obj.get("https://www.irctc.co.in/nget/train-search");
//Thread.sleep(5000);
obj.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Alert a = obj.switchTo().alert();
  a.accept();
  }
}
  