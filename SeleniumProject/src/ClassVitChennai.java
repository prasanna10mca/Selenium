

	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByClassName;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class ClassVitChennai {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
			WebDriver ob=new ChromeDriver();
			ob.get("https://chennai.vit.ac.in/");
			Actions act= new Actions(ob);
			WebElement academics=ob.findElement(By.xpath("//li[@id='nav-menu-item-138009']//ancestor::a"));
			act.moveToElement(academics);
			WebElement inter=ob.findElement(By.xpath("//li[@id='nav-menu-item-138056']//ancestor::a"));
			act.moveToElement(inter);
			String strText =inter.getText();
			System.out.println(strText);
			act.click().build().perform();
		}
}
