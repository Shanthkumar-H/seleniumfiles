package selenium_pgm;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//complete xpath manually
public class D {
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/shant/OneDrive/Desktop/index.html");
			driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("shan");
			driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("shan123");
			driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("9880125933");
		}

	}


