package org.selenium.robotics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassRobot {
	public static void main(String[] args) throws InterruptedIOException,  AWTException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.facebook.com/");
		Actions  a=new Actions(ob);
		WebElement txtUser=ob.findElement(By.xpath("//input[@id='email']"));
        a.sendKeys(txtUser,"greens").perform();
        a.doubleClick().perform();
        a.contextClick().perform();
        Robot r=new Robot();
		for(int i=0;i<3;i++){
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
}
