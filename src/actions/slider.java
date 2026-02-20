package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://jqueryui.com/slider/");
		c.manage().window().maximize();
		System.out.println(c.getTitle());
		System.out.println(c.getCurrentUrl());
		c.switchTo().frame(0);
		WebElement s =c.findElement(By.id("slider"));
		Actions act = new Actions (c);
		int x= s.getLocation().x;
		
		act.dragAndDropBy(s, x, -500).build().perform();




		
		
		// TODO Auto-generated method stub

	}

}
