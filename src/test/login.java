package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class login {
	WebDriver d;
  
  @BeforeTest
  public void log_in() {
	  
		  	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			d = new ChromeDriver();
			d.get("https://www.amazon.in/");
			d.manage().window().maximize();
  }
  
  @Test
  public void title() {
	  System.out.println(d.getTitle());
  }

}


