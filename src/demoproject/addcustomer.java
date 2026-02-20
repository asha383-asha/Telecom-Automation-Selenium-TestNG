package demoproject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	

	public class addcustomer extends baseclass {
		public String CustomerID;
		
		@Test(priority=1)
		public void addcustomer()  {

	    
	        
	        openTelecomProject();

	        d.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();

	        d.findElement(By.xpath("//label[text()='Done']")).click();
	        d.findElement(By.id("fname")).sendKeys("Asha");
	        d.findElement(By.id("lname")).sendKeys("Jyothi");
	        d.findElement(By.id("email")).sendKeys("asha@gmail.com");
	        d.findElement(By.name("addr")).sendKeys("Hyderabad");
	        d.findElement(By.id("telephoneno")).sendKeys("9876543210");

	        d.findElement(By.name("submit")).click();
	        
	        CustomerID  = d.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]/h3")).getText();
	        
	        System.out.println("Generated Customer ID: " + CustomerID);
	        //home
	        
	        d.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();
	      

	        
	    }
	}

	