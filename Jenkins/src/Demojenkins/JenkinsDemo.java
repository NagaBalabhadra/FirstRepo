package Demojenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class JenkinsDemo {
	public static WebDriver driver;
  @Test
  public void testJenkins() {
	  
	  System.out.println("First Jenkins job");
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\lib\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
  }
}
