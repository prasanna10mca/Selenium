package org.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.facebook.com/");
		WebElement txtUser=ob.findElement(By.xpath("//input[@id='email']"));
        txtUser.sendKeys("facebook");
        WebElement txtPass=ob.findElement(By.xpath("//input[@id='pass']"));
        txtPass.sendKeys("1234567");
        
	}
	
}