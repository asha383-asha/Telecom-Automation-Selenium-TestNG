package demoproject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


	
	public class addtariffinplan extends addcustomer{
		@Test(priority=2)

	    public void  addtariffinplan() {
	    		
	        openTelecomProject();

	        d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
		    
	        
	        

	        //addtariff
	        d.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")).click();

	        d.findElement(By.id("rental1")).sendKeys("500");
	        d.findElement(By.id("local_minutes")).sendKeys("100");
	        d.findElement(By.id("inter_minutes")).sendKeys("50");
	        d.findElement(By.id("sms_pack")).sendKeys("100");
	        d.findElement(By.id("minutes_charges")).sendKeys("2");
	        d.findElement(By.id("inter_charges")).sendKeys("3");
	        d.findElement(By.id("sms_charges")).sendKeys("1");

	        d.findElement(By.name("submit")).click();
	        //home
	        
	        d.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
	        
	       


	        
	        
	    }
	    
	}

