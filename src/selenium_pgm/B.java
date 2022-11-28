package selenium_pgm;

import org.openqa.selenium.opera.OperaDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver","D://selenium files//operadriver_win64//operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("http://www.fb.com");
	}
}
