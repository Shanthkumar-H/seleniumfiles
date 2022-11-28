package selenium_pgm;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class G {
//partial xpath
//even after changin heirarchy change this vl work
	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/shant/OneDrive/Desktop/index1.html");
			driver.findElement(By.xpath("//*[@id=\'cityname\']")).sendKeys("banglore");
			driver.findElement(By.xpath("//*[@id=\'name\']")).sendKeys("shan");
			driver.findElement(By.xpath("//*[@id=\'mobile\']")).sendKeys("9880125933");
			}

		}

