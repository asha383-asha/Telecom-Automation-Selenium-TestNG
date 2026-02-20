package test;

import org.testng.annotations.AfterTest;

public class logout extends opertions {
	
	@AfterTest
	public void log_out() {
	  d.close();
  }

}
