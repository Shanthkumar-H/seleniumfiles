package selenium_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//operating dropdown list with 4 options.

public class J {
	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shant/OneDrive/Desktop/options.html");
		WebElement element = driver.findElement(By.xpath("//*[@id='cars']"));
		Select s=new Select(element);
		s.selectByIndex(1);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}}
