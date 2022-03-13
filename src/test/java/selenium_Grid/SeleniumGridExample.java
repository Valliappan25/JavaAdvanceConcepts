package selenium_Grid;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		String URL = "https://google.co.in";
		String node = "http://192.168.1.101:4444/wd/hub/";
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
		
		WebDriver driver = new RemoteWebDriver(new URL(node), dc);
		
		driver.navigate().to(URL);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("facebook");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		
		System.out.println("Selenium gird is Success!!!");
	}

}
