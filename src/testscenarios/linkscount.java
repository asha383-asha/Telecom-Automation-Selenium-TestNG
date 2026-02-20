package testscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {
    WebDriver d;   

    public void Opening_Browser() {
    	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
        d = new ChromeDriver();  
        d.get("https://demo.guru99.com/test/newtours/register.php");
        d.manage().window().maximize();
    }

    public void Title() {
        System.out.println(d.getTitle());
    }

    public void url() {
        System.out.println(d.getCurrentUrl());
    }

    // clicking on selenium link
    public void LinkCount() {
        // click Selenium link
        WebElement l = d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
        l.click();

        //  under Selenium link
        WebElement li = d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
        List<WebElement> lin = li.findElements(By.tagName("a"));
        System.out.println(lin.size());

        for (int i = 0; i < lin.size(); i++) {
            System.out.println(lin.get(i).getText());
            lin.get(i).click();
            System.out.println(d.getTitle());
            System.out.println(d.getCurrentUrl());

            d.navigate().back();

            // re-locate elements after navigation 
            l = d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
            l.click();
            li = d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
            lin = li.findElements(By.tagName("a"));
        }
    }

    public static void main(String[] args) {
        linkscount a1 = new linkscount();
        a1.Opening_Browser();
        a1.Title();
        a1.url();
        a1.LinkCount();
        a1.d.quit();   
    }
}