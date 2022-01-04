package org.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://www.demo.guru99.com/test/drag-drop.html");
		Actions a = new Actions(obj);
		WebElement src =obj.findElement(By.xpath("//a[text()='5000']"));
		Actions act= new Actions(obj);
		WebElement dest=obj.findElement(By.xpath("//li[@class='placeholder']) [2]"));
		
		a.dragAndDrop(src, dest).perform();
			
	


	}

}
