package selenium_pgm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class C {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D://selenium files//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.fb.com");
		}
}
