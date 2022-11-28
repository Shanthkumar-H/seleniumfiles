package selenium_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//linkText attribute and partial linktext
public class H {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Forgotten ")).click();
	}
	}
