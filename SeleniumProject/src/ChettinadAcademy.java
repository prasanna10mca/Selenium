


	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByClassName;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class ChettinadAcademy {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
			WebDriver ob=new ChromeDriver();
			ob.get("https://care.edu.in/");
			Actions act= new Actions(ob);
			WebElement admissions=ob.findElement(By.xpath("//li[@id='menu-item-1368']//ancestor::a"));
			act.moveToElement(admissions);
			WebElement nursing=ob.findElement(By.xpath("//li[@id='menu-item-1360']//ancestor::a"));
			act.moveToElement(nursing);
			String strText =nursing.getText();
			System.out.println(strText);
			act.click().build().perform();

			//WebElement attributeValue=ob.findElement(By.xpath("//input[@name='email']"));
			//String strAttribute = attributeValue.getAttribute("class");
			//System.out.println(strAttribute);

			
	        
		}
		
	}

