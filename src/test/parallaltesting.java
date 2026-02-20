package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parallaltesting {

	public static void main(String[] args) throws InterruptedException {
		
			//Scanner sc = new Scanner(System.in);
			WebDriver d;
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			d = new ChromeDriver();
			d.get("https://www.flipkart.com/");
			d.manage().window().maximize();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			d.close();
			Thread.sleep(2000);
			
			//System.setProperty("webdriver.firefox.driver","D://chromedriver.exe");
			d = new FirefoxDriver();
			d.get("https://www.amazon.in/");
			d.manage().window().maximize();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			d.close();
			
			

	}

}
