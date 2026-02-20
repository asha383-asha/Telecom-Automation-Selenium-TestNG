package demoproject;



	import org.openqa.selenium.By;
import org.testng.annotations.Test;

	public class paybilling extends tarifftocustomer {
		@Test(priority=4)
		public void paybilling() {

	   
	        
	        
	        openTelecomProject();
	        
	        d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
	        
//paybilling
	        d.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a")).click();

	        d.findElement(By.id("customer_id")).sendKeys(CustomerID);
	        d.findElement(By.name("submit")).click();
	        d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();

	        
	       
	    }
	}
	


