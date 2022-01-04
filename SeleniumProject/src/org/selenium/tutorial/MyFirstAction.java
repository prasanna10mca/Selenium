package org.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyFirstAction {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
WebDriver obj = new ChromeDriver();
obj.manage().window().maximize();
obj.get("https://www.greenstechnologys.com/selenium-training-in-chennai.html");

WebElement placeCourses =obj.findElement(By.xpath("//a[text()='COURSES']"));
Actions act= new Actions(obj);
act.moveToElement(placeCourses).perform();

WebElement moveJavaTraining = obj.findElement(By.xpath("//a[text()='Java Training ']"));
System.out.println(moveJavaTraining);
act.moveToElement(moveJavaTraining).perform();

WebElement hibernate = obj.findElement(By.xpath("//a[text()='Hibernate Training']"));
hibernate.click();

}

}

