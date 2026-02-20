package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement link =d.findElement(By.linkText("Gmail"));
		Actions act = new Actions(d);
		act.contextClick(link).sendKeys("L").build().perform();
		



		
	}

}
