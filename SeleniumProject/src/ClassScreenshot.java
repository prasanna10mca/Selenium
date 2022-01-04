


	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByClassName;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ClassScreenshot

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
			WebDriver ob=new ChromeDriver();
			ob.get("https://www.facebook.com/");
			Takesreenshot ts=(TakesScreenshot)driver;
			
			ts.

}
}