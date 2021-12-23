package org.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumAttribute\\drivers\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.tutorialspoint.com/market/login.jsp?v=1.3");

		WebElement txtUser=ob.findElement(By.id("user_email"));
        txtUser.sendKeys("prasanna10mca@gmail.com");
       
        
        WebElement txtPass=ob.findElement(By.id("user_password"));
        txtPass.sendKeys("123456");

        WebElement loginBtn=ob.findElement(By.id("user_login"));
        
        loginBtn.click();
	}

}
