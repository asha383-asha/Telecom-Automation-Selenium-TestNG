package day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class first_tng {
	int a =10;
	  int b=20;

  @BeforeMethod
  public void add(){
	  
	  System.out.println( a+b);
	  
	  
	  
  }
  @Test
  public void sub(){
	  
	  System.out.println(a-b);
	  
  
}
  @Test
  public void mul(){
	  
	  System.out.println(a*b);
	  
  }
  @AfterMethod
  public void div(){
	  
	  System.out.println(a/b);
	  
  }
  }
	  
