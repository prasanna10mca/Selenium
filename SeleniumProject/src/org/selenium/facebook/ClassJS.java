package org.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassJS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtUser=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','greens')", txtUser);
		Object e=js.executeScript("return arguments[0].getAttribute('value')",txtUser);
		System.out.println(e);
		WebElement txtPass=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','greens@123')", txtPass);
		Object e1=js.executeScript("return arguments[0].getAttribute('value')",txtPass);
		System.out.println(e1);
		WebElement btnLogin=driver.findElement(By.name("login"));
		btnLogin.click();
		
	
}
}