package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cross_browser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WebDriver d;
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.firefox.com/en-GB/?utm_campaign=SET_DEFAULT_BROWSER");
		d.manage().window().maximize();
		
		String op ;
		System.out.println("Enter the browser name" );
		
		op = sc.next();
		System.out.println("browser which you selected is " );
		switch(op){
			case "chrome":
				System.out.println("chome is opened" );
				
				break;
				
			case "firefox":
				System.out.println("fire fox is opened" );
				break;
			
			case "IE":
				System.out.println("IE is oepened" );
				break;

			default:
				System.out.println("invalid browser " );
		}
	}
}
	






		// TODO Auto-generated method stub

	
