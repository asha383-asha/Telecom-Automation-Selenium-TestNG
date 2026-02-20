package test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dp {
  @Test(dataProvider = "dp")
  public void ope (String a, String b) {
	  System.out.println(a+b);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Testing", "Tools"},
      new Object[] { "Automation", "Tools" },
    };
  }
  
  
}
