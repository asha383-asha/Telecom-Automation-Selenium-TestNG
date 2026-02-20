package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://jqueryui.com/menu/");
		c.manage().window().maximize();
		System.out.println(c.getTitle());
		System.out.println(c.getCurrentUrl());
		c.switchTo().frame(0);
		
		
		WebElement music =c.findElement(By.id("ui-id-9"));
		
		music.click();
		Thread.sleep(2000);
	
		WebElement jazz =c.findElement(By.id("ui-id-13"));
		jazz.click();
		Thread.sleep(2000);
		
		WebElement modern =c.findElement(By.id("ui-id-16"));
		modern.click();
		
		
		Actions act = new Actions (c);
		act.moveToElement(music).moveToElement(jazz).moveToElement(modern).build().perform();

		
		
		
		



		
		// TODO Auto-generated method stub

	}

}
