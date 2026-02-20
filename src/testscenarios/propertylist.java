package testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertylist {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream f= new FileInputStream("C:\\Users\\ASHA\\OneDrive\\Desktop\\testNG\\src\\testscenarios\\a1.properties");
		Properties p1 =new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	    ChromeDriver  d = new ChromeDriver();  
	    d.get(p1.getProperty("url"));
	    d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
	    d.findElement(By.xpath("//input[@name='password']")).sendKeys(p1.getProperty("password"));
	    
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    
	    
		
	}
}

