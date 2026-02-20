package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoguru {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://demo.guru99.com/test/newtours/register.php");
		c.manage().window().maximize();
		System.out.println(c.getTitle());
		System.out.println(c.getCurrentUrl());
		WebElement a =c.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
		a.click();
		Thread.sleep(2000);
		List<WebElement>a1 =a.findElements(By.tagName("a"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i).getText());
			
			if(a1.get(i).isSelected()) {
				System.out.println(c.getTitle());
				System.out.println(c.getCurrentUrl());
				c.navigate().back();
				Thread.sleep(2000);
			
				
				
			}
			
		}
	    
		
		
	}

}
