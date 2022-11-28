package selenium_pgm;
//lauching fb in chrome browser
//using full xpath
import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class E{
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.fb.com");
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("shantuhiremath1432@gmail.com");
   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("shan123");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/form/div/button")).click();	
		}

	}

