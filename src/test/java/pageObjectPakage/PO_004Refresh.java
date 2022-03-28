package pageObjectPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverPakage.BaseDriver;

public class PO_004Refresh extends BaseDriver {
	
	WebDriver driver= null;
	
	public PO_004Refresh (WebDriver driver) {
		this.driver = driver;
	}

	//By baseURLRefresh = By.linkText("http://www.google.com");
	public void baseURLToRefresh() throws InterruptedException {
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	}
	
}
