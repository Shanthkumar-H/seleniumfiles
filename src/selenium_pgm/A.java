package selenium_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.name("email")).sendKeys("shantuhiremath1432@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("shan123");
		driver.findElement(By.name("login")).click();
	}

}
