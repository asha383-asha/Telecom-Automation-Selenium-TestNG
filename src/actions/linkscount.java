package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement button=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
		button.click();
		WebElement links=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		List<WebElement>links1=links.findElements(By.tagName("a"));
		System.out.println(links1.size());
		for(int i=0;i<links1.size();i++)
		{
			System.out.println(links1.get(i).getText());
			links1.get(i).click();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			
			d.get("https://demo.guru99.com/test/newtours/index.php");
			WebElement button1=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
			button1.click();
			links=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
			links1=links.findElements(By.tagName("a"));
				
		}
	}
}
		// TODO Auto-generated method stub

	
