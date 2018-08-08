package facebook.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\USP\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.close();

	}

}
