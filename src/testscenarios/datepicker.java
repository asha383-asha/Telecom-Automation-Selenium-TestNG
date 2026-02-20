package testscenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
       ChromeDriver  d = new ChromeDriver();  
        d.get("https://jqueryui.com/datepicker/");
        d.manage().window().maximize();
        System.out.println(d.getTitle());
  
        System.out.println(d.getCurrentUrl());
        d.switchTo().frame(0);
        d.findElement(By.id("datepicker")).click();
        d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a"));
        File src =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("c://a6.png"));
        
        
    }

	}


