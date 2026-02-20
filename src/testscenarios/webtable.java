package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	WebDriver d;   

    public void Opening_Browser() {
    	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
        d = new ChromeDriver();  
        d.get("https://testautomationpractice.blogspot.com/");
        d.manage().window().maximize();
    }

    public void Title() {
        System.out.println(d.getTitle());
    }

    public void url() {
        System.out.println(d.getCurrentUrl());
    }
    public void Webtable() {
    	////*[@id="HTML1"]/div[1]/table/tbody/tr[2]/td[1]
    	/// //*[@id="HTML1"]/div[1]/table/tbody/tr[7]/td[1]
    	JavascriptExecutor js = (JavascriptExecutor) d ;
	//js.executeScript("arguments[0].scrollIntoview()" );		
	js.executeScript("window.scrollBy(0,1700)"); //scroll down
    
    	String a ="//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[";
    	String b ="]/td[1]";
    	for (int i=2; i<=7; i++) {
    		String c=d.findElement(By.xpath(a+i+b)).getText();
    		System.out.println(c);
    		
    		
    	}
    	
    	
    	
    	
    	
    	}

public static void main(String [] args) {
	webtable a1 = new webtable();
	a1.Opening_Browser();
	a1.Title();
	a1.url();
	a1.Webtable();
}
	
	
    	
    }
    
    
    
	


