package testscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {
    WebDriver d;   

    public void Opening_Browser() {
    	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
        d = new ChromeDriver();  
        d.get("https://echoecho.com/htmlforms10.htm");
        d.manage().window().maximize();
    }

    public void Title() {
        System.out.println(d.getTitle());
    }

    public void url() {
        System.out.println(d.getCurrentUrl());
    }
    public void radiobutton() {
    	WebElement R1 = d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
    	List<WebElement> R2= R1.findElements(By.tagName("input"));
    	System.out.println(R2.size());
    	for ( int i=0; i< R2.size(); i++) {
    		System.out.println(R2.get(i).getAttribute("checked")+""+R2.get(i).getAttribute("value"));
    	}
    	
    }
    

    
        
        
        
public static void main(String [] args) {
	radiobuttons a1 = new radiobuttons();
	a1.Opening_Browser();
	a1.Title();
	a1.url();
	a1.radiobutton();
	
}

}


