

	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByClassName;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ClassLicious {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
			WebDriver ob=new ChromeDriver();
			ob.get("https://www.licious.in/");
			WebElement txtUser=ob.findElement(By.xpath("//input[@class='search-input']"));
			String strText =txtUser.getText();
			System.out.println(strText);

			//WebElement attributeValue=ob.findElement(By.xpath("//input[@name='email']"));
			//String strAttribute = attributeValue.getAttribute("class");
			//System.out.println(strAttribute);

			
	        
		}
		
	}

