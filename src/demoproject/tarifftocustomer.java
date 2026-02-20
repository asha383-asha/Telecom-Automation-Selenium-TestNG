package demoproject;



	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

	public class  tarifftocustomer extends addtariffinplan {
		
		@Test(priority=3)

	    public  void tarifftocustomer() {
	    	JavascriptExecutor js = (JavascriptExecutor)d;
	    	
	    		
	       
	        
	        openTelecomProject();
	        d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
		    
	    	 
	        d.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();

	        d.findElement(By.id("customer_id")).sendKeys(CustomerID);
	        
	      
	        //
	       // js.executeScript("window.scrollBy(0,50)");
	        
		       
	        
	        d.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).click();
	        
	        js.executeScript("window.scrollBy(0,50)");
	        d.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[2]/input")).click();
	        
	        
	        
	        
	        
	        
	        
	       
	        //home
	        
	        d.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
	        
	       

	    }
	    
	}


