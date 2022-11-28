package selenium_pgm;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//reading file properties
public class I {
	
	public static void main(String[] args) {
		try {
	FileInputStream fis =new FileInputStream("D:\\java projects\\selenium_pgm\\src\\objectRepository.properties");		
	Properties prop= new Properties();	
	prop.load(fis);		
	System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.fb.com");		
	 driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("shantuhiremath1432@gmail.com");
	  driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("shan123");
	driver.findElement(By.xpath(prop.getProperty("login"))).click();
	Thread.sleep(3000);
	driver.navigate().back();
		} catch (Exception e) {
				}
	}
	}

