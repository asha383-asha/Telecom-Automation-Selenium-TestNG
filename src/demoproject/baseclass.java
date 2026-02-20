package demoproject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclass {

	
	     static WebDriver d;
	     @BeforeClass

	    public void setup() {

	        d = new ChromeDriver(); // No need System.setProperty in Selenium 4
	        d.manage().window().maximize();
	        
	        d.get("https://demo.guru99.com/test/newtours/register.php");
	    }

	    
	
	    
	    
//telecom
		    public void openTelecomProject() {
		        d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
		    }
		    
		    @AfterClass
		    
		    public void closeBrowser() {

		        if (d != null) {
		            try {
		                d.quit();
		            } catch (Exception e) {
		                System.out.println("Browser already closed");
		            }
		        }
		    }

		    
		}
	
