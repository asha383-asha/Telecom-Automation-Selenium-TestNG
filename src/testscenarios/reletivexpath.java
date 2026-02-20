package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class reletivexpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	       ChromeDriver  d = new ChromeDriver();  
	        d.get("https://demo.guru99.com/test/newtours/register.php");
	        d.manage().window().maximize();
	        System.out.println(d.getTitle());
	        JavascriptExecutor js = (JavascriptExecutor) d;
			//js.executeScript("arguments[0].scrollIntoview()", );		
			//js.executeScript("window.scrollBy(0,500)"); //scroll down
	  
	        System.out.println(d.getCurrentUrl());
	        d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mercury");
	        d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("mercury");
	      
	        d.findElement(By.xpath("//input[@name='phone']")).sendKeys("123654785");
	        d.findElement(By.xpath("//input[@name='userName']")).sendKeys("juythiasha");
	        d.findElement(By.xpath("//input[@name='address1']")).sendKeys("kurnool");
	        d.findElement(By.xpath("//input[@name='city']")).sendKeys("adoni");
	        d.findElement(By.xpath("//input[@name='state']")).sendKeys("ap");
	        d.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("518308");
	        js.executeScript("window.scrollBy(0,200)");
	        d.findElement(By.xpath("//input[@name='country']")).sendKeys("INDIA");
	        d.findElement(By.xpath("//input[@name='email']")).sendKeys("mercury");
	        d.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	        d.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("mercury");
	        

	        
	        
	        
	        
	        Thread.sleep(2000);
	      
	        d.findElement(By.xpath("//input[@name='submit']")).click();
	}

}
