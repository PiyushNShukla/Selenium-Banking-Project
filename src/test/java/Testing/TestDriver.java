package Testing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ibm.framework.driver.DriverFactory;

public class TestDriver {
	
	@Test
	public void openSite() throws InterruptedException {
		DriverFactory.initDriver();
		
	}
}
