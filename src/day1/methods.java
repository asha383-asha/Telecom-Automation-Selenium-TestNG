package day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class methods {
	WebDriver d;
	
	
  
  
  @BeforeClass
  public void login() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		//System.out.println(c.getTitle());
		//System.out.println(c.getCurrentUrl());
	  
	  
  }
  
  
  @Test(priority=1)
  public void title() {
	  System.out.println(d.getTitle());
	  
  }
  @Test(priority=2)
  public void URL() {
	  System.out.println(d.getCurrentUrl());
	  
	  
  }

  @AfterClass()
  public void logout() {
	  d.close();
  }

}
